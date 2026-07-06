## Assignment: Library Management System (Week 2 Mini-Project)

**Goal:** Build a small console-based Library Management System that models a real library using a `Book`, a `Member`, and a `Librarian`. The point of this project is not the library itself — it's to prove you can use **all four pillars of OOP** together in one program.

### The Scenario
A library has **books**. **Members** can borrow and return books. **Librarians** can add new books and register members. Both members and librarians are *people*, so they share some common information (like an ID and a name) but can do different things.

### What You Must Build

You need at least these classes:

1. **`Person`** (abstract) — the shared base for everyone in the library. Holds `id` and `name`. Has an abstract method `getRole()` that each subclass fills in.
2. **`Member`** (extends `Person`) — can `borrowBook()` and `returnBook()`. Keeps track of which books they currently have.
3. **`Librarian`** (extends `Person`) — can `addBook()` and `registerMember()`.
4. **`Book`** — holds `id`, `title`, `author`, and `isAvailable` (true/false).
5. **`Library`** — holds the array of books and the array of members, and ties everything together.
6. **`Main`** — creates a librarian, a couple of members, some books, and runs through a few actions to show it all works.

> Tip: since you haven't learned Collections yet, store books and members in plain **arrays** with a counter, e.g. `Book[] books = new Book[100];` and an `int bookCount;`.

### The Four OOP Pillars — and Exactly Where Each Must Appear

This is the checklist your code will be graded on. Each pillar must clearly show up:

- **Encapsulation** → Every field in every class is `private`. Access them only through getters/setters. Put **validation** in the setters (e.g., a book title cannot be empty; an ID cannot be negative).
- **Inheritance** → `Member` and `Librarian` both `extends Person` and reuse its `id`/`name` instead of redefining them. Use `super(...)` in their constructors.
- **Polymorphism** → Override `getRole()` in both subclasses so it returns `"Member"` or `"Librarian"`. Then write one method that accepts a `Person` and prints their role — the *same* call behaves differently depending on the object. (Bonus: also **overload** a method, e.g. two versions of `addBook` — one with an availability flag, one without.)
- **Abstraction** → `Person` is an `abstract` class with the abstract method `getRole()`. (Stretch option: instead of putting the borrow/return/add methods directly in the classes, define an `interface` like `LibraryActions` and implement it.)

### Steps to Follow

1. Write the `Book` class with private fields, getters/setters, and validation.
2. Write the abstract `Person` class with `id`, `name`, a constructor, and `abstract String getRole();`.
3. Write `Member` and `Librarian` extending `Person`, each overriding `getRole()` and adding their own actions.
4. Write the `Library` class that stores books/members in arrays and offers methods like `addBook`, `findBookById`, `listBooks`.
5. In `Main`, create objects and run a short story: librarian adds 3 books → registers 2 members → a member borrows a book → tries to borrow the *same* book again (should fail because it's unavailable) → returns it → prints the final state.

### What "Done" Looks Like (Example Output)

```
Librarian Sara added: "Clean Code" by Robert Martin
Librarian Sara registered member: Ali
Ali borrowed "Clean Code"
Ali tried to borrow "Clean Code" -> Not available!
Ali returned "Clean Code"
Role check -> Ali: Member | Sara: Librarian
```

### Submission Checklist

- [ ] All fields are `private` with getters/setters and at least one validation rule
- [ ] `Member` and `Librarian` both extend the abstract `Person`
- [ ] `getRole()` is overridden in both subclasses (polymorphism shown)
- [ ] `Person` is `abstract` and cannot be instantiated directly
- [ ] `Main` runs without errors and produces sensible output
- [ ] Code is pushed to GitHub under `week2/library-system` with a short README explaining where each OOP pillar is used

### Stretch Goals (optional, for a stronger student)

- Use an **interface** `LibraryActions` for borrow/return/add operations.
- Give `Member` a **borrow limit** (e.g., max 3 books) and reject the 4th.
- Add a `toString()` override on `Book` and `Person` for clean printing.
