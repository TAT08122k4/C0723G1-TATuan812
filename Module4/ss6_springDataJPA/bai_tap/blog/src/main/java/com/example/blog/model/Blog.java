package com.example.blog.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String introduce;
    private String img;
    @Column(columnDefinition = "LongText")
    private String content;
    private LocalDateTime timeToCreateBlog;

    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;
}
