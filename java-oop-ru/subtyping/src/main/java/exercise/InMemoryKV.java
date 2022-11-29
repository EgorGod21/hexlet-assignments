package exercise;

import java.util.Map;
import java.util.HashMap;

public class InMemoryKV implements KeyValueStorage{
    private Map<String,String> map;

    public InMemoryKV(Map<String, String> map) {
        this.map=new HashMap<>(map);
    }

    @Override
    public void set(String key, String value) {
        this.map.put(key, value);
    }

    @Override
    public void unset(String key) {
      this.map.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return this.map.getOrDefault(key,defaultValue);
    }

    @Override
    public void setMap(Map<String, String> map) {
        this.map=map;
    }

    @Override
    public Map<String, String> toMap() {
        return this.map;
    }
}
