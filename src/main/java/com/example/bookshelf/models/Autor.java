package com.example.bookshelf.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "autors")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "autorId")
    private Long autorId;

    @Column(name = "surnameAutor", nullable = false)
    private String surnameAutor;

    @Column(name = "nameAutor", nullable = false)
    private String nameAutor;

    @Column(name = "patronymicautor")
    private String patronymicautor;

    @Column(name = "dateOfBirth", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Column(name = "biography", nullable = false)
    private String biography;

    public Autor(){
    }
    public Autor(String surnameAutor, String nameAutor, String patronymicautor, Date dateOfBirth, String biography) {
        this.surnameAutor = surnameAutor;
        this.nameAutor = nameAutor;
        this.patronymicautor = patronymicautor;
        this.dateOfBirth = dateOfBirth;
        this.biography = biography;
    }
    public Autor(String surnameAutor, String nameAutor, Date dateOfBirth, String biography) {
        this.surnameAutor = surnameAutor;
        this.nameAutor = nameAutor;
        this.dateOfBirth = dateOfBirth;
        this.biography = biography;
        this.patronymicautor = null;
    }

    public Long getAutorId() {
        return autorId;
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

    @Override
    public String toString() {
        return "Autor{" +
                "autorId=" + autorId +
                ", surnameAutor='" + surnameAutor + '\'' +
                ", nameAutor='" + nameAutor + '\'' +
                ", patronymicautor='" + patronymicautor + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", biography='" + biography + '\'' +
                '}';
    }
}
