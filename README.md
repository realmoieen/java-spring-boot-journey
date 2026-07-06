# Java & Spring Boot Developer Course

### From Beginner to Job-Ready in 8 Weeks

A complete, practical curriculum designed to take a Computer Science student from zero Java knowledge to a confident Core Java + Spring Boot developer. Every class includes a **practical exercise** (done in class) and an **assignment** (done at home).

---

## How to Use This Course

- **Duration:** 8 weeks (≈2 months) at 5 classes per week = 40 classes. Each class is ~1.5–2 hours plus exercise time.
- **1-month version:** Run it as an intensive — combine two classes per day, skip the lighter "review" days, and trim the capstone scope. The 1-month track is marked at the end.
- **Golden rule:** *No class is "complete" until the practical exercise runs and the assignment is submitted.* Coding skill comes from typing code, not reading about it.
- **Tools needed:** JDK 21 (LTS), IntelliJ IDEA Community Edition, Git + a GitHub account, MySQL or PostgreSQL, Postman.
- **Track progress:** The student pushes every exercise and assignment to a single GitHub repo. By week 8 that repo *is* their portfolio.

---

## Course Roadmap

| Week | Focus | Outcome |
|------|-------|---------|
| 1 | Java Basics & Syntax | Write and run real Java programs |
| 2 | Object-Oriented Programming | Model the world in classes & objects |
| 3 | Core Java Advanced, Exceptions & Debugging | Write robust, modern Java |
| 4 | Data Structures & Collections | Store, search, and sort data efficiently |
| 5 | Multithreading & File I/O | Handle concurrency and persistence |
| 6 | Databases: JDBC & Hibernate | Connect Java to a real database |
| 7 | Spring Boot Fundamentals | Build REST APIs |
| 8 | Advanced Spring Boot & Capstone | Ship a complete project |

---

# Week 1 — Java Fundamentals & Basic Syntax

**Goal:** Get comfortable installing tools, writing code, and understanding how Java runs.

### Class 1.1 — Setup & Your First Program
- **Learn:** What Java is, JDK vs JRE vs JVM, how compilation works, installing JDK + IntelliJ, structure of a Java program (`main` method, classes, packages), `System.out.println`.
- **Practical Exercise:** Install everything, create a project, and print a personalized greeting plus three facts about yourself.
- **Assignment:** Write a program that prints a small ASCII-art banner of your name and a short "About Me" block. Push it to GitHub with a README.

### Class 1.2 — Variables, Data Types & Operators
- **Learn:** Primitive types (`int`, `double`, `boolean`, `char`, `long`), `String`, type casting, arithmetic / relational / logical operators, reading input with `Scanner`.
- **Practical Exercise:** Build a simple calculator that takes two numbers and prints sum, difference, product, quotient, and remainder.
- **Assignment:** Write a "unit converter" (e.g., kilometers↔miles, Celsius↔Fahrenheit, kg↔pounds) using `Scanner` input.

### Class 1.3 — Control Flow: Conditionals
- **Learn:** `if`, `else if`, `else`, nested conditions, `switch`, ternary operator, boolean logic.
- **Practical Exercise:** Build a grade calculator: input a score (0–100), output the letter grade and a comment.
- **Assignment:** Write a simple ATM menu that checks a PIN and lets the user "check balance," "deposit," or "withdraw" (single transaction, no loop yet). Validate inputs.

### Class 1.4 — Loops & Iteration
- **Learn:** `for`, `while`, `do-while`, `break`, `continue`, nested loops.
- **Practical Exercise:** Print a multiplication table and a triangle/pyramid pattern using nested loops.
- **Assignment:** Build a number-guessing game: the program picks a random number, the user keeps guessing until correct, and it reports the number of attempts.

### Class 1.5 — Methods, Arrays & Strings
- **Learn:** Defining and calling methods, parameters and return values, method overloading, arrays (1D and 2D), common `String` methods (`length`, `charAt`, `substring`, `split`, `toUpperCase`).
- **Practical Exercise:** Write methods that find the max, min, and average of an integer array.
- **Assignment:** Build a "student report" program: store 5 students' marks in an array, compute each total/average, and find the topper. Add a method to check if a word is a palindrome.

> **Week 1 Review Checkpoint:** Student should be able to read input, use conditionals and loops, and write reusable methods without help.

---

# Week 2 — Object-Oriented Programming (OOP)

