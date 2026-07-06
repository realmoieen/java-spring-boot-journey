package com.github.zia;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    List<Books> bookList = new ArrayList<>();
    List<Person> personList = new ArrayList<>();

    public Library(){
        Librarian defaultLibrarian=new Librarian("Admin",1);
        personList.add(defaultLibrarian);
        System.out.println("Default Librarian is Added: "+defaultLibrarian);
    }
    public void addBook(Librarian librarian){
        {
            librarian.addBook(bookList);
        }
    }

    public void registerPerson(Librarian librarian){
        librarian.registerMember(personList);
    }
    public void findBookById(Library library) {
        System.out.println("--- Find Book By ID ---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        int bookId = sc.nextInt();
        if (library.bookList.isEmpty()) {
            System.out.println("The library record is empty.");
            return;
        }
        for (Books book : library.bookList) {
            if (book.getId() == bookId) {
                System.out.println("Book Found:");
                System.out.println("ID: " + book.getId());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Status: " + (book.isAvailable() ? "Available" : "Borrowed"));
                return;
            }
        }
        System.out.println("Book with ID '" + bookId + "' not found.");
    }

    public void listBooks(Library library) {
        System.out.println("--- Library Book List ---");
        if (library.bookList.isEmpty()) {
            System.out.println("No books available in the library collection.");
            return;
        }
        for (Books book : library.bookList) {
            String status = book.isAvailable() ? "[Available]" : "[Borrowed]";
            System.out.println("ID: " + book.getId() + " | Title: " + book.getTitle() + " | Author: " + book.getAuthor() + " " + status);
        }
    }
}
