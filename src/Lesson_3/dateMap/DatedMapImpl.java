package Lesson_3.dateMap;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DatedMapImpl implements DatedMap{
    Map<String, String> datedMap = new HashMap<>();
    Map<String, Date> elementDate = new HashMap<>();

    @Override
    public void put(String key, String value) {
        datedMap.put(key, value);
        elementDate.put(key, new Date());
    }

    @Override
    public String get(String key) {
        return datedMap.get(key);
    }

    @Override
    public boolean containsKey(String key) {
        return datedMap.containsKey(key);
    }

    @Override
    public void remove(String key) {
        datedMap.remove(key);
        elementDate.remove(key);
    }

    @Override
    public Set<String> keySet() {
        return datedMap.keySet();
    }

    @Override
    public Date getKeyLastInsertionDate(String key) {
        if(elementDate.containsKey(key)){
            return elementDate.get(key);
        }else {
            return null;
        }
    }
}
