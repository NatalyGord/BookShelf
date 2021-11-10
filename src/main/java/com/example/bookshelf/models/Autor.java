package com.example.bookshelf.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "autors")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long autorId;

    @Column
    private String surnameAutor;

    @Column
    private String nameAutor;

    @Column
    private String patronymicautor;

    @Column
    private Date dateOfBirth;

    @Column
    private String biography;

    public Long getAutorId() {
        return autorId;
    }

    public void setAutorId(Long autorId) {
        this.autorId = autorId;
    }

    public String getSurnameAutor() {
        return surnameAutor;
    }

    public void setSurnameAutor(String surnameAutor) {
        this.surnameAutor = surnameAutor;
    }

    public String getNameAutor() {
        return nameAutor;
    }

    public void setNameAutor(String nameAutor) {
        this.nameAutor = nameAutor;
    }

    public String getPatronymicautor() {
        return patronymicautor;
    }

    public void setPatronymicautor(String patronymicautor) {
        this.patronymicautor = patronymicautor;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
