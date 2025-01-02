package com.tmane.springdatarestappdemo.entity;

import com.tmane.springdatarestappdemo.enums.Subject;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer pageNumbers;
    @Enumerated(EnumType.STRING)
    private Subject subject;
    @ManyToOne
    private Author author;
}
