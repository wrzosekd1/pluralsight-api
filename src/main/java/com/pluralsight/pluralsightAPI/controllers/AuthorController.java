package com.pluralsight.pluralsightAPI.controllers;

import com.pluralsight.pluralsightAPI.models.Author;
import com.pluralsight.pluralsightAPI.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService service;

    @GetMapping
    public List<Author> getAuthors() {
        return service.getAuthors();
    }

    @PostMapping
    public Author addAuthor(@Valid @RequestBody Author author) {
        return service.addAuthor(author);
    }

    @PutMapping
    public Author updateAuthor(@Valid @RequestBody Author author) {

        return service.updateAuthor(author);
    }

    @DeleteMapping
    public ResponseEntity deleteAuthor(@RequestParam("id") String id) throws Exception {
        service.deleteAuthor(id);
        HashMap<String,String> resp = new HashMap<>();
        resp.put("message", "Author is successfully deleted");
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }
}
