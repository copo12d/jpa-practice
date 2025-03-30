package com.copo12d.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Section")
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int SectionOrder;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course courses;
    @OneToMany(mappedBy = "sections")
    private List<Lecture> lectures;
}