**Goal:** Think in objects. This is the single most important week for becoming a real developer.

### Class 2.1 — Classes & Objects
- **Learn:** Class vs object, fields and methods, the `new` keyword, constructors (default & parameterized), the `this` keyword, instance vs static members.
- **Practical Exercise:** Create a `Car` class with fields and methods (`start()`, `accelerate()`), then create and drive several `Car` objects.
- **Assignment:** Build a `BankAccount` class with `deposit()`, `withdraw()` (with overdraft check), and `getBalance()`. Create three accounts and run transactions.

### Class 2.2 — Encapsulation
- **Learn:** Access modifiers (`private`, `public`, `protected`, default), getters and setters, why we hide data, validation inside setters.
- **Practical Exercise:** Refactor the `BankAccount` class so all fields are private with proper getters/setters and validation.
- **Assignment:** Build an `Employee` class with private fields; reject invalid data (negative salary, empty name) inside setters and print a clean error message.

### Class 2.3 — Inheritance
- **Learn:** `extends`, parent/child classes, `super`, method overriding, the `Object` class, `toString()`, `equals()`.
- **Practical Exercise:** Create a base `Animal` class and `Dog`/`Cat` subclasses that override a `makeSound()` method.
- **Assignment:** Model a `Vehicle` hierarchy: `Vehicle` → `Car`, `Bike`, `Truck`. Each overrides `describe()` and reuses shared logic via `super`.

### Class 2.4 — Polymorphism
- **Learn:** Compile-time (overloading) vs runtime (overriding) polymorphism, upcasting/downcasting, `instanceof`, dynamic method dispatch.
- **Practical Exercise:** Store different `Animal` subclasses in an `Animal[]` array and loop through calling `makeSound()` — watch polymorphism in action.
- **Assignment:** Build a `Shape` example: a method that accepts any `Shape` and prints its area, where `Circle`, `Rectangle`, and `Triangle` each compute their own area.

### Class 2.5 — Abstraction: Abstract Classes & Interfaces
- **Learn:** Abstract classes vs interfaces, when to use each, `implements`, default methods in interfaces, multiple interface implementation.
- **Practical Exercise:** Define a `Payment` interface with a `pay(amount)` method; implement `CreditCardPayment`, `UpiPayment`, `CashPayment`.
- **Assignment:** Design a small "notification system": a `Notifier` interface with `EmailNotifier`, `SmsNotifier`, `PushNotifier`. A central class sends a message through whichever notifier is passed in.

> **Week 2 Review Checkpoint:** Mini-project — model a simple **Library Management** domain (Book, Member, Librarian) using all four OOP pillars.

---

# Week 3 — Core Java Advanced, Exceptions & Debugging

**Goal:** Write robust, modern, professional Java — and learn to find your own bugs.

### Class 3.1 — Exception Handling
- **Learn:** Errors vs exceptions, checked vs unchecked, `try`/`catch`/`finally`, `throw` vs `throws`, multi-catch, custom exceptions, try-with-resources.
- **Practical Exercise:** Wrap the calculator in exception handling so dividing by zero and bad input never crash the program.
- **Assignment:** Add a custom `InsufficientBalanceException` to the `BankAccount` class and throw it from `withdraw()`. Handle it gracefully in `main`.

### Class 3.2 — Debugging Skills
- **Learn:** Reading stack traces, using IntelliJ's debugger (breakpoints, step over/into/out, watch & evaluate expressions), logging vs print debugging, the "binary search" approach to isolating bugs.
- **Practical Exercise:** The instructor provides a buggy program; the student uses the debugger to locate and fix three planted bugs.
- **Assignment:** Take any earlier assignment, intentionally break it, then write a short note (3–4 lines) describing how you found and fixed each bug using the debugger.

### Class 3.3 — Generics, Enums & Wrapper Classes
- **Learn:** Why generics exist (type safety), generic classes and methods, bounded types, `enum` with fields and methods, wrapper classes, autoboxing/unboxing.
- **Practical Exercise:** Write a generic `Box<T>` class that can hold and return any type. Create an `enum Day` with a method that returns whether it's a weekend.
- **Assignment:** Build a generic `Pair<K, V>` class and a `Stack<T>` class (using an array internally) with `push`, `pop`, and `peek`.

