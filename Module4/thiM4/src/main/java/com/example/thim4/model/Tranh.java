package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Tranh {
    @Id
    @GeneratedValue
    private int id;
    private String tenTacPham;
    private String hoaSi;
    private String namVe;
    private String kichThuoc;
    @OneToMany(mappedBy = "idTheLoai")
    private Set<TheLoai> theLoai;
}
