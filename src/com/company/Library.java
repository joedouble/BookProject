package com.company;

public class Library {

    public Book[] allBooks = new Book[10];


    public int numberOfBooksInLibrary() {
        int counter = 0;
        for(int i = 0; i < allBooks.length; i++) {
            if(allBooks[i] != null)
                counter++;}

        return counter;
    }

}
