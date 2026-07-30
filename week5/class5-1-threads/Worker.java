/**
 * Class 5.1 — Threads Basics
 * Example: Worker - Thread that simulates work with sleep
 * 
 * Used to demonstrate join() - waiting for threads to complete
 */
public class Worker implements Runnable {
    private String name;
    private int duration;
    
    public Worker(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
    
    @Override
    public void run() {
        System.out.println(name + " started (will take " + duration + "ms)");
        try {
            // Simulate work with sleep
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted!");
            e.printStackTrace();
        }
        System.out.println(name + " finished");
    }
}
