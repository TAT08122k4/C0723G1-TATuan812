package com.example.tuan_be_sprint2.repository;

import com.example.tuan_be_sprint2.dto.BookProductDto;
import com.example.tuan_be_sprint2.model.BookProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookProductRepository extends JpaRepository<BookProduct,Integer> {
    @Query(nativeQuery = true, value = "SELECT bp.id, bp.author_id, bp.genre_id, bp.language_book_id, bp.name_book, bp.amount_book, bp.introduce_book,bp.image_of_book ,bp.like_book, bp.is_delete, bp.price, bp.publisher, bp.year_of_publication, a.name_author, g.name_genre, l.name_language " +
            "FROM book_product bp " +
            "JOIN author a ON a.id = bp.author_id " +
            "JOIN genre g ON g.id = bp.genre_id " +
            "JOIN language_book l ON l.id = bp.language_book_id " +
            "WHERE (bp.name_book LIKE %:nameBook%) " +
            "AND (bp.author_id = :authorId OR :authorId = 0) " +
            "AND (bp.language_book_id = :languageId OR :languageId = 0) " +
            "AND (bp.genre_id = :genreId OR :genreId = 0)")
    Page<BookProduct> bookProductList(@Param("nameBook") String nameBook, @Param("authorId") int authorId, @Param("languageId") int languageId, @Param("genreId") int genreId, Pageable pageable);

    @Query(nativeQuery = true , value = "select * from book_product bp JOIN author a ON a.id = bp.author_id JOIN genre g ON g.id = bp.genre_id JOIN language_book l ON l.id = bp.language_book_id   where bp.id = :id and bp.is_delete = 0;")
    BookProduct findBookById(@Param("id") int id);

    @Query(nativeQuery = true, value = "SELECT bp.* FROM book_product bp ORDER BY bp.like_book DESC LIMIT 10")
    List<BookProduct> topBookLikeMost();
    @Query(nativeQuery = true, value = "select * from book_product where name_book = :nameBook")
            BookProduct findBookByName(@Param("nameBook") String nameBook);

}