### Class 3.4 — Java 8: Lambdas & Functional Interfaces
- **Learn:** Functional interfaces (`Function`, `Predicate`, `Consumer`, `Supplier`), lambda syntax, method references, `Optional` to avoid `NullPointerException`.
- **Practical Exercise:** Rewrite a list-filtering loop using a `Predicate` lambda. Use `Optional` to safely fetch a value that might be missing.
- **Assignment:** Given a list of employees, use lambdas and predicates to filter (e.g., salary > 50k), and use `Optional` to find an employee by ID safely.

### Class 3.5 — Java 8: Streams API
- **Learn:** Stream pipeline (source → intermediate → terminal), `filter`, `map`, `sorted`, `collect`, `reduce`, `groupingBy`, `count`.
- **Practical Exercise:** From a list of products, use streams to filter by price, sort by name, and collect names into a new list.
- **Assignment:** Given a list of orders, use streams to: total revenue, group orders by customer, and find the top 3 most expensive orders.

> **Week 3 Review Checkpoint:** Student can write a clean, exception-safe program using streams and explain a stack trace unprompted.

---

# Week 4 — Data Structures, Collections & Logic Building

**Goal:** Store and manipulate data efficiently, and build problem-solving muscle.

### Class 4.1 — Collections: List & Set
- **Learn:** The Collections Framework overview, `ArrayList` vs `LinkedList`, `HashSet` vs `TreeSet` vs `LinkedHashSet`, iteration, when to choose which.
- **Practical Exercise:** Build a to-do list using `ArrayList` (add, remove, mark done, display). Use a `HashSet` to store unique tags.
- **Assignment:** Build a "contact book" with `ArrayList<Contact>`: add, search by name, delete, and prevent duplicate phone numbers using a `Set`.

### Class 4.2 — Collections: Map & Queue
- **Learn:** `HashMap`, `TreeMap`, `LinkedHashMap`, iterating with `entrySet`, `Queue`/`Deque`, `Stack`, `PriorityQueue`.
- **Practical Exercise:** Count word frequency in a sentence using a `HashMap`. Simulate a print queue with a `Queue`.
- **Assignment:** Build a simple inventory system with `HashMap<String, Integer>` (item → quantity): add stock, sell items, and report low-stock items.

### Class 4.3 — Core Data Structures Concepts
- **Learn:** How arrays, linked lists, stacks, and queues work *under the hood*; Big-O notation basics (time & space complexity); when each structure is the right tool.
- **Practical Exercise:** Implement a singly linked list from scratch (`add`, `delete`, `print`) without using `java.util`.
- **Assignment:** Implement a `Queue` and a `Stack` from scratch using your linked list. Use the stack to check for balanced brackets in a string.

### Class 4.4 — Searching & Sorting
- **Learn:** Linear vs binary search, bubble/selection/insertion sort, the idea behind merge & quick sort, `Comparable` vs `Comparator`, `Collections.sort()`.
- **Practical Exercise:** Implement binary search on a sorted array. Sort a list of `Student` objects by marks using a `Comparator`.
- **Assignment:** Implement bubble sort and selection sort manually, then sort a list of products by price (ascending) and name (descending) using `Comparator`.

### Class 4.5 — Problem Analysis & Logic Building
- **Learn:** How to break a problem into steps, pseudocode, dry-running code on paper, choosing the right data structure, reading a problem statement carefully.
- **Practical Exercise:** Solve 3 classic problems together: FizzBuzz, reverse a string, find duplicates in an array — talking through the approach *before* coding.
- **Assignment:** Solve 5 beginner problems on HackerRank/LeetCode (e.g., Two Sum, valid anagram, max subarray, count vowels, second-largest element). Submit links/screenshots.

> **Week 4 Review Checkpoint:** Student can pick the right collection for a problem and articulate an approach before writing code.

---

# Week 5 — Multithreading, Concurrency & File I/O

**Goal:** Understand how programs do more than one thing at a time, and how to persist data.

### Class 5.1 — Threads Basics
- **Learn:** Process vs thread, creating threads via `Thread` and `Runnable`, thread lifecycle, `start()` vs `run()`, `sleep()`, `join()`.
- **Practical Exercise:** Create two threads that print numbers and letters concurrently; observe interleaving.
- **Assignment:** Build a program with three threads simulating a download manager — each "downloads" a file (using `sleep` to simulate work) and reports when done.

