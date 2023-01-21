package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {

    private String telephoneNumber;
    List<Book> books = new ArrayList<>();

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return telephoneNumber.equals(person.telephoneNumber) && books.equals(person.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telephoneNumber, books);
    }

    @Override
    public String toString() {
        return "Person{" +
                "telephoneNumber='" + telephoneNumber + '\'' +
                ", books=" + books +
                '}';
    }
}
