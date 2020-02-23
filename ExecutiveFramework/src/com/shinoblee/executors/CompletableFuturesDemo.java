package com.shinoblee.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFuturesDemo {

    public static int toFahrenheit(int celsius) {
        return (int)(celsius * 1.8) + 32;
    }

    public static CompletableFuture<String> getUserEmailAsync() {
        return CompletableFuture.supplyAsync(() -> "email");
    }

    public static CompletableFuture<String> getPlaylistAsync(String email) {
        return CompletableFuture.supplyAsync(() -> "playlist");
    }

    public static void show() {
//        var future = CompletableFuture.supplyAsync(() -> 1);
//        future.thenRunAsync(() -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println("Done");
//        });

//        future.thenAccept(result -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(result);
//        });

//        var future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("Getting the current weather");
//            throw new IllegalStateException();
//        });
//        try {
//            var temp = future.exceptionally(ex -> 1).get();
//            System.out.println(temp);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
////            e.getCause();
//            e.printStackTrace();
//        }
//        CompletableFuture.supplyAsync(() -> 20)
//                .thenApply(CompletableFuturesDemo::toFahrenheit)
//                .thenAccept(f -> System.out.println(f));

        // id -> email
//        getUserEmailAsync()
//        // email -> playlist
//            .thenCompose(CompletableFuturesDemo::getPlaylistAsync)
//            .thenAccept(playlist -> System.out.println(playlist));
//    }
//

        //20 USD
//        var first = CompletableFuture.supplyAsync(() -> "20USD")
//                .thenApply(str -> {
//                    var price = str.replace("USD", "");
//                    return Integer.parseInt(price);
//                });
//        //0.9
//        var second = CompletableFuture.supplyAsync(() -> 0.9);
//
//        first.thenCombine(second, (price, exchangeRate) -> price * exchangeRate)
//                .thenAccept(result -> System.out.println(result));

//        var first = CompletableFuture.supplyAsync(() -> 1);
//        var second = CompletableFuture.supplyAsync(() -> 2);
//        var third = CompletableFuture.supplyAsync(() -> 3);
        //Will wait until all asyncs are complete to run together
//        var all = CompletableFuture.allOf(first, second, third);
//        all.thenRun(() -> {
//            try {
//                var firstResult = first.get();
//                System.out.println(firstResult);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }
//            System.out.println("All tasks completed successfully");
//        });

//        var first = CompletableFuture.supplyAsync(() -> {
//            LongTask.simulate();
//            return 20;
//        });
//
//        var second = CompletableFuture.supplyAsync(() -> 20);
//        //Will return which ever the fastest async is
//        CompletableFuture.anyOf(first, second)
//                .thenAccept(temp -> System.out.println(temp));

        var future = CompletableFuture.supplyAsync(() -> {
           LongTask.simulate();
           return 1;
        });

        try {
            var result = future.completeOnTimeout(1, 1, TimeUnit.SECONDS)
                    .get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