### Class 5.2 — Synchronization & Thread Safety
- **Learn:** Race conditions, the `synchronized` keyword, locks, `volatile`, deadlock (what it is and how to avoid it), atomic variables.
- **Practical Exercise:** Demonstrate a race condition with a shared counter incremented by multiple threads, then fix it with synchronization.
- **Assignment:** Simulate a ticket-booking system where multiple threads try to book from a limited pool of seats — ensure no seat is double-booked.

### Class 5.3 — Executor Framework & Concurrency Utilities
- **Learn:** `ExecutorService`, thread pools, `Callable` and `Future`, `CompletableFuture` basics, `ConcurrentHashMap`.
- **Practical Exercise:** Use a fixed thread pool to run several tasks and collect their results via `Future`.
- **Assignment:** Build a small task runner that submits 5 computation tasks to a thread pool, gathers results with `Future`, and prints them in order.

### Class 5.4 — File I/O
- **Learn:** Reading/writing files with `BufferedReader`/`BufferedWriter`, `Files` and `Path` (NIO), try-with-resources for streams, handling file exceptions.
- **Practical Exercise:** Write user input to a text file, then read it back and display it.
- **Assignment:** Build a simple notes app that saves notes to a file and lets the user list, add, and search notes across sessions.

### Class 5.5 — Serialization & Recap
- **Learn:** Object serialization (`Serializable`), `ObjectOutputStream`/`ObjectInputStream`, `transient`, when to serialize, intro to JSON as a modern alternative.
- **Practical Exercise:** Serialize a list of `Contact` objects to a file and deserialize them back.
- **Assignment:** Upgrade the contact book (from Week 4) to save/load contacts using serialization so data survives restarts.

> **Week 5 Review Checkpoint:** Student understands why concurrency is hard and can read/write data to disk confidently.

---

# Week 6 — Databases: SQL, JDBC & Hibernate

**Goal:** Connect Java to a real database — the backbone of every backend job.

### Class 6.1 — SQL & Database Fundamentals
- **Learn:** Relational databases, tables/rows/columns, primary & foreign keys, `CREATE`, `INSERT`, `SELECT`, `UPDATE`, `DELETE`, `WHERE`, `JOIN`, `GROUP BY`. Set up MySQL/PostgreSQL.
- **Practical Exercise:** Create a `students` table, insert rows, and run queries (filter, sort, aggregate) directly in the DB client.
- **Assignment:** Design a small schema for a library (`books`, `members`, `loans`) with relationships and write 8 queries against it (including at least one JOIN).

### Class 6.2 — JDBC Basics
- **Learn:** What JDBC is, the driver, `Connection`, `Statement` vs `PreparedStatement` (and SQL injection), `ResultSet`, closing resources.
- **Practical Exercise:** Connect a Java program to the database and run a `SELECT` that prints all students.
- **Assignment:** Write a Java program that inserts a new student via `PreparedStatement` and then lists all students from the table.

### Class 6.3 — JDBC CRUD & the DAO Pattern
- **Learn:** Full Create/Read/Update/Delete with JDBC, the DAO (Data Access Object) pattern, separating database code from business logic, handling SQL exceptions cleanly.
- **Practical Exercise:** Build a `StudentDAO` with `save`, `findById`, `findAll`, `update`, and `delete` methods.
- **Assignment:** Build a console-based **Student Management System** with full CRUD backed by JDBC and a clean DAO layer.

### Class 6.4 — Intro to Hibernate / JPA
- **Learn:** The problem with raw JDBC (boilerplate, object-relational mismatch), what an ORM is, Hibernate vs JPA, `@Entity`, `@Id`, `@GeneratedValue`, `@Column`, the `SessionFactory`/`EntityManager`.
- **Practical Exercise:** Map a `Student` class to a table with annotations and save one object using Hibernate — no SQL written by hand.
- **Assignment:** Convert the Student CRUD from JDBC to Hibernate. Note how much boilerplate disappeared.

### Class 6.5 — Hibernate Relationships & Queries
- **Learn:** `@OneToMany`, `@ManyToOne`, `@ManyToMany`, cascade types, lazy vs eager loading, HQL and JPQL basics.
- **Practical Exercise:** Model `Author` ↔ `Book` (one-to-many) and save an author with several books in one go.
- **Assignment:** Model `Student` ↔ `Course` (many-to-many) with Hibernate; enroll students in courses and query who's enrolled in a given course.

> **Week 6 Review Checkpoint:** Student can persist objects to a database two ways (JDBC + Hibernate) and explain when to use each.

