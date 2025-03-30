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
@Table(name = "Lecture")
public class Lecture extends BaseEntity {

    private String name;
    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section sections;
    @OneToOne
    @JoinColumn(name = "resource_id")
    private Resources resources;
}
