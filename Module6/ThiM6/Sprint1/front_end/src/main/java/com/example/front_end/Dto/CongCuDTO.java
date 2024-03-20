package com.example.front_end.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CongCuDTO {
    @NotBlank(message = "Không Được Để Rỗng")
    String tenCongCu;
    @NotBlank(message = "Không Được Để Rỗng")
    String donVi;
    @NotNull(message = "Không Được Để Rỗng")
    int soLuong;
    @NotNull(message = "Không Được Để Rỗng")
    int hangSanXuatId;

    public CongCuDTO() {
    }

    public CongCuDTO(String tenCongCu, String donVi, int soLuong, int hangSanXuatId) {
        this.tenCongCu = tenCongCu;
        this.donVi = donVi;
        this.soLuong = soLuong;
        this.hangSanXuatId = hangSanXuatId;
    }

    public String getTenCongCu() {
        return tenCongCu;
    }

    public void setTenCongCu(String tenCongCu) {
        this.tenCongCu = tenCongCu;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getHangSanXuatId() {
        return hangSanXuatId;
    }

    public void setHangSanXuatId(int hangSanXuatId) {
        this.hangSanXuatId = hangSanXuatId;
    }
}
