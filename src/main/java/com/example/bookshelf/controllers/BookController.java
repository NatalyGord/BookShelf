package com.example.bookshelf.controllers;

import com.example.bookshelf.models.Autor;
import com.example.bookshelf.models.Book;
import com.example.bookshelf.services.AutorService;
import com.example.bookshelf.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private AutorService autorService;

    @GetMapping("/books")   //получить все книги
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/books/sort/ASC")   //сортировка таблицы books по возрастанию столбец title
    public List<Book> getAllBooksSortAll_ASC(){
        return bookService.sortAll_ASC();
    }
    @GetMapping("/books/sort/DESC")   //сортировка таблицы books по убыванию столбец title
    public List<Book> getAllBooksSortAll_DESC(){
        return bookService.sortAll_DESC();
    }

    @GetMapping("/books/sort/numASC")   //сортировка таблицы books по возрастанию столбец indexNumber
    public List<Book> getAllBooksSortAll_numASC(){
        return bookService.sortAll_numASC();
    }
    @GetMapping("/books/sort/numDESC")   //сортировка таблицы books по убыванию столбец indexNumber
    public List<Book> getAllBooksSortAll_numDESC(){
        return bookService.sortAll_numDESC();
    }

    @GetMapping("/books/autor/{autorId}")        //найти все книги по автору
    public List<Book> findByAutorId(@PathVariable(value = "autorId") Long autorId){
        return bookService.findByAutorId(autorId);
    }

    @GetMapping("/books/true")   //получить все книги доступные
    public List<Book> findByAvailability(){
        return bookService.findByAvailability(true);
    }
    @GetMapping("/books/false")   //получить все книги отсутствующие
    public List<Book> findByAvailability2(){
        return bookService.findByAvailability(false);
    }

    @GetMapping("/books/{bookId}")   //Получить книгу по ID
    public Book getBookById(@PathVariable(value = "bookId") Long bookId){
        return bookService.getBookById(bookId);
    }

    @PostMapping("/books")   //создать книгу
    public Book createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

    @PutMapping("/books/{bookId}")  //редактировать книгу
    public Book updateBook(@PathVariable(value = "bookId") Long bookId,
                           @RequestBody Book bookNew){
        return bookService.updateBook(bookId, bookNew);
    }

    @DeleteMapping("/books/{bookId}")  //удалить книгу
    public ResponseEntity deleteBook(@PathVariable(value = "bookId") Long bookId){
        return bookService.deleteBook(bookId);
    }

    @PostMapping("/autors")   //создать автора
    public Autor createAutor(@RequestBody Autor autor){
        return autorService.createAutor(autor);
    }

    @PutMapping("/autors/{autorId}")  //редактировать автора
    public Autor updateAutor(@PathVariable(value = "autorId") Long autorId,
                           @RequestBody Autor autorNew){
        return autorService.updateAutor(autorId, autorNew);
    }
}
