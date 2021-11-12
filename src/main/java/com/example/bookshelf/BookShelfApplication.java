package com.example.bookshelf;

import com.example.bookshelf.models.Autor;
import com.example.bookshelf.models.Book;
import com.example.bookshelf.services.AutorService;
import com.example.bookshelf.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.Date;

@SpringBootApplication
public class BookShelfApplication {

    @Autowired
    private BookService bookServ;

    @Autowired
    private AutorService autorServ;

    public static void main(String[] args) {
        SpringApplication.run(BookShelfApplication.class, args);
    }

    //  Для начального заполнения БД раскоментировать

//    @EventListener(ApplicationReadyEvent.class)
//    private void testJpaMethods(){
//        Autor autor = new Autor();
//        Date date = new Date(1809-04-01);
//        autor.setNameAutor("Николай");
//        autor.setSurnameAutor("Гоголь");
//        autor.setPatronymicautor("Васильевич");
//        autor.setDateOfBirth(date);
//        autor.setBiography("биография Гоголя");
//
//        Book book = new Book();
//        book.setTitle("Мертвые души");
//        book.setIndexNumber(105);
//        book.setAvailability(true);
//        book.setAutorId(1L);
//
//        Autor autor1 = new Autor();
//        Date date1 = new Date(1799-05-26);
//        autor1.setNameAutor("Александр");
//        autor1.setSurnameAutor("Пушкин");
//        autor1.setPatronymicautor("Сергеевич");
//        autor1.setDateOfBirth(date1);
//        autor1.setBiography("биография Пушкина");
//
//        Book book1 = new Book();
//        book1.setTitle("Вечера на хуторе близ Диканьки");
//        book1.setIndexNumber(455);
//        book1.setAvailability(true);
//        book1.setAutorId(1L);
//
//        Book book2 = new Book();
//        book2.setTitle("Руслан и Людмила");
//        book2.setIndexNumber(608);
//        book2.setAvailability(false);
//        book2.setAutorId(2L);
//
//        autorServ.createAutor(autor);
//        autorServ.createAutor(autor1);
//        bookServ.createBook(book);
//        bookServ.createBook(book1);
//        bookServ.createBook(book2);
//    }
}
