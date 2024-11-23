package OOP;

class Book {
    private String name;
    private Author author;
    private int publicationYear;

    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Геттеры
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }

    // Сеттер
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return name +  author +  publicationYear;
    }
}