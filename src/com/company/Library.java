package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Library {

    private List<Book> allBooks = new ArrayList<Book>();
    private String searchTerm;
    public Scanner myScanner = new Scanner(System.in);

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public void addBookToLibrary(Book book) {
        allBooks.add(book);
    }

    public int numberOfBooksInLibrary() {
        int numOfBooks = allBooks.size();
        return numOfBooks;
    }

    public void searchLibrary(String searchTerm) {
        boolean match = false;

        for (Book element : allBooks) {
            if (element.getBookTitle().toUpperCase().contains(searchTerm.toUpperCase())) {
                System.out.println("The book we found in our system is:  \n");
                element.printDetails();
                match = true;

                System.out.println("What would you like to do next? [PLEASE ENTER A NUMBER ONLY]\n1) Update the book " +
                        "information.\n2) Borrow (delete) the book from library.\n3) Return to the main menu.");

                int searchOptions = myScanner.nextInt();

                while (searchOptions == 1 || searchOptions == 2) {

                    switch (searchOptions) {
                        case 1:

                            System.out.println("Which part of the book would you like to update? [PLEASE ENTER A " +
                                    "NUMBER ONLY]\n");
                            System.out.println("1) Edit the title.\n2) Edit the author.\n3) Edit the genre.\n4) Edit " +
                                    "the year of the publication.\n5) Return to main menu.");

                            int editOptions = myScanner.nextInt();

                            switch (editOptions) {
                                case 1:
                                    System.out.println("What is the new title of the book?");
                                    myScanner.nextLine();
                                    element.setBookTitle(myScanner.nextLine());
                                    break;

                                case 2:
                                    System.out.println("What is the new author of the book?");
                                    myScanner.nextLine();
                                    element.setBookAuthor(myScanner.nextLine());
                                    break;

                                case 3:
                                    System.out.println("What's the new genre of the book?");
                                    myScanner.nextLine();
                                    element.setGenre(myScanner.nextLine());
                                    break;

                                case 4:
                                    System.out.println("What's the new year of publication?");
                                    myScanner.nextLine();
                                    element.setYearOfPublication(myScanner.nextLine());
                                    break;

                                case 5:
                                    System.out.println("Returning to the main menu.");
                                    searchOptions = 3;
                                    break;
                            }

                            System.out.println("The new book information is:  \n");
                            element.printDetails();
                            break;

                        case 2:
                            System.out.println("You've chosen to borrow/delete the book from the library. Please type" +
                                    " YES to confirm.  Please type NO to cancel.");

                            myScanner.nextLine();

                            String deletionConfirmation = myScanner.nextLine();

                            if (deletionConfirmation.equalsIgnoreCase("YES")) {
                                Iterator<Book> elementIterator = allBooks.iterator();

                                while (elementIterator.hasNext()) {
                                    element = elementIterator.next();

                                    if (element.getBookTitle().toUpperCase().contains(searchTerm.toUpperCase())) {
                                        elementIterator.remove();
                                        searchOptions = 3;
                                        break;
                                    }
                                }
                            } else {
                                searchOptions = 3;
                            }
                    }
                }
            }
            if (!match) {
                System.out.println("\nNo matches found in the library.\n");
            }
        }
    }

    public void seeAllBooksInLibrary(){
        for (Book bookInfo : allBooks)
              {
            bookInfo.printDetails();
        }
    }
}

