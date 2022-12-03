package exercise;

import javax.swing.text.html.HTML;
import java.util.Map;
import java.util.stream.Collectors;

public class SingleTag extends Tag {


    public SingleTag(String name, Map<String, String> map) {
        super(name,map);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("<");
        sb.append(name);
       String m=map.entrySet().stream()
               .map(i->String.format(" %s=\"%s\"",i.getKey(),i.getValue()))
               .collect(Collectors.joining());
       sb.append(m);
        return sb.append(">").toString();
    }
}