---

# Week 7 — Spring Boot Fundamentals

**Goal:** Build real REST APIs — the core skill of a backend Java developer.

### Class 7.1 — Spring Core: IoC & Dependency Injection
- **Learn:** What a framework is, Inversion of Control, Dependency Injection, Spring beans, `@Component`/`@Service`/`@Repository`, `@Autowired`, why DI makes code testable.
- **Practical Exercise:** Create two beans where one depends on the other, wired via constructor injection, and run it in a Spring context.
- **Assignment:** Write a short note (in your own words) explaining IoC and DI with a real-world analogy, plus a small working example.

### Class 7.2 — Spring Boot Setup & First App
- **Learn:** What Spring Boot adds (auto-configuration, starters, embedded server), creating a project with Spring Initializr, project structure, `application.properties`, running the app.
- **Practical Exercise:** Generate a Spring Boot project and create a `/hello` endpoint that returns a greeting.
- **Assignment:** Build a small app with 3 endpoints: `/about`, `/time` (returns current time), and `/greet?name=...` (returns a personalized greeting).

### Class 7.3 — REST Controllers & HTTP
- **Learn:** REST principles, `@RestController`, `@GetMapping`/`@PostMapping`/`@PutMapping`/`@DeleteMapping`, `@PathVariable`, `@RequestParam`, `@RequestBody`, HTTP status codes, testing with Postman.
- **Practical Exercise:** Build an in-memory `Product` API supporting GET (all & by id) and POST (add). Test every endpoint in Postman.
- **Assignment:** Build a full in-memory CRUD API for `Task` (create, read all, read one, update, delete) and test each route in Postman.

### Class 7.4 — Spring Data JPA
- **Learn:** Connecting Spring Boot to a database, `spring-boot-starter-data-jpa`, `JpaRepository`, derived query methods (`findByName`), auto-CRUD, configuring the datasource.
- **Practical Exercise:** Replace the in-memory product list with a real database using `JpaRepository` — get full CRUD almost for free.
- **Assignment:** Build a `Book` REST API backed by a database with Spring Data JPA. Add a custom finder like `findByAuthor`.

### Class 7.5 — Layered Architecture & Exception Handling
- **Learn:** Controller → Service → Repository layering, why separation matters, `@ExceptionHandler` and `@ControllerAdvice`, returning proper error responses, `ResponseEntity`.
- **Practical Exercise:** Refactor the Book API into proper layers and add a global exception handler that returns a clean 404 JSON when a book isn't found.
- **Assignment:** Add a service layer and global exception handling to the `Task` API; return meaningful status codes and error messages for every failure case.

> **Week 7 Review Checkpoint:** Student can build a database-backed REST API with proper layering from scratch.

---

# Week 8 — Advanced Spring Boot & Capstone Project

**Goal:** Add the professional polish that makes a developer hireable, then ship a real project.

### Class 8.1 — Validation & DTOs
- **Learn:** Bean Validation (`@NotNull`, `@Size`, `@Email`, `@Min`), `@Valid`, why you never expose entities directly, DTOs (Data Transfer Objects), basic mapping between entity and DTO.
- **Practical Exercise:** Add validation to the Book API so invalid requests return a clear 400 error listing what's wrong.
- **Assignment:** Introduce request/response DTOs to the `Task` API and validate all incoming data.

### Class 8.2 — Spring Security & JWT Basics
- **Learn:** What authentication vs authorization means, `spring-boot-starter-security`, securing endpoints, password hashing (BCrypt), a high-level look at JWT-based login.
- **Practical Exercise:** Secure the API so endpoints require login; create one open endpoint and one protected endpoint.
- **Assignment:** Add a simple register/login flow with a JWT issued on login, and protect the write endpoints (POST/PUT/DELETE).

### Class 8.3 — Testing with JUnit & Mockito
- **Learn:** Why tests matter, unit vs integration tests, JUnit 5 (`@Test`, assertions), Mockito (`@Mock`, `when/thenReturn`), testing a service layer, `@SpringBootTest` basics.
- **Practical Exercise:** Write unit tests for a service method (happy path + one failure case) using JUnit and Mockito.
- **Assignment:** Write tests covering the main service methods of your Book/Task API, including at least one mocked repository.

