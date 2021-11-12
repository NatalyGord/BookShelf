package com.example.bookshelf.services;

import com.example.bookshelf.models.Book;
import com.example.bookshelf.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public List<Book> getAllBooks(){  //получить все книги
        return bookRepository.findAll();
    }

    public Book getBookById(Long bookId){      //Получить книгу по ID
        return bookRepository.findById(bookId).orElse(null);
    }
    public List<Book> findByAvailability(Boolean availability){  //получить книги по наличию на полке
        return bookRepository.findByAvailability(availability);
    }

    public Book createBook(Book book){      //Создать книгу
        return bookRepository.save(book);
    }

    public Book updateBook(Long bookId, Book bookNew){   //редактировать книгу
        Book book = bookRepository.getById(bookId);
        book.setTitle(bookNew.getTitle());
        book.setAutorId(bookNew.getAutorId());
        book.setIndexNumber(bookNew.getIndexNumber());
        book.setAvailability(bookNew.getAvailability());

        return bookRepository.save(book);
    }
    public ResponseEntity deleteBook(Long bookId){   //удалить книгу
        Book book = bookRepository.getById(bookId);
        bookRepository.delete(book);
        return ResponseEntity.ok().build();
    }
}
