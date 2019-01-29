package com.company;

public class Book {

    private String bookTitle;
    private String bookAuthor;
    private String genre;
    private String yearOfPublication;

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void printDetails() {
        System.out.println("Book Title is:  " + bookTitle + "\n" +
        "Book Author is :  " + bookAuthor + "\n" + "The book genre " +
                "is:  " + genre + "\n" + "The year of publication is:  " +
                yearOfPublication + "\n");
    }
}
