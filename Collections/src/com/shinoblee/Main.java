package com.shinoblee;

import com.shinoblee.collections.*;
import com.shinoblee.generics.GenericList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    var list = new GenericList<String>();
//	    var iterator = list.iterator();
	    // [a, b, c]
        //  ^
        //THIS CODE WILL CAUSE THE ITERATOR TO TRAVEL THROUGH THE ARRAY
//	    while (iterator.hasNext()) {
//	        var current = iterator.next();
//            System.out.println(current);
//        }
//        list.add("a");
//        list.add("b");
//        for (var item: list)
//            System.out.println(item);

//        CollectionsDemo.show();
//        ListDemo.show();
//        List<Customer> customers = new ArrayList<>();
//        customers.add(new Customer("b", "e3"));
//        customers.add(new Customer("a", "e2"));
//        customers.add(new Customer("c", "e1"));
//        Collections.sort(customers, new EmailComparator());
//        System.out.println(customers);

//        QueueDemo.show();

//        SetDemo.show();

        MapDemo.show();

    }
}
