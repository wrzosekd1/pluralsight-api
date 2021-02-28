package com.pluralsight.pluralsightAPI.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Pattern;

@Document(collection = "users")
@JsonInclude(JsonInclude.Include.NON_NULL)
public @Data class User {
    @Id
    private final String id;
    @Pattern(message="invalid first name", regexp = "^[a-zA-Z]*$")
    private final String firstName;
    @Pattern(message="invalid last name", regexp = "^[a-zA-Z\\s]*$")
    private final String lastName;
    @Pattern(message="invalid userName", regexp = "^[a-zA-Z\\s]*$")
    private final String userName;
    @Pattern(message="invalid password", regexp = "^[a-zA-Z\\s]*$")
    private final String password;

}
