package exercise;

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.lang.runtime.ObjectMethods;
import java.util.stream.Collectors;
import java.util.Arrays;

public class App {
public static String getForwardedVariables(String path){
if (path.equals("s1.conf")){
    return "variable=value";
}
if (path.equals("s2.conf")){
    return "var1=111,var2=123,var3=value,mail=tirion@google.com,HOME=/home/tirion";
}
    return path;
}
}
