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

    public Book(String bookTitle, String bookAuthor, String genre, String yearOfPublication) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.genre = genre;
        this.yearOfPublication = yearOfPublication;
    }

    public void printDetails() {
        System.out.println("Book Title is:  " + bookTitle +
                "\nBook Author is :  " + bookAuthor +
                "\nThe book genre is:  " + genre +
                "\nThe year of publication is:  " + yearOfPublication + "\n");
    }

}
