package io.codelex.collections.practice.phonebook;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectory {
    private TreeMap<String, String> data;

    public PhoneDirectory() {
        data = new TreeMap<>();
    }

    public TreeMap<String, String> getData() {
        return data;
    }

    private boolean find(String name) {
        for (Map.Entry<String, String> pair : data.entrySet()) {
            return data.containsKey(name);
        }
        return false;
    }

    public String getNumber(String name) {
        if (!find(name)) {
            return null;
        } else {
            return data.get(name);
        }
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        if (find(name)) {
            data.replace(name, number);
        } else {
            data.put(name, number);
        }
    }

}
