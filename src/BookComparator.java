import java.util.Comparator;

public class BookComparator{
    public static Comparator<Book> getTitleComparator() {
        return Comparator.comparing(Book::getTitle);
    }

    public static Comparator<Book> getAuthorComparator() {
        return Comparator.comparing(Book::getAuthor);
    }

    public static Comparator<Book> getYearComparator() {
        return Comparator.comparing(Book::getYear);
    }

    public static Comparator<Book> getTitleAuthorYearComparator() {
        return getTitleComparator().thenComparing(getAuthorComparator().thenComparing(getYearComparator()));
    }

    public static Comparator<Book> getTitleYearAuthorComparator() {
        return getTitleComparator().thenComparing(getYearComparator().thenComparing(getAuthorComparator()));
    }

}
