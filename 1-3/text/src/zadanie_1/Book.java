package zadanie_1;

public class Book {

    private String name;
    private int number_of_pages;

    //конструктор (3шт)
    public Book() {
        this.name = "Some book";
        this.number_of_pages = 42;
    }

    public Book(String name) {
        this.name = name;
        this.number_of_pages = 42;
    }

    public Book(String name, int number_of_pages) {
        this.name = name;
        this.number_of_pages = number_of_pages;
    }


    public String get_name() {
        return this.name;
    }

    public int get_number_of_pages() {
        return this.number_of_pages;
    }

    public void set_name(String name) {
        this.name = name;

    }

}
