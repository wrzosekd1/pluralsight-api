package com.pluralsight.pluralsightAPI.models;

import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "authors")
@JsonInclude(JsonInclude.Include.NON_NULL)
public @Data class Author {

    @Id
    private final String id;
    @Pattern(message="invalid name", regexp = "^[a-zA-Z\\s]*$")
    private final String name;
}
