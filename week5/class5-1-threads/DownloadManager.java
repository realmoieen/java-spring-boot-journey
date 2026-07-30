/**
 * Class 5.1 — Threads Basics
 * Assignment: Download Manager
 * 
 * Simulates downloading 3 files concurrently using 3 threads.
 * 
 * Requirements:
 * - Each file downloads in its own thread
 * - Use sleep() to simulate actual download time
 * - Report when each download completes
 * - Use join() to wait for all downloads to finish
 */
public class DownloadManager {
    
    public static void main(String[] args) {
        System.out.println("=== Download Manager (3 Concurrent Downloads) ===\n");
        
        // Create three download tasks with different durations
        Thread download1 = new Thread(
            new DownloadTask("document.pdf", 3000), 
            "Downloader-1"
        );
        Thread download2 = new Thread(
            new DownloadTask("image.jpg", 2000), 
            "Downloader-2"
        );
        Thread download3 = new Thread(
            new DownloadTask("video.mp4", 4000), 
            "Downloader-3"
        );
        
        // Start all downloads concurrently
        System.out.println("Starting 3 downloads...\n");
        long startTime = System.currentTimeMillis();
        
        download1.start();
        download2.start();
        download3.start();
        
        System.out.println("Downloads started. Main thread continues.\n");
        
        try {
            // Wait for all downloads to complete
            download1.join();
            download2.join();
            download3.join();
            
            long endTime = System.currentTimeMillis();
            long totalTime = endTime - startTime;
            
            System.out.println("\n✓ All downloads completed!");
            System.out.println("Total time: " + totalTime + "ms (approximately 4000ms)");
            System.out.println("(If this was sequential, it would take 3+2+4 = 9000ms)");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/*
 * EXPECTED OUTPUT:
 * 
 * === Download Manager (3 Concurrent Downloads) ===
 * 
 * Starting 3 downloads...
 * 
 * Downloads started. Main thread continues.
 * 
 * [Downloader-1] Starting download: document.pdf
 * [Downloader-2] Starting download: image.jpg
 * [Downloader-3] Starting download: video.mp4
 * [Downloader-2] ✓ Completed: image.jpg
 * [Downloader-1] ✓ Completed: document.pdf
 * [Downloader-3] ✓ Completed: video.mp4
 * 
 * ✓ All downloads completed!
 * Total time: 4012ms (approximately 4000ms)
 * (If this was sequential, it would take 3+2+4 = 9000ms)
 * 
 * KEY INSIGHT: Concurrent downloads take ~4 seconds (longest task),
 * not 9 seconds (sum of all). That's the power of threading!
 */
