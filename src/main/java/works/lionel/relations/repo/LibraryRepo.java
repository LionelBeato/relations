package works.lionel.relations.repo;

import org.springframework.data.repository.CrudRepository;
import works.lionel.relations.model.Library;

public interface LibraryRepo extends CrudRepository<Library, Long> {
}
