package com.company.generics;
            //APPLY LIMITS WITH EXTENDS IN DECLARATION -> CAN ALSO APPLY INTERFACES TO THIS
//public class GenericList<T extends Comparable & Cloneable> {
public class GenericList<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
