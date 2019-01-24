package com.company;

import java.util.Scanner;

public class BookDemo {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        Library myLibrary = new Library();
        boolean anotherBook = true;
        int answer = 0;
        int index = 0;


        
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
                anotherBook = false;
            } else {
                System.out.println("Try again.");
            }

        } while (anotherBook);

        //System.out.println(myLibrary.numberOfBooksInLibrary());


    }
}
