package LowLevelDesignProblems.LibraryManagementSystem;

import java.util.List;

public class Book {
    private String isbn;
    private String title;
    private String publisher;
    private int pages;
    private String description;
    private String language;
    private List<String> authors;

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public List<String> getAuthors() {
        return authors;
    }
}
