package com.dockerdemo2.dockerDemo2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String description;

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Note{" +
                "description='" + description + '\'' +
                '}';
    }
}
