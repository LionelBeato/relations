package works.lionel.relations.repo;

import org.springframework.data.repository.CrudRepository;
import works.lionel.relations.model.Book;

public interface BookRepo extends CrudRepository<Book, Long> {
}
