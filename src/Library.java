import java.util.*;

public class Library {
    private Map<String, Book> books = new HashMap<>();
    private Set<Book> sortedBooks = new TreeSet<>(BookComparator.getTitleAuthorYearComparator());
    public void addBook(String title, String author, int year) {
        if(!books.containsKey(title)) {
            Book newBook = new Book(title, author, year);
            books.put(title, newBook);
            System.out.println("Книга добавлена в библиотеку.");
        } else System.out.println("Книга с таким названием уже есть в библиотеке!");
    }

    public void removeBook(String title, String author, int year) {
        if(books.containsKey(title)) {
            books.remove(title);
        } else System.out.println("Нет такой книги!");
    }

    public void findBook(String title) {
        if (books.containsKey(title)) {
            System.out.println("Вы искали книгу:\n" + books.get(title));
        } else System.out.println("В библиотеке нет такой книги!");
    }

    public void printBooks() {

        sortedBooks.addAll(books.values());
        if(books.isEmpty()) {
            System.out.println("Библиотека пуста :(");
            return;
        }
        System.out.printf("\nКниг в библиотеке - %d\n", books.size());
        for (Book book : sortedBooks) {
            System.out.println(book);
        }
    }
}
