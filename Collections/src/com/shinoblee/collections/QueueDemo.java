package com.shinoblee.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();
//        queue.add("c");
//        queue.add("a");
//        queue.add("b");
//        queue.offer("d");
        // d -> b -> a -> c

        //PEEK WILL SHOW NULL IF NO AVAILABLE
//        var front = queue.peek();
        //ELEMENT WILL THROW NULL EXCEPTION
//        var front = queue.element();
        //WILL REMOVE ITEM FROM FRONT AND RETURN IT / WILL THROW EXCEPTION IF NULL
//        var front = queue.remove();
        //WILL REMOVE ITEM FROM FRONT AND RETURN IT / WILL RETURN NULL IF EMPTY
        var front = queue.poll();

        System.out.println(front);
    }
}
