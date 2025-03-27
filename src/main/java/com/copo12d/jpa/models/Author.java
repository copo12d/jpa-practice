package com.copo12d.jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Author {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;

}
