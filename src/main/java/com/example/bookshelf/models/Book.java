package com.example.bookshelf.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookId")
    private Long bookId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "indexNumber", nullable = false)
    private Integer indexNumber;

    @Column(name = "availability", nullable = false)
    private Boolean availability;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "autorId")     //внешний ключ
    private Autor autor;

    public Book(){
    }
    public Book(String title, Integer indexNumber, Boolean availability, Autor autor) {
        this.title = title;
        this.indexNumber = indexNumber;
        this.availability = availability;
        this.autor = autor;
    }

    public Long getBookId() {
        return bookId;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(Integer indexNumber) {
        this.indexNumber = indexNumber;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", indexNumber=" + indexNumber +
                ", availability=" + availability +
                ", autorID=" + autor.getAutorId() +
                '}';
    }

}
