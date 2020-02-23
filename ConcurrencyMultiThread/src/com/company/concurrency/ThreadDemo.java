package com.company.concurrency;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadDemo {
    public static void show() {
//        System.out.println(Thread.currentThread().getName());
//        for (var i = 0; i < 10; i++) {
//            Thread thread = new Thread(new DownloadFileTask());
//            thread.start();
//        }
//
//        Thread thread = new Thread((new DownloadFileTask()));
//        thread.start();

        //Join will wait for another thread to complete prior to starting new thread
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("File is ready to be scanned.");

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //interrupt doesn't actually end the thread, just sends out the request
//        thread.interrupt();

    //Race Conditions -> Solved with confinement
//        var status = new DownloadStatus();
//        List<Thread> threads = new ArrayList<>();
//        List<DownloadFileTask> tasks = new ArrayList<>();
//
//        for (var i=0; i < 10; i++) {
//            var task = new DownloadFileTask();
//            tasks.add(task);
//
//            var thread = new Thread(task);
//            thread.start();
//            threads.add(thread);
//        }
//
//        for (var thread : threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        var totalBytes = tasks.stream()
//                .map(t -> t.getStatus().getTotalBytes())
//                .reduce(Integer::sum);
//
//        System.out.println(totalBytes);

        //Race condition - solved with locking
        //refer to download status to see locking code
//        var status = new DownloadStatus();
//
//        List<Thread> threads = new ArrayList<>();
//
//        for (var i = 0; i < 10; i++) {
//            var thread = new Thread(new DownloadFileTask(status));
//            thread.start();
//            threads.add(thread);
//        }
//
//        for (var thread : threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println(status.getTotalBytes());

//        var status = new DownloadStatus();
//
//        var thread1 = new Thread(new DownloadFileTask(status));
//        var thread2 = new Thread(() -> {
//           while(!status.isDone()) {
//               synchronized (status){
//                   try {
//                       status.wait();
//                   } catch (InterruptedException e) {
//                       e.printStackTrace();
//                   }
//               }
//           }
//            System.out.println(status.getTotalBytes());
//        });
//        thread1.start();
//        thread2.start();

//        var status = new DownloadStatus();
//        List<Thread> threads = new ArrayList<>();
//
//        for (var i = 0; i < 10; i++) {
//            var thread = new Thread(new DownloadFileTask(status));
//            thread.start();
//            threads.add(thread);
//        }
//
//        for (var thread : threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println(status.getTotalBytes());
        //Synchronized Collections
//        Collection<Integer> collection = Collections.synchronizedCollection(new ArrayList<>());
//        var thread1 = new Thread(() -> {
//            collection.addAll(Arrays.asList(1, 2, 3));
//        });
//        var thread2 = new Thread(() -> {
//            collection.addAll(Arrays.asList(4, 5, 6));
//        });
//
//        thread1.start();
//        thread2.start();
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(collection);

        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "a");
        map.get(1);
        map.remove(1);
    }
}
