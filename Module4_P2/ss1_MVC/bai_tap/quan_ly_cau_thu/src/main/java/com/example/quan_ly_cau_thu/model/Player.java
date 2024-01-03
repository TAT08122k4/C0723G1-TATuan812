package com.example.quan_ly_cau_thu.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int numberOfShirt;
    private String club;
    private String gender;
    private int age;
    private String StrongPoint;
    private Date dob;
    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

}
