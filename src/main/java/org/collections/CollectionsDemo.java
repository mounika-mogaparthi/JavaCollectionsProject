package org.collections;

import java.util.ArrayList;
import java.util.Collection;


public class CollectionsDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("banana");
        collection.add("mickey");
        collection.add("snoopy");
        System.out.println(collection);
        collection.remove("banana");
        System.out.println(collection);
        collection.forEach(x-> System.out.println(x));
        collection.clear();
        System.out.println(collection);

    }
}
