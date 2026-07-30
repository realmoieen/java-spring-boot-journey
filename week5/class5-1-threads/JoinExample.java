/**
 * Class 5.1 — Threads Basics
 * Example: Using join() to wait for thread completion
 * 
 * The join() method makes the main thread wait for worker threads
 * to finish before continuing.
 * 
 * WITHOUT join(): Main finishes, program exits (workers may still be running)
 * WITH join(): Main waits, ensures workers complete
 */
public class JoinExample {
    
    public static void main(String[] args) {
        System.out.println("=== join() Example ===\n");
        
        Thread t1 = new Thread(new Worker("Task-1", 2000));
        Thread t2 = new Thread(new Worker("Task-2", 3000));
        
        t1.start();
        t2.start();
        
        try {
            System.out.println("Main: Waiting for all threads to finish...");
            
            t1.join();  // Main thread waits for t1
            System.out.println("Main: Task-1 completed");
            
            t2.join();  // Main thread waits for t2
            System.out.println("Main: Task-2 completed");
            
            System.out.println("Main: All threads done, main continues!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/*
 * EXPECTED OUTPUT:
 * 
 * === join() Example ===
 * 
 * Task-1 started (will take 2000ms)
 * Task-2 started (will take 3000ms)
 * Main: Waiting for all threads to finish...
 * Task-1 finished
 * Main: Task-1 completed
 * Task-2 finished
 * Main: Task-2 completed
 * Main: All threads done, main continues!
 */
