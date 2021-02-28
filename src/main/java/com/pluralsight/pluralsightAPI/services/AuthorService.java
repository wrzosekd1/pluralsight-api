package com.pluralsight.pluralsightAPI.services;

import com.pluralsight.pluralsightAPI.models.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getAuthors();
    Author addAuthor(Author author);

    Author updateAuthor(Author author);

    void deleteAuthor(String authorId) throws Exception;
}
