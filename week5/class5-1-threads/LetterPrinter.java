/**
 * Class 5.1 — Threads Basics
 * Example: LetterPrinter - Runnable implementation
 * 
 * Prints letters A-E in its own thread
 */
public class LetterPrinter implements Runnable {
    
    @Override
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Letters: " + c);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
