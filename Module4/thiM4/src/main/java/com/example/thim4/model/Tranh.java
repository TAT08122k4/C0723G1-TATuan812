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
public class Tranh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tenTacPham;
    private String hoaSi;
    private String namVe;
    private String kichThuoc;
    @ManyToOne
    @JoinColumn(name = "theLoai_id")
    private TheLoai theLoai;
}
