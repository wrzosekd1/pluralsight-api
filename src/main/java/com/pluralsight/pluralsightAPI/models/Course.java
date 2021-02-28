package com.pluralsight.pluralsightAPI.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Pattern;

@Document(collection = "courses")
@JsonInclude(JsonInclude.Include.NON_NULL)
public @Data class Course {

    @Id
    private final String id;
    @Pattern(message="invalid title", regexp = "^[a-zA-Z]*$")
    private final String title;
    private final String slug;
    @Pattern(message="invalid category", regexp = "^[a-zA-Z\\-\\s]*$")
    private final String category;
    private final Author author;
}
