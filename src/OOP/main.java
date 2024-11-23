package OOP;

public class main {
    public static void main(String[] args) {
        Author author1 = new Author("Иван ", "Петров ");
        Author author2 = new Author("Анна ", "Иванова ");

        Book book1 = new Book("Война и мир, ", author1, 1869);
        Book book2 = new Book("Преступление и наказание, ", author2, 1866);

        System.out.println(book1);
        System.out.println(book2);

        book1.setPublicationYear(1870); // Изменение года публикации книги book1

        System.out.println("Книга после изменения года публикации: ");
        System.out.println(book1);
    }
}