package LowLevelDesignProblems.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookCatalog implements Search {
    private final HashMap<String, Book> isbnMap;
    private final HashMap<String, List<Book>> authorMap;
    private final HashMap<String, List<Book>> publisherMap;
    private final HashMap<String, Book> titleMap;

    public BookCatalog(ArrayList<Book> books) {
        isbnMap = new HashMap<>();
        authorMap = new HashMap<>();
        publisherMap = new HashMap<>();
        titleMap = new HashMap<>();
        init(books);
    }

    void init(ArrayList<Book> books) {
        for (Book book : books) {
            this.isbnMap.put(book.getIsbn(), book);
            this.titleMap.put(book.getTitle(), book);
            for(String author : book.getAuthors()) {
                if(!this.authorMap.containsKey(author)) {
                    this.authorMap.put(author, new ArrayList<>());
                }
                this.authorMap.get(author).add(book);
            }
            if(!this.publisherMap.containsKey(book.getPublisher())) {
                this.publisherMap.put(book.getPublisher(), new ArrayList<>());
            }
            this.publisherMap.get(book.getPublisher()).add(book);
        }
    }

    public List<Book> search(String searchQuery)
    {
        List<Book> booksData = new ArrayList<>();
        booksData.addAll(searchByTitle(searchQuery));
        booksData.addAll(searchByISBN(searchQuery));
        booksData.addAll(searchByAuthor(searchQuery));
        booksData.addAll(searchByPublisher(searchQuery));
        return booksData;
    }

    @Override
    public List<Book> searchByISBN(String isbn) {
        List<Book> booksData = new ArrayList<>();
        if (this.isbnMap.containsKey(isbn)) {
            booksData.add(this.isbnMap.get(isbn));
        }
        return booksData;
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        List<Book> booksData = new ArrayList<>();
        if (this.authorMap.containsKey(author)) {
            booksData.addAll(this.authorMap.get(author));
        }
        return booksData;
    }

    @Override
    public List<Book> searchByPublisher(String publisher) {
        List<Book> booksData = new ArrayList<>();
        if (this.publisherMap.containsKey(publisher)) {
            booksData.addAll(this.publisherMap.get(publisher));
        }
        return booksData;
    }

    @Override
    public List<Book> searchByTitle(String Title) {
        List<Book> booksData = new ArrayList<>();
        if (this.titleMap.containsKey(Title)) {
            booksData.add(this.titleMap.get(Title));
        }
        return booksData;
    }
}
