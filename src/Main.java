public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println();

        Book book1 = new Book("Магистр темного пути", 2022);
        System.out.println("book1.nameBook = " + book1.nameBook);
        System.out.println("book1.yearOfIssues = " + book1.yearOfIssues);

        Author author1 = new Author("Мосян", "Тунсю");
        System.out.println("Автор: " + author1.name + " " + author1.surname);

        System.out.println();

        Book book2 = new Book("Гарри Поттер", 2000);
        System.out.println("book2.nameBook = " + book2.nameBook);
        System.out.println("book2.yearOfIssues = " + book2.yearOfIssues);

        Author author2 = new Author("Джоан", "Роулинг");
        System.out.println("Автор: " + author2.name + " " + author2.surname);


        System.out.println();

    }
}