package com.company.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
//    private AtomicInteger totalBytes = new AtomicInteger();
    private LongAdder totalBytes = new LongAdder();
    private int totalFiles;
    private Object totalBytesLock = new Object();
    //volatile field will allow for threads to see changes
    private volatile boolean isDone;

//    private Lock lock = new ReentrantLock();

    public void incrementTotalBytes() {
//        lock.lock();
//        try {
//            totalBytes++;
//        } finally {
//            lock.unlock();
//        }
//        synchronized (totalBytesLock) {
//            totalBytes.incrementAndGet();
//        }

        totalBytes.increment();
    }
    //Synchronzing is a bad practice so it shouldn't really be implemented
    public synchronized void incrementTotalFiles() {
            totalFiles++;
    }

    public int getTotalBytes() {
//        return totalBytes.get();
        return totalBytes.intValue(); //sum()
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}
