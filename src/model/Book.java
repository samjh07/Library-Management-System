package model;

import java.io.Serializable;

public class Book implements Serializable {

    private String bookId;
    private String title;
    private String author;
    private String category;
    private boolean issued;
    private String issuedTo;

    // Constructor
    public Book(String bookId, String title, String author, String category) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.issued = false;
        this.issuedTo = "";
    }

    // Getters
    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public boolean isIssued() {
        return issued;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    public void setIssuedTo(String issuedTo) {
        this.issuedTo = issuedTo;
    }

    @Override
    public String toString() {

        return "\n=============================="
                + "\nBook ID     : " + bookId
                + "\nTitle       : " + title
                + "\nAuthor      : " + author
                + "\nCategory    : " + category
                + "\nStatus      : " + (issued ? "Issued" : "Available")
                + "\nIssued To   : " + (issued ? issuedTo : "N/A")
                + "\n==============================";
    }
}