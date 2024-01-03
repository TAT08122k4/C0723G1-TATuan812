package com.example.thim4.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TheLoai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTheLoai;
    private String tenTheLoai;
    @OneToMany(mappedBy = "theLoai")
    private Set<Tranh> tranhs;
}
