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

            System.out.print("What would you like to do? [PLEASE ENTER A NUMBER ONLY]\n1) Add a book.\n2) See how many books.\n3) Exit\n");
            userInput = myScanner.nextInt();

            switch (userInput) {

                case 1:

                    do {

                        if(myLibrary.libraryHasRoom()) {

                            Book myBook = new Book();

                            System.out.println("What is the book title?");
                            myScanner.nextLine();
                            myBook.setBookTitle(myScanner.nextLine());

                            System.out.println("\nWhat is the book author?");
                            myBook.setBookAuthor(myScanner.nextLine());

                            System.out.println("\nWhat is the book genre?");
                            myBook.setGenre(myScanner.nextLine());

                            System.out.println("\nWhat is the year of publication?");
                            myBook.setYearOfPublication(myScanner.nextLine());

                            System.out.println("\nWould you like to add another book?[PLEASE ENTER A NUMBER ONLY]\n1) Add" +
                                    " another book.\n2) Stop adding books.");
                            answer = myScanner.nextInt();

                            System.out.println("Added this book to the library: \n");

                            myBook.printDetails();

                            myLibrary.addBookToLibrary(myBook);

                            if (answer == 1) {
                                addAnotherBook = true;
                            } else if (answer == 2) {
                                addAnotherBook = false;
                            } else {
                                System.out.println("Try again.");
                            }

                        } else {
                            System.out.println("\nThe library is full!  Please try again later.\n");
                        }

                    } while (addAnotherBook);
                    break;

                case 2:

                    System.out.println("The current number of books in the library is:  " + myLibrary.numberOfBooksInLibrary() + "\n");
                    continueInLibrary = true;
                    break;

                case 3:
                    System.out.println("You've decided to exit.  Thank you.  Please visit us again soon.");
                    continueInLibrary = false;
                    break;

            }
        } while (continueInLibrary);
    }
}