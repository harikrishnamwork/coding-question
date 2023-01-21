package hackerrank;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Book{


    Set<String> telephoneNumbers = new HashSet<>();

    private String ISBNumber;
    private String title;

    public Book(String ISBNumber, String title) {
        this.ISBNumber = ISBNumber;
        this.title = title;
    }

    public String getISBNumber() {
        return ISBNumber;
    }

    public void setISBNumber(String ISBNumber) {
        this.ISBNumber = ISBNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBNumber='" + ISBNumber + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(ISBNumber, book.ISBNumber) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBNumber, title);
    }
}