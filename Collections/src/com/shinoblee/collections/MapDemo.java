package com.shinoblee.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void show() {
//        List<Customer> customers = new ArrayList<>();
        //Cost of Algorithm O(n) - O(1000000)
//        for (var customer : customers)
//            if (customer.getEmail() == "e1")
//                System.out.println("Found!");
        //Java: Maps
        //C#: Dictionary
        //Python: Dictionary
        //Javascript: Objects
        //var peron = {name: "a"}

        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");
        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c1);

        var unknown = new Customer("Unknown", "");
//        var customer = map.get("e1");

        //IF HASH IS NOT FOUND, WILL RETURN A DEFAULT
//        var customer = map.getOrDefault("e10", unknown);

        //WILL FIND IF SOMEONE HAS SOME VALUE
//        var exists = map.containsKey("e10");

//        var exists = map.replace("e1", new Customer("a++", "e1"));
//        System.out.println(map);

//        for (var key : map.keySet())
//            System.out.println(key);

        for (var entry : map.entrySet())
            System.out.println(entry);
    }
}
