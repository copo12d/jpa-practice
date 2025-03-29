package com.copo12d.jpa.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "AUTHOR_TBL")
@Data
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "author_seq"
    )
    @SequenceGenerator(
            name = "author_seq",
            sequenceName = "author_seq",
            allocationSize = 1
    )
    private Integer id;
    @Column(
            name ="f_name"
    )
    private String firstName;
    private String lastName;
    @Column(
            unique = true,
            nullable = false
    )
    private String email;
    private int age;
    @Column(
            nullable = false,
            updatable = false
    )
    private LocalDate createAt;
    @Column(
            insertable = false
    )
    private LocalDate lastUpdateAt;

}
