public class Book {
    private String nameBook;
    private String nameAuthor;
    private int publishingYear;

    public Book(String nameBook, String nameAuthor, int publishingYear) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.publishingYear = publishingYear;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

}
