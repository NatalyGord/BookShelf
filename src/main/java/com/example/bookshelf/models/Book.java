package com.example.bookshelf.models;

import javax.persistence.*;

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

//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Column(nullable = false)
    @JoinColumn(name = "autorId")     //внешний ключ
    private Long autorId;

    public Book(){
    }
    public Book(String title, Integer indexNumber, Boolean availability, Long autorId) {
        this.title = title;
        this.indexNumber = indexNumber;
        this.availability = availability;
        this.autorId = autorId;

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

    public Long getAutorId() {
        return autorId;
    }

    public void setAutorId(Long autorId) {
        this.autorId = autorId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", indexNumber=" + indexNumber +
                ", availability=" + availability +
                ", autorID=" + autorId +
                '}';
    }

}
