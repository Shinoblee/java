package com.shinoblee.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
//        collection.add("a");
//        collection.add("b");
//        collection.add("c");
//        for (var item : collection)
//            System.out.println(item);

        //IF YOU DON'T WANT TO ADD INDIVIDUALLY
        Collections.addAll(collection, "a", "b", "c");
//        collection.remove("a");
//        collection.clear();
//        var containsA = collection.contains("a"); //RETURNS BOOLEAN
        //CAN USE VAR INSTEAD OF OBJECT/STRING
        Object[] objectArray = collection.toArray();
                                                  //BEST PRACTICE TO SET TO 0 CAUSE IT WILL AUTOMATICALLY MAKE ENOUGH SPACE FOR COLLECTION
        String[] stringArray = collection.toArray((new String[0]));
//        System.out.println(collection.isEmpty());

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(collection == other); //WILL RETURN FALSE CAUSE THIS COMPARE AGAINST MEMORY LOCATION
        System.out.println(collection.equals(other));
    }
}
