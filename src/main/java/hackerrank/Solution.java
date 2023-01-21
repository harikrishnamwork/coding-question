import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution {

    static List<Employee> employeeList = new ArrayList<>();
    static Map<String, Person> telephoneNumbers = new HashMap<>();

    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Employee librarian = new Employee("1", "librarian");
        Employee account = new Employee("2", "account");
        Employee clerk = new Employee("3", "clerk");
        Employee manager = new Employee("4", "manager");
        employeeList.add(librarian);
        employeeList.add(account);
        employeeList.add(clerk);
        employeeList.add(manager);

    }

    Boolean addNewMember(String telephoneNumber, Employee employee, String name) {
        if (Objects.isNull(telephoneNumber) || telephoneNumbers.containsKey(telephoneNumber) || ((Objects.isNull(employee)) || ((Objects.nonNull(employee) && employee.getRole().equalsIgnoreCase("librarian")))
        {
            return false;
        }
        telephoneNumbers.put(telephoneNumber, new Person(name, telephoneNumber, new ArrayList<Book>()));
        return true;
    }

    void listAllMembers(Employee employee) {
        List<Person> person = new ArrayList<>();
        if (Objects.nonNull(employee) && employee.getRole().equalsIgnoreCase("librarian")) {
            telephoneNumbers.forEach((k, ev) -> {
                person.add(ev);
            });
        }
        Collections.sort(person, Comparator.comparing(Person::getName));
        person.stream().forEach(p -> {
            System.out.println(p.getName() + " " + p.getTelephoneNumber() + " " + p.books);
        });
    }

    Person searchByName(Employee employee, String name) {
        if (Objects.nonNull(employee) && employee.getRole().equalsIgnoreCase("librarian")) {

            List<Person> person = new ArrayList<>();
            if (Objects.nonNull(employee) && employee.getRole().equalsIgnoreCase("librarian")) {
                telephoneNumbers.forEach((k, ev) -> {
                    person.add(ev);
                });
                List<Person> list = person.stream().filter(item -> item.getName().equals(name)).collect(Collectors.toList());
                if (list.size() > 0) {
                    return list.get(0);
                }
            }

        }
        return null;
    }

    List<Book> parseCSV(String path) {
        List<Book> books = new ArrayList<Book>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;

            try {
                while ((line = reader.readLine()) != null) {
                    String[] arr = line.split(",");
                    Book b = new Book(arr[0], arr[1]);
                    books.add(b);
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return books;


    }
}


class Employee {
    private String id;
    private String role;

    public Employee(String id, String role) {
        this.id = id;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Employee employee = (Employee) object;
        return java.util.Objects.equals(id, employee.id) && java.util.Objects.equals(role, employee.role);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), id, role);
    }
}

class Person {

    List<Book> books = new ArrayList<>();
    private String name;
    private String telephoneNumber;

    public Person(String name, String telephoneNumber, List<Book> books) {
        super();
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.books = books;
    }

    public Person(ArrayList<Book> arrayList) {
        books = arrayList;
    }

    public Person(String name, List<Book> books) {
        super();
        this.name = name;
        this.books = books;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Book {
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
        return "Book{" + "ISBNumber='" + ISBNumber + '\'' + ", title='" + title + '\'' + '}';
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