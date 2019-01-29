package com.company;

public class Library {

    private Book[] allBooks = new Book[3];

    public void addBookToLibrary(Book book) {
        for (int i = 0; i < allBooks.length; i++) {
            if (allBooks[i] == null) {
                allBooks[i] = book;
                break;
            }
        }
    }

    public int numberOfBooksInLibrary() {
        int numOfBooks = 0;
        for (int i = 0; i < allBooks.length; i++) {
            if (allBooks[i] != null)
                numOfBooks++;
        } return numOfBooks;
    }

    public boolean libraryIsFull(){
        return numberOfBooksInLibrary() == allBooks.length;
    }

    public boolean libraryHasRoom(){
        return !libraryIsFull();
    }

}
