package com.example.bookshelf.services;

import com.example.bookshelf.models.Autor;
import com.example.bookshelf.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {

    @Autowired
    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }
    public Autor createAutor(Autor autor){    //создать автора
        return autorRepository.save(autor);
    }

    public Autor updateAutor(Long autorId, Autor autorNew){   //редактировать автора
        Autor autor = autorRepository.getById(autorId);
        autor.setSurnameAutor(autorNew.getSurnameAutor());
        autor.setNameAutor(autorNew.getNameAutor());
        autor.setPatronymicautor(autorNew.getPatronymicautor());
        autor.setDateOfBirth(autorNew.getDateOfBirth());
        autor.setBiography(autorNew.getBiography());

        return autorRepository.save(autor);
    }
}
