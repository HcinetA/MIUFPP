package prob3;

public class Book {
    private String ISBN;
    private String title;
    private String author;
    private boolean isBorrwed ;


    public Book (String ISBN, String title, String author){
        this.ISBN = ISBN;
        this.title = title;
        this.author =author;
        this.isBorrwed = false;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrwed() {
        return isBorrwed;
    }

    public void setBorrwed(boolean borrwed) {
        isBorrwed = borrwed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "ISBN: " + ISBN + ", Title: " + title + ", Author: " + author + ", Borrowed: " + isBorrwed;

    }
}
