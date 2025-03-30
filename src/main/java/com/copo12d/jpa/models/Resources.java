package com.copo12d.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "Resources")
public class Resources extends BaseEntity {

    private String name;
    private int size;
    private String url;
    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;


}
