package works.lionel.relations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import works.lionel.relations.model.Book;
import works.lionel.relations.model.Library;
import works.lionel.relations.repo.BookRepo;
import works.lionel.relations.repo.LibraryRepo;

import java.util.ArrayList;
import java.util.List;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    LibraryRepo libraryRepo;
    @Autowired
    BookRepo bookRepo;

    @Override
    public void run(String... args) throws Exception {
        Library library = new Library("Hartford");
        Book bookOne = new Book("Hello", library);
        Book bookTwo = new Book("Hi", library);

        List<Book> bookList = new ArrayList<>();
        bookList.add(bookOne);
        bookList.add(bookTwo);

        library.setBookList(bookList);
        libraryRepo.save(library);


        bookRepo.save(bookOne);
        bookRepo.save(bookTwo);

    }
}
