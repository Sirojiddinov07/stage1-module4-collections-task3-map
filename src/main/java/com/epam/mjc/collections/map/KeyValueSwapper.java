package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> res = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            Integer newV = entry.getKey();
            String newK = entry.getValue();
            if (!res.containsKey(newK))
                res.put(newK, newV);
            else if (res.get(newK) > newV)
                res.put(newK, newV);
        }
        return res;
    }
}