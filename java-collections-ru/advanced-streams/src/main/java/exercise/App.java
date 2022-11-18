package exercise;

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.lang.runtime.ObjectMethods;
import java.util.stream.Collectors;
import java.util.Arrays;

public class App {
public static String getForwardedVariables(String path){
    String[] lines = path.split("\n");
    return Arrays.stream(lines)
            .filter(x->x.startsWith("environment="))
            .map(x->x.replaceAll("environment=\"",""))
            .map(x->x.replaceAll("\"",""))
            .map(s->s.split(","))
            .flatMap(s->Arrays.stream(s))
            .filter(s->s.startsWith("X_FORWARDED_"))
            .map(s->s.replaceAll("X_FORWARDED_",""))
            .collect(Collectors.joining(","));



}}
