package com.example.bookshelf.repository;

import com.example.bookshelf.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAvailability(boolean availability);



    //сортировка таблицы books по возрастанию столбец title
    @Query(value = "SELECT * FROM books ORDER BY title ASC", nativeQuery = true)
    List<Book> sortAll_ASC();

    //сортировка таблицы books по убыванию столбец title
    @Query(value = "SELECT * FROM books ORDER BY title DESC", nativeQuery = true)
    List<Book> sortAll_DESC();

    //сортировка таблицы books по возрастанию столбец indexNumber
    @Query(value = "SELECT * FROM books ORDER BY index_number ASC", nativeQuery = true)
    List<Book> sortAll_numASC();

    //сортировка таблицы books по убыванию столбец indexNumber
    @Query(value = "SELECT * FROM books ORDER BY index_number DESC", nativeQuery = true)
    List<Book> sortAll_numDESC();

}
