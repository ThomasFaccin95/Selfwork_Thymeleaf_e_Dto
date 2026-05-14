package it.aulab.progetto_blog.services;

import java.util.List;

import it.aulab.progetto_blog.dtos.AuthorDto;
import it.aulab.progetto_blog.models.Author;

public interface AuthorService {

    // Legge tutti gli autori
    List<AuthorDto> readAll();
    
    // Legge un autore specifico tramite il suo ID
    AuthorDto read(Long id);
    
    // Cerca autori tramite la loro email
    List<AuthorDto> read(String email);
    
    // Cerca autori per nome e cognome
    List<AuthorDto> read(String firstname, String lastname);
    
    // Crea un nuovo autore
    AuthorDto create(Author author);
    
    // Aggiorna un autore esistente tramite ID
    AuthorDto update(Long id, Author author);
    
    // Elimina un autore tramite ID
    void delete(Long id);

}
