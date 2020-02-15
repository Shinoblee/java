package com.shinoblee.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add(0, "!");
        Collections.addAll(list, "a", "b", "c", "a");
//        list.set(0, "a+");
//        list.remove(0);
//        System.out.println(list.indexOf("a"));
//        System.out.println(list.lastIndexOf("a"));
        System.out.println(list.subList(0, 2));
    }
}
