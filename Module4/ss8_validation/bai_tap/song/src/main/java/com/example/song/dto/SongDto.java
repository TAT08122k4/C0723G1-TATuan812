package com.example.song.dto;


import jakarta.persistence.Entity;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SongDto {

    // có thêm mấy cái Max , min NotNull với NotBlank đồ rk tuỳ vô đề anh xài cái nào
    @Size(max = 800,message = "Tối đa 800 ký tự")
    @Pattern(regexp = "^[a-zA-Z0-9]{1,}$",message = "Không được nhập kí tự đặc biệt")
    private String nameSong;
    @Size(max = 300,message = "Tối đa 300 ký tự")
    @Pattern(regexp = "^[a-zA-Z0-9]{1,}$",message = "Không được nhập kí tự đặc biệt")
    private String singer;
    @Size(max = 1000,message = "Tối đa 1000 ký tự")
    @Pattern(regexp = "^[a-zA-Z0-9\\\\,]{1,}$",message = "Không được nhập kí tự đặc biệt")
    private String typeOfMusic;
}