### Class 8.4 — Capstone Kickoff: Design & Build
- **Learn:** Planning a project, defining entities and relationships, designing REST endpoints, setting up the repo, Git branching basics.
- **Practical Exercise:** Pick a capstone (suggestions below), design the data model and endpoint list, and scaffold the project.
- **Assignment:** Implement the core entities, repositories, and at least two full CRUD resources of the capstone.

### Class 8.5 — Capstone Completion, Deployment & Review
- **Learn:** Finishing touches, API documentation with Swagger/OpenAPI, environment configuration, packaging a JAR, an overview of deployment options (Docker, cloud), writing a strong README.
- **Practical Exercise:** Add Swagger docs, package the app as a runnable JAR, and write the project README.
- **Assignment (Final):** Complete the capstone end to end — validation, security, tests, docs — and present a short demo. Push the finished project to GitHub.

---

## Suggested Capstone Projects

Pick one that excites the student — passion shows in the final result:

1. **Task / Project Management API** — users, projects, tasks, statuses, assignments, due dates.
2. **E-commerce Backend** — products, categories, cart, orders, users, basic checkout.
3. **Library Management System** — books, members, loans, fines, search.
4. **Blog Platform API** — users, posts, comments, tags, likes.
5. **Expense Tracker** — accounts, categories, transactions, monthly reports.

**Each capstone must include:** layered architecture, database persistence (JPA), input validation, security (login + protected routes), at least a handful of tests, exception handling, and Swagger documentation.

---

## Skill Checklist (Job-Readiness Self-Assessment)

By the end, the student should confidently check every box:

**Core Java**
- [ ] Write clean, well-structured Java using all four OOP pillars
- [ ] Handle exceptions properly and debug independently
- [ ] Use generics, lambdas, streams, and `Optional`
- [ ] Choose the right collection and explain its trade-offs
- [ ] Implement basic data structures and sorting/searching manually
- [ ] Work with threads, synchronization, and thread pools
- [ ] Read from and write to files

**Database**
- [ ] Write SQL with joins and aggregates
- [ ] Perform CRUD with both JDBC and Hibernate/JPA
- [ ] Model entity relationships

**Spring Boot**
- [ ] Build a layered REST API from scratch
- [ ] Use Spring Data JPA for persistence
- [ ] Validate input and handle errors globally
- [ ] Secure endpoints with login + JWT
- [ ] Write unit tests with JUnit and Mockito
- [ ] Document and package an application

**Professional habits**
- [ ] Uses Git/GitHub daily
- [ ] Breaks problems down before coding
- [ ] Writes a clear README

---

## Daily Class Structure (Recommended)

Each class runs smoothly with this rhythm:

1. **Recap (10 min)** — quick review of yesterday + assignment doubts.
2. **Concept (40 min)** — teach the day's topic with live coding.
3. **Practical Exercise (40 min)** — student codes alongside / independently.
4. **Assignment briefing (10 min)** — explain the homework and success criteria.
5. **Push to GitHub** — every exercise and assignment goes to the repo.

---

## Compressed 1-Month Track

To fit ~4 weeks, run **two classes per teaching day** and apply these cuts:

- **Combine:** Week 1 (basics) and Week 2 (OOP) move fast for students with prior programming exposure.
- **Trim:** Reduce the "review checkpoints" and the standalone problem-solving day — fold practice into evenings.
- **Lighten Week 5:** Cover threads and file I/O at a conceptual level; make deep concurrency optional.
- **Shrink the capstone:** Build one CRUD resource fully with validation, security, and a couple of tests rather than a large multi-entity app.
- **Keep non-negotiable:** OOP, Collections, Exceptions/Debugging, JDBC+Hibernate, and the full Spring Boot week. These are what interviews test.

> Be honest about the trade-off: one month produces a capable junior who still needs practice; two months produces a noticeably more confident, project-ready developer.

---

## Tips for the Mentor

- **Make them type.** Watching you code teaches almost nothing; struggling through their own bugs teaches everything.
- **Review assignments out loud.** Have the student explain their code — if they can't explain it, they don't understand it yet.
- **Encourage Googling and reading docs.** Real developers look things up constantly; this is a skill, not cheating.
- **Celebrate working code, then refactor it.** "Make it work, make it right, make it fast" — in that order.
- **One repo, daily commits.** A green GitHub history is both motivation and a portfolio.

---

*Good luck — this path has turned many beginners into employed Java developers. Consistency beats intensity: showing up every day matters more than any single class.*
