package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class PairedTag extends Tag{

    private String body;
    private List<Tag> list;

    public PairedTag(String name, Map<String, String> map, String body, List<Tag> list) {
        super(name,map);
        this.body = body;
        this.list = list;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("<");
        String m=map.entrySet().stream()
                .map(i->String.format(" %s=\"%s\"",i.getKey(),i.getValue()))
                .collect(Collectors.joining());
        sb.append(name).append(m).append(">").append(body);
        String l=list.stream()
                        .map(x->x.toString())
                                .collect(Collectors.joining());

        sb.append(l);
        return sb.append(String.format("</%s>",name)).toString();
    }
}
