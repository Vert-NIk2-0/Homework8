public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Преступление и наказание", "Федор достоевский", 1866);
        lib.addBook("Анна Каренина", "Лев Толстой", 1873);
        lib.addBook("Мертвые души", "Николай Гоголь", 1842);
        lib.addBook("Евгений Онегин", "Александр Пушкин", 1833);
        lib.printBooks();

        lib.removeBook("Преступление и наказание", "Федор достоевский", 1866);
        lib.printBooks();
        
        lib.findBook("Анна Каренина");

    }
}