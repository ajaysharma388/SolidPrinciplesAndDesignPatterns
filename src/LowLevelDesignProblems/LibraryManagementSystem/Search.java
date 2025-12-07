package LowLevelDesignProblems.LibraryManagementSystem;

import java.util.List;

interface Search {
    // we would like the Members to all the search using name, title, Authors, subject, publisher
    List<Book> searchByISBN(String Name);
    List<Book> searchByAuthor(String Author);
    List<Book> searchByPublisher(String publisher);
    List<Book> searchByTitle(String Title);
}


