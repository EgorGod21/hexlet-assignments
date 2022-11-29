package exercise;

import java.util.Map;

interface KeyValueStorage {
    void set(String key, String value);
    void unset(String key);
    String get(String key, String defaultValue);
    void setMap(Map<String,String> map);
    Map<String, String> toMap();
}
