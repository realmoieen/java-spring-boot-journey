package com.github.zia;

import java.util.List;
import java.util.Scanner;

public class Librarian extends Person {
    @Override
    String getRole() {
        return "LIBRARIAN";
    }
    public Librarian(String name, int id) {
        super(name, id);
    }

    public void addBook(List<Books> bookList){
        {
            Scanner sc = new Scanner(System.in);
            {
                System.out.println("--- Add New Book ---");
                System.out.print("Enter Book Title: ");
                String title = sc.next();
                System.out.print("Enter Author Name: ");
                String author = sc.next();
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                Books newBook = new Books(id, title, author);
                bookList.add(newBook);
                System.out.println("Book '" + title + "' added successfully!");
            }
        }
    }
    public void registerMember(List<Person> personList){
        Scanner sc = new Scanner(System.in);
        System.out.println("---Add New Person---");
        System.out.println("Enter Person Name To Register: ");
        String name = sc.next();
        System.out.println("Enter Person ID To Register: ");
        int id = sc.nextInt();
        boolean userExists = false;
        for (Person person :personList) {
            if (person.getId() == id) {
                userExists = true;
                break;
            }
        }
        if (userExists) {
            System.out.println("Error: User exists already!");
            return;
        }
        //@TODO check user id exist return error else save member-  ask member type Librarian ya Member

            System.out.println("For which role you want to register?");
            System.out.println("1. Librarian");
            System.out.println("2. Member");
            System.out.print("Choose option (1 or 2): ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                Librarian newLibrarian = new Librarian(name, id);
                personList.add(newLibrarian);
                System.out.println("Librarian registered successfully!");
            } else if (choice == 2) {
                Member newMember = new Member(name, id);
                personList.add(newMember);
                System.out.println("Member registered successfully!");
            } else {
                System.out.println("Invalid role selection.");
            }
        }

    }

