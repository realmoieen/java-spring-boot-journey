/**
 * Class 5.1 — Threads Basics
 * Example: NumberPrinter - Runnable implementation
 * 
 * Prints numbers 1-5 in its own thread
 */
public class NumberPrinter implements Runnable {
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Numbers: " + i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
