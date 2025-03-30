package com.copo12d.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "Section")
public class Section extends BaseEntity {

    private String name;
    private int SectionOrder;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course courses;
    @OneToMany(mappedBy = "sections")
    private List<Lecture> lectures;
}
