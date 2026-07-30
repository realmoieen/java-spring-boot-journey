/**
 * Class 5.1 — Threads Basics
 * Practical Exercise: Concurrent Printing
 * 
 * Creates two threads that print numbers and letters concurrently.
 * Observe the interleaving of output.
 * 
 * KEY LEARNING: Notice how start() creates a NEW thread,
 * while run() would just execute in the current thread.
 */
public class ConcurrentPrinting {
    
    public static void main(String[] args) {
        System.out.println("=== Concurrent Printing Exercise ===\n");
        
        // Create two threads using Runnable
        Thread numberThread = new Thread(new NumberPrinter(), "Number-Thread");
        Thread letterThread = new Thread(new LetterPrinter(), "Letter-Thread");
        
        System.out.println("Starting both threads...\n");
        
        // START the threads (creates new threads, doesn't execute in main)
        numberThread.start();  // ✅ Correct: Creates a new thread
        letterThread.start();  // ✅ Correct: Creates a new thread
        
        // Main thread continues immediately
        System.out.println("Main thread continues...\n");
    }
}

/*
 * EXPECTED OUTPUT (order may vary):
 * 
 * === Concurrent Printing Exercise ===
 * 
 * Starting both threads...
 * 
 * Main thread continues...
 * 
 * Numbers: 1
 * Letters: A
 * Numbers: 2
 * Letters: B
 * Numbers: 3
 * Letters: C
 * Numbers: 4
 * Letters: D
 * Numbers: 5
 * Letters: E
 * 
 * NOTE: The interleaving (which output comes first) will vary each run.
 * This is normal and expected - it demonstrates concurrent execution!
 */
