package io.codelex.collections.practice.phonebook;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectoryTreeMap {

    private TreeMap<String, String> data;

    public PhoneDirectoryTreeMap() {
        data = new TreeMap<>();
    }

    public String getNumber(String name) {
        return data.get(name);
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null)
            throw new IllegalArgumentException("name and number cannot be null");
        data.put(name, number);
    }

    public void print() {
        for (Map.Entry<String, String> entry : data.entrySet())
            System.out.println(entry.getKey() + ":  " + entry.getValue());
    }

    @Override
    public String toString() {
        return "PhoneDirectoryTreeMap{" +
                "data=" + data +
                '}';
    }
}
