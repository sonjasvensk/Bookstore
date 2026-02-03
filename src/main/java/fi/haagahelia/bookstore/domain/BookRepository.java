package fi.haagahelia.bookstore.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    // CRUD toiminnot tulevat CrudRepositorysta
    // @Query annotaatiolla voi kovakoodata SQL:n:

    //@Query(value = "SELECT * FROM book WHERE REGEXP_LIKE(title, '[åäöÅÄÖ]')", nativeQuery = true)
    //List<Book> findBooksWithScandiLetters();

    // Jos halutaan automaatti, joka hakee kirjan nimellä niin:
    List<Book> findByTitle(String title);
}
