/**
 * Class 5.1 — Threads Basics
 * Assignment: DownloadTask - Simulates a file download in a thread
 * 
 * Each task represents one file being downloaded.
 * sleep() simulates the actual download time.
 */
public class DownloadTask implements Runnable {
    private String fileName;
    private int downloadTime;
    
    public DownloadTask(String fileName, int downloadTime) {
        this.fileName = fileName;
        this.downloadTime = downloadTime;
    }
    
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("[" + threadName + "] Starting download: " + fileName);
        
        // Simulate download work using sleep
        try {
            Thread.sleep(downloadTime);
        } catch (InterruptedException e) {
            System.out.println("[" + threadName + "] Download interrupted: " + fileName);
            return;
        }
        
        System.out.println("[" + threadName + "] ✓ Completed: " + fileName);
    }
}
