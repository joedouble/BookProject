package com.company;

import java.util.Scanner;

public class BookDemo {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        Library myLibrary = new Library();
        boolean anotherBook = true;
        int answer = 0;
        int index = 0;
        int userInput = 0;


        do {

            System.out.print("What would you like to do? [PLEASE ENTER A NUMBER ONLY]\n1) See how many books.\n2) Add a book.\n3) Exit\n");
            userInput = myScanner.nextInt();

            switch (userInput) {

                case 1:

                    System.out.println("The current number of books in the library is:  " + myLibrary.numberOfBooksInLibrary() + "\n");
                    anotherBook = true;
                    break;

                case 2:

                    boolean addBook = true;

                    do {

                        Book myBook = new Book();

                        System.out.println("What is the book title?");
                        //String newTitle = myScanner.nextLine();
                        myScanner.nextLine();
                        //myBook.setTitle(newTitle);
                        myBook.setBookTitle(myScanner.nextLine());

                        System.out.println("\nWhat is the book author?");
                        myBook.setBookAuthor(myScanner.nextLine());

                        System.out.println("\nWhat is the book genre?");
                        myBook.setGenre(myScanner.nextLine());

                        System.out.println("\nWhat is the year of publication?");
                        myBook.setYearOfPublication(myScanner.nextInt());

                        System.out.println("\nWould you like to add another book?[PLEASE ENTER A NUMBER ONLY]\n1) Add" +
                                " another book.\n2) Stop adding books.");
                        answer = myScanner.nextInt();

                        myLibrary.allBooks[index] = myBook;

                        if (answer == 1) {
                            index++;
                        } else if (answer == 2) {
                            addBook = false;
                        } else {
                            System.out.println("Try again.");
                        }

                    } while (addBook);
                    break;

                case 3:
                    System.out.println("You've decided to exit.");
                    anotherBook = false;
                    break;

            }
        } while (anotherBook);
    }
}