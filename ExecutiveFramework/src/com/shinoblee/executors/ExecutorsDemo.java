package com.shinoblee.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;

public class ExecutorsDemo {


    public static void show() {
        //Executors
        //does not protect from concurrency issues
//        var executor = Executors.newFixedThreadPool(2);
//        try {
//            var future = executor.submit(() -> {
////                System.out.println(Thread.currentThread().getName());
//                LongTask.simulate();
//                return 1;
//            });
//
//            System.out.println("Do more work");
//            try {
//                //This is synchronous blocking code
//                var result = future.get();
//                System.out.println(result);
//            } catch (InterruptedException | ExecutionException e) {
//                e.printStackTrace();
//            }
//
//        } finally {
//            //shutdown will not shutdown immediately - will wait for task to complete
//            executor.shutdown();
//        }

        //Completable Future
//        Runnable task = () -> System.out.println("a");
//        var future = CompletableFuture.runAsync(task);
        //for a situation that returns a value
//        Supplier<Integer> task = () -> 1;
//        var future2 = CompletableFuture.supplyAsync(task);
//        try {
//            var result = future2.get();
//            System.out.println(result);
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }

        //Asynchronous API


    }
}
