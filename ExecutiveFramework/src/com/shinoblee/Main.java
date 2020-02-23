package com.shinoblee;

import com.shinoblee.executors.CompletableFuturesDemo;
import com.shinoblee.executors.ExecutorsDemo;
import com.shinoblee.executors.MailService;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {

//        ExecutorsDemo.show();
//        var service = new MailService();
//        service.sendAsync();
//        System.out.println("Hello");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        CompletableFuturesDemo.show();

    }
}
