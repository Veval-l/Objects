public class Book {

    private String nameBook;
    private int yearOfIssues;

    private Author author;

    public Book(String nameBook, int yearOfIssues, Author author) {
        this.nameBook = nameBook;
        this.yearOfIssues = yearOfIssues;
        this.author = author;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYearOfIssues() {
        return this.yearOfIssues;
    }
    public Author getAuthor() {
        return this.author;
    }
    public void setYearOfIssues(int yearOfIssues) {
        this.yearOfIssues = yearOfIssues;
    }

}
