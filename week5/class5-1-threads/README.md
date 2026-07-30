# Class 5.1 — Threads Basics

## Complete Study Material & Practical Examples

---

## Table of Contents

1. [Conceptual Overview](#conceptual-overview)
2. [Process vs Thread](#process-vs-thread)
3. [Thread Lifecycle](#thread-lifecycle)
4. [The Critical Difference: `start()` vs `run()`](#critical-difference-start-vs-run)
5. [Creating Threads](#creating-threads)
6. [Key Thread Methods](#key-thread-methods)
7. [Practical Examples](#practical-examples)
8. [Assignment Solution](#assignment-solution)
9. [How to Run](#how-to-run)
10. [Key Takeaways](#key-takeaways)

---

## Conceptual Overview

### What is a Thread?

A **thread** is a single path of execution within a program. A program can have multiple threads running concurrently, allowing it to do multiple things at the same time.

**Analogy:**
- A **process** is a restaurant
- A **thread** is a waiter
- One restaurant (process) can have many waiters (threads) serving customers simultaneously
- They share the kitchen (memory) but work independently

### Why Threads Matter

**Without threads:** Download 3 files sequentially = 3 + 2 + 4 = 9 seconds total  
**With threads:** Download 3 files concurrently = max(3, 2, 4) = 4 seconds total

**Real-world examples:**
- Downloading multiple files at once
- A server handling multiple client connections simultaneously
- A game running physics, graphics, and input handling at the same time
- A chat app sending messages while receiving messages from others

---

## Process vs Thread

| Aspect | Process | Thread |
|--------|---------|--------|
| **Memory** | Separate memory space | Shared memory within a process |
| **Creation** | Heavy, slow | Lightweight, fast |
| **Communication** | Complex, message-based | Direct, via shared variables |
| **Crash Impact** | Process crashes alone | One thread crash may crash entire process |
| **Example** | Chrome browser | Multiple tabs in Chrome |

---

## Thread Lifecycle

Every thread goes through these states:

```
1. NEW
   └─> Thread created but not started
   
2. RUNNABLE (Ready)
   └─> Thread ready to run, waiting for CPU time
   
3. RUNNING
   └─> Thread is currently executing on the CPU
   └─> May pause if sleep() or join() is called
   
4. BLOCKED/WAITING
   └─> Thread is paused (waiting for I/O, sleep, lock, etc.)
   
5. TERMINATED
   └─> Thread finished executing
```

**Visual Diagram:**

```
    start()              Scheduler picks it
      ↓                       ↓
    [NEW] → [RUNNABLE] → [RUNNING] → [TERMINATED]
                             ↑        ↓
                             └─ sleep(), join(), wait()
                                    returns
```

---

## Critical Difference: `start()` vs `run()`

### ⚠️ THE #1 MISTAKE BEGINNERS MAKE

```java
Thread t = new MyThread();

t.run();    // ❌ WRONG: Runs in CURRENT thread (main), NOT a new thread!
t.start();  // ✅ CORRECT: Creates a NEW thread and runs concurrently
```

### Why This Matters

**Using `run()`:**
```
Main Thread
├─ t.run() → runs INSIDE main thread
└─ Code executes sequentially (no concurrency!)
```

**Using `start()`:**
```
Main Thread                    New Thread
├─ t.start()                   ├─ MyThread.run()
├─ Main continues              └─ Executes concurrently
└─ (doesn't wait)
```

### Example to Show the Difference

```java
// WRONG - Using run()
Thread t = new Thread(() -> System.out.println("Hello"));
t.run();  // Takes 1ms
System.out.println("Done");  // Prints immediately after

// RIGHT - Using start()
Thread t = new Thread(() -> {
    Thread.sleep(5000);
    System.out.println("Hello");
});
t.start();  // Returns immediately
System.out.println("Done");  // Prints BEFORE "Hello"
```

---

## Creating Threads

### Method 1: Extend the `Thread` Class

```java
class MyThread extends Thread {
    public void run() {
        // Code that runs in this thread
    }
}

// Usage:
MyThread t = new MyThread();
t.start();  // ✅ Creates a new thread
```

**Pros:** Simple syntax  
**Cons:** Can't extend another class (Java doesn't allow multiple inheritance)

### Method 2: Implement `Runnable` Interface (Preferred)

```java
class MyRunnable implements Runnable {
    public void run() {
        // Code that runs in this thread
    }
}

// Usage:
Thread t = new Thread(new MyRunnable());
t.start();  // ✅ Creates a new thread
```

**Pros:** More flexible (can implement other interfaces too)  
**Cons:** Slightly more code

### Method 3: Lambda Expression (Java 8+, Most Concise)

```java
// Using lambda (Runnable is a functional interface)
Thread t = new Thread(() -> {
    System.out.println("Running in a thread");
});
t.start();
```

---

## Key Thread Methods

| Method | Returns | What It Does | Example |
|--------|---------|--------------|---------|
| `start()` | void | Creates & runs a new thread | `t.start()` |
| `run()` | void | Override this with your code | `@Override public void run()` |
| `sleep(ms)` | void (static) | Pause current thread for N milliseconds | `Thread.sleep(1000)` |
| `join()` | void | Main thread waits for this thread to finish | `t.join()` |
| `getName()` | String | Get thread's name | `String name = t.getName()` |
| `setName(name)` | void | Set thread's name | `t.setName("Worker")` |
| `isAlive()` | boolean | Check if thread is still running | `if (t.isAlive())` |
| `currentThread()` | Thread (static) | Get the current thread object | `Thread current = Thread.currentThread()` |

### Important: `sleep()` throws `InterruptedException`

```java
try {
    Thread.sleep(2000);  // Sleep for 2 seconds
} catch (InterruptedException e) {
    System.out.println("Sleep was interrupted!");
    e.printStackTrace();
}
```

---

## Practical Examples

### Example 1: Two Threads Printing Concurrently

**Files:** `NumberPrinter.java`, `LetterPrinter.java`, `ConcurrentPrinting.java`

**What happens:**
- Thread 1 prints numbers 1-5
- Thread 2 prints letters A-E
- Both run simultaneously → output is interleaved

**Key Learning:** Notice how `start()` allows both threads to run at the same time. If you called `run()` directly, they would run sequentially.

**Run:**
```bash
javac NumberPrinter.java LetterPrinter.java ConcurrentPrinting.java
java ConcurrentPrinting
```

**Expected (order varies):**
```
Starting both threads...

Main thread continues...

Numbers: 1
Letters: A
Numbers: 2
Letters: B
...
```

---

### Example 2: Using `join()` to Wait for Threads

**Files:** `Worker.java`, `JoinExample.java`

**What happens:**
- Main thread starts two worker threads
- Main thread calls `join()` and waits
- When both workers finish, main continues

**Key Learning:** Without `join()`, the main thread would finish before workers complete. `join()` ensures synchronization.

**Run:**
```bash
javac Worker.java JoinExample.java
java JoinExample
```

**Expected Output:**
```
Task-1 started (will take 2000ms)
Task-2 started (will take 3000ms)
Main: Waiting for all threads to finish...
Task-1 finished
Main: Task-1 completed
Task-2 finished
Main: Task-2 completed
Main: All threads done, main continues!
```

---

## Assignment Solution

### Download Manager (3 Concurrent Threads)

**Files:** `DownloadTask.java`, `DownloadManager.java`

**What You're Building:**
- Simulates downloading 3 files concurrently
- Each file "downloads" for a different duration
- Uses `join()` to wait for all downloads to complete

**Key Concepts Used:**
1. **Multiple threads** — 3 DownloadTask instances
2. **Runnable interface** — DownloadTask implements Runnable
3. **start()** — Creates new threads, not `run()`
4. **sleep()** — Simulates download work
5. **join()** — Wait for all threads to finish
6. **Thread naming** — Helps identify which thread is running

**Run:**
```bash
javac DownloadTask.java DownloadManager.java
java DownloadManager
```

**Expected Output:**
```
=== Download Manager (3 Concurrent Downloads) ===

Starting 3 downloads...

Downloads started. Main thread continues.

[Downloader-1] Starting download: document.pdf
[Downloader-2] Starting download: image.jpg
[Downloader-3] Starting download: video.mp4
[Downloader-2] ✓ Completed: image.jpg
[Downloader-1] ✓ Completed: document.pdf
[Downloader-3] ✓ Completed: video.mp4

✓ All downloads completed!
Total time: 4012ms (approximately 4000ms)
(If this was sequential, it would take 3+2+4 = 9000ms)
```

**KEY INSIGHT:** Total time is ~4 seconds (the longest task), not 9 seconds (sum of all). That's the power of concurrent execution!

---

## How to Run

### Compile All Files
```bash
javac *.java
```

### Run Each Example Individually
```bash
# Exercise 1: Concurrent Printing
java ConcurrentPrinting

# Example 2: Using join()
java JoinExample

# Assignment: Download Manager
java DownloadManager
```

### Run Multiple Times
Run the examples several times and note:
- Output order varies (threads are unpredictable)
- Total time for DownloadManager is ~4 seconds (concurrent), not 9 (sequential)
- This variability is expected and normal!

---

## Common Mistakes to Avoid

| ❌ Mistake | ✅ Correct |
|-----------|-----------|
| `t.run()` | `t.start()` |
| Not catching `InterruptedException` | Wrap `sleep()` in try-catch |
| Not using `join()` when you need synchronization | Call `t.join()` before accessing results |
| Forgetting thread naming | Use `new Thread(r, "descriptive-name")` |
| Calling `start()` twice on same thread | Create a new Thread object for each run |

---

## Thread Safety Preview

**Note:** We'll cover synchronization in **Class 5.2**. For now:
- Avoid sharing mutable data between threads
- If you must share, use `synchronized` keyword (next class)
- This prevents race conditions

---

## Key Takeaways

1. **`start()` ≠ `run()`** — `start()` creates a new thread, `run()` doesn't
2. **Concurrency** — Multiple threads can run simultaneously (or appear to)
3. **Interleaving** — Output from concurrent threads is unpredictable, but that's normal
4. **`sleep()`** — Pauses a thread, useful for simulating work
5. **`join()`** — Waits for a thread to complete before continuing
6. **Thread lifecycle** — NEW → RUNNABLE → RUNNING → TERMINATED
7. **Runnable is preferred** — More flexible than extending Thread class
8. **Thread naming helps** — Makes debugging and output easier

---

## Quick Reference Cheat Sheet

```java
// Creating a thread with Runnable
Thread t = new Thread(() -> {
    System.out.println("Running in a thread");
}, "MyThread");

// Starting a thread
t.start();  // ✅ Correct

// Pausing a thread
try {
    Thread.sleep(2000);  // Sleep for 2 seconds
} catch (InterruptedException e) {
    e.printStackTrace();
}

// Waiting for a thread to finish
try {
    t.join();  // Main waits for t to finish
} catch (InterruptedException e) {
    e.printStackTrace();
}

// Getting thread info
String name = t.getName();
boolean running = t.isAlive();
```

---

## Next Steps

**Class 5.2:** Synchronization & Thread Safety
- Race conditions
- `synchronized` keyword
- Locks and atomic variables
- Making threads safe

---

## Files in This Folder

| File | Purpose |
|------|---------|
| `NumberPrinter.java` | Prints numbers 1-5 in a thread |
| `LetterPrinter.java` | Prints letters A-E in a thread |
| `ConcurrentPrinting.java` | Exercise combining both threads |
| `Worker.java` | Generic worker thread for examples |
| `JoinExample.java` | Demonstrates `join()` usage |
| `DownloadTask.java` | Single download task |
| `DownloadManager.java` | Assignment: 3 concurrent downloads |
| `README.md` | This file |

---

## Additional Resources

**Key Concepts to Remember:**
- Threads share memory but have independent execution paths
- `start()` is always the right choice
- Use lambdas for concise thread creation
- Always handle `InterruptedException`
- Use `join()` for synchronization without locks

**Further Practice:**
- Modify DownloadManager to handle 5 files
- Add error handling if a download "fails"
- Track download progress (0-100%)
- Implement a thread pool with a fixed number of workers

---

*Class 5.1 — Ready for Class 5.2: Synchronization & Thread Safety*
