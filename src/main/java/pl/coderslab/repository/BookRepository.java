package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.app.model.Book;
import pl.coderslab.app.model.Category;

import java.math.BigInteger;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, BigInteger> {


    List<Book> findByTitle(String title);

    List<Book> findByCategory(Category category);

    List<Book> findByCategoryId(Long id);

    List<Book> findAllByRating(int rating);

    List<Book> findByRatingAndTitle(int rating, String title);
}
