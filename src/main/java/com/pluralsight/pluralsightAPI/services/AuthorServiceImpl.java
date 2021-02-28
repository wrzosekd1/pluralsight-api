package com.pluralsight.pluralsightAPI.services;

import com.pluralsight.pluralsightAPI.models.Author;
import com.pluralsight.pluralsightAPI.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    AuthorRepository repository;

    @Override
    public List<Author> getAuthors() {
        return repository.findAll();
    }

    @Override
    public Author addAuthor(Author author) {
        return repository.insert(author);
    }

    @Override
    public Author updateAuthor(Author author) {
        return repository.save(author);
    }

    @Override
    public void deleteAuthor(String authorId) throws Exception {
        if(authorId == null) {
            throw new Exception("authorId is null");
        } else {
            repository.deleteById(authorId);
        }
    }
}
