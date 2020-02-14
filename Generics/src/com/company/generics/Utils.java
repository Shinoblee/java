package com.company.generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) < 0) ? second : first;
    }

    public static <K, V> void print(K key, V value) {
        System.out.println(key + "=" + value);
    }

    public static void printUser(User user) {
        System.out.println(user);
    }

    // JAVA will create own classes under hood like CAP#1 extends User {}
    //IF YOU EXTEND YOU CAN'T ADD ITEMS TO WILDCARD LIST
//    public static void printUsers(GenericList<? extends User> users) {
//        User x = users.get(0);
//        users.add();
//    }

    //IF YOU SUPER THE CLASS YOU CAN'T READ FROM WILDCARD LIST
    //THE PARENT OF User CLASS IS THE OBJECT CLASS
    public static void printUsers(GenericList<? super User> users) {
        GenericList<Object> temp = new GenericList<>();
        users.add(new User(10));
        //WILL WORK
//        Object x = users.get(0);
        //WONT WORK
//        User y = users.get(0);
    }
}
