package com.company;

import java.util.Scanner;

public class BookDemo {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        Library myLibrary = new Library();
        boolean addAnotherBook = false;
        boolean continueInLibrary = false;
        int answer = 0;
        int userInput = 0;

        do {

            System.out.print("What would you like to do? [PLEASE ENTER A NUMBER ONLY]\n\n1) Add a book.\n2) See how " +
                    "many books.\n3) Search for a book.\n4) Exit\n");
            userInput = myScanner.nextInt();

            if (userInput < 1 || userInput > 4) {
                System.out.println("Sorry, that selection didn't work.  Please try again.\n");
                continueInLibrary = true;
            }

            switch (userInput) {

                case 1:
                    do {

                        System.out.println("\nWhat is the book title?");
                        myScanner.nextLine();
                        String newTitle = myScanner.nextLine();

                        System.out.println("\nWhat is the book author?");
                        String newAuthor = myScanner.nextLine();

                        System.out.println("\nWhat is the book genre?");
                        String newGenre = myScanner.nextLine();

                        System.out.println("\nWhat is the year of publication?");
                        String newYearOfPublication = myScanner.nextLine();

                        Book myBook = new Book(newTitle, newAuthor, newGenre, newYearOfPublication);

                        System.out.println("\nWould you like to add another book?[PLEASE ENTER A NUMBER ONLY]\n\n1) " +
                                "Add another book.\n2) Stop adding books.");
                        answer = myScanner.nextInt();

                        System.out.println("\nAdded this book to the library: \n");

                        myBook.printDetails();

                        myLibrary.addBookToLibrary(myBook);

                        if (answer == 1) {
                            addAnotherBook = true;
                        } else if (answer == 2) {
                            addAnotherBook = false;
                            continueInLibrary = true;
                        } else {
                            System.out.println("Try again.");
                        }

                    } while (addAnotherBook);
                    break;

                case 2:
                    System.out.println("The current number of books in the library is:  " + myLibrary.numberOfBooksInLibrary() + "\n");
                    myLibrary.seeAllBooksInLibrary();
                    continueInLibrary = true;
                    break;

                case 3:
                    System.out.println("What's the name of the book you're searching for?");
                    myScanner.nextLine();
                    String search = myScanner.nextLine();
                    myLibrary.searchLibrary(search);
                    continueInLibrary = true;
                    break;

                case 4:
                    System.out.println("You've decided to exit.  Thank you.  Please visit us again soon.");
                    continueInLibrary = false;
                    break;

            }
        } while (continueInLibrary);
    }
}