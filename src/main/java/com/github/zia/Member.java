package com.github.zia;
import java.util.Scanner;

public class Member extends Person {
    @Override
    String getRole() {
        return "MEMBER";
    }
    public Member(String name, int id) {
        super(name, id);
    }
    public void borrowBook(Library library) {
        System.out.println("--- Borrow a Book ---");
        Scanner sc = new Scanner(System.in);
        if (library.bookList.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }
        System.out.print("Enter the ID of the book you want to borrow: ");
        int searchId = sc.nextInt();
        sc.nextLine();
        for (Books book : library.bookList) {
            if (book.getId() == searchId) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Success! You have borrowed '" + book.getTitle() + "'.");
                } else {
                    System.out.println("Sorry, '" + book.getTitle() + "' is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book with ID " + searchId + " not found.");
    }
    public void returnBook(Library library) {
        System.out.println("--- Return a Book ---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ID of the book you want to return: ");
        int searchId = sc.nextInt();
        sc.nextLine();
        for (Books book : library.bookList) {
            if (book.getId() == searchId) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("Success! You have returned '" + book.getTitle() + "'.");
                } else {
                    System.out.println("This book ('" + book.getTitle() + "') was not checked out.");
                }
                return;
            }
        }
        System.out.println("Book with ID " + searchId + " not found.");
    }
}
