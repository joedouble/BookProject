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
            System.out.print("What do you want to do? 1) See how many books. 2) Add a book.  3) Exit");
            userInput = myScanner.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println(myLibrary.numberOfBooksInLibrary());
                    anotherBook = true;
                    break;
                case 2:
                    boolean addBook = true;
                    do {

                        Book myBook = new Book();

                        System.out.println("\nWhat is the book title?");
                        myBook.setBookTitle(myScanner.next());

                        System.out.println("\nWhat is the book author?");
                        myBook.setBookAuthor(myScanner.next());

                        System.out.println("\nWhat is the book genre?");
                        myBook.setGenre(myScanner.next());

                        System.out.println("\nWhat is the year of publication?");
                        myBook.setYearOfPublication(myScanner.nextInt());

                        System.out.println("\nWould you like to add another book? 1 for yes.  2 for no.");
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