package com.company;

import com.company.generics.*;
import com.sun.jdi.IntegerType;

public class Main {

    public static void main(String[] args) {
//        var list = new List();
//        list.add(1);
//        list.add("1");
//        list.add(new User());
        //THIS WILL CAUSE ISSUES CAUSE YOU WILL CAST A TYPE THAT IS NOT ACCEPTED
//        int number = (int)list.get(1);

//        var list = new GenericList<User>();
//            list.add(new User());
//            User user = list.get(0);

        //GENERIC LISTS CAN'T STORE PRIMITIVE VALUES /INT/SHORT/DOUBLE...
//        new GenericList<int>()
        //SO YOU HAVE TO WRAP THEM WITH THEIR CLASS TYPE /INTEGER/BOOLEAN/STRING
//        GenericList<Integer> numbers = new GenericList<>();
//        numbers.add(1);  //BOXING -> COMPILER WILL AUTOMATICALLY CAST WITH CORRECT TYPE
//        int number = numbers.get(0); //UNBOXING

//        new GenericList<User>();
//
//        var user1 = new User(30);
//        var user2 = new User(20);
//        if (user1.compareTo(user2) < 0)
//            System.out.println("user1 < user2");
//        else if (user1.compareTo(user2) == 0)
//            System.out.println("user1 == user2");
//        else
//            System.out.println("user1 > user2");
//        var max = Utils.max(new User(10), new User(20));
//        System.out.println(max);
//
//        Utils.print(1, "Lee");

//        User user = new Instructor(10);
//        Utils.printUser(new Instructor(10));
        var instructors = new GenericList<Instructor>();
        var users = new GenericList<User>();
        Utils.printUsers(new GenericList<Instructor>());
    }
}
