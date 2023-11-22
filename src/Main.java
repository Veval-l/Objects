public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println();

        Book book1 = new Book("Магистр темного пути", 2022);
        System.out.println("book1.nameBook = " + book1.nameBook);
        System.out.println("book1.yearOfIssues = " + book1.yearOfIssues);

        Book book2 = new Book("Гарри Поттер", 200);
        System.out.println("book2.nameBook = " + book2.nameBook);
        System.out.println("book2.yearOfIssues = " + book2.yearOfIssues);

        System.out.println();

    }
}