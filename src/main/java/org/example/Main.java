package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Михаил", "Булгаков");
        Author author2 = new Author("Фёдор", "Достоевский");
        Author author3 = new Author("Лев", "Толстой");
        Author author4 = new Author("Александр", "Пушкин");
        Author author5 = new Author("Джейн", "Остин");

        Book book1 = new Book("Мастер и Маргарита", new Author[]{author1});
        Book book2 = new Book("Преступление и наказание", new Author[]{author2});
        Book book3 = new Book("Анна Каренина", new Author[]{author3});
        Book book4 = new Book("Евгений Онегин", new Author[]{author4});
        Book book5 = new Book("Гордость и предубеждение", new Author[]{author5});

        Book[] books = {book1, book2, book3, book4, book5};

        for (Book book : books) {
            System.out.println(book);
        }
    }
}