package pl.coderslab.Beans.Controllers;

import org.springframework.stereotype.Component;
import pl.coderslab.Beans.Model.Book;

import java.util.List;
import java.util.Optional;

@Component
public interface BookService {

    List<Book> getBooks();
    void add (Book book);
    Optional<Book> get(Long id);
    void delete(Long id);
    void update(Book book);
}
