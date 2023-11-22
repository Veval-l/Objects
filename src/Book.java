public class Book {

    private String nameBook;
    private int yearOfIssues;

    public Book(String nameBook, int yearOfIssues) {
        this.nameBook = nameBook;
        this.yearOfIssues = yearOfIssues;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYearOfIssues() {
        return this.yearOfIssues;
    }
    public void setYearOfIssues(int yearOfIssues) {
        this.yearOfIssues = yearOfIssues;
    }

}
