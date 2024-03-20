package com.example.front_end.service;

import com.example.front_end.model.HangSanXuat;

import java.util.List;

public interface IHangSanXuatService {
    List<HangSanXuat> getList();
    HangSanXuat findById(int id);
}
