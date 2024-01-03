package com.example.thim4.dto;

import com.example.thim4.model.TheLoai;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TranhDto {
    @Id
    @GeneratedValue
    private int id;
    @NotBlank(message = "Không được để trống")
    private String tenTacPham;
    @NotBlank(message = "Không được để trống")
    @Pattern(regexp = "[A-Za-z](50)" , message = "Nhập Ký Tự và dưới 50 ký tự")
    private String hoaSi;
    @NotBlank(message = "Không được để trống")
    @Pattern(regexp = "[1-2](1)[0-9](3)",message = "Nhập 4 số , số đầu tiên từ 1-2  ")
    private String namVe;
    @NotBlank(message = "Không được để trống")
    private TheLoai theLoai;
    @NotBlank(message = "Không được để trống")
    private String kichThuoc;
}
