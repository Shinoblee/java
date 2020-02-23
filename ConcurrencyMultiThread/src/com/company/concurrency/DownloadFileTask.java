package com.company.concurrency;

public class DownloadFileTask implements Runnable {

    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
//        this.status = new DownloadStatus();
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file " + Thread.currentThread().getName());

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        for (var i = 0; i < 10000; i++) {
            //good practice to continue to check for interrupt request
            if (Thread.currentThread().isInterrupted()) return;
//            System.out.println("Downloading byte " + i);
            status.incrementTotalBytes();
        }
        status.done();
        synchronized (status) {
            status.notify();
        }

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }

    public DownloadStatus getStatus() {
        return status;
    }
}
