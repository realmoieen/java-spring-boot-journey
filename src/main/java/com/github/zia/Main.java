package com.github.zia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        int id = sc.nextInt();
        Person foundPerson = null;
        for (Person person : library.personList) {
            if (person.getId() == id) {
                foundPerson = person;
                break;
            }
        }
        if (foundPerson != null) {
            System.out.println("Welcome " + foundPerson.getName() + " you are " + foundPerson.getRole() + " with ID " + foundPerson.getId());
        } else {
            System.out.println("Enter valid ID!");
        }
        if (foundPerson != null) {
            if (foundPerson instanceof Librarian) {
                Librarian librarian = (Librarian) foundPerson;
                System.out.println("Do you want to (1) Add Book or (2) Register Person?");
                int choice = sc.nextInt();
                if (choice == 1) {
                    librarian.addBook(library.bookList);
                } else if (choice == 2) {
                    librarian.registerMember(library.personList);
                }
            } else if (foundPerson instanceof Member) {
                Member member = (Member) foundPerson;
                System.out.println("Do you want to (1) Borrow Book or (2) Return Book?");
                int choice = sc.nextInt();
                if (choice == 1) {
                    member.borrowBook(library);
                } else if (choice == 2) {
                    member.returnBook(library);
                }
            }
        }
    }
}
