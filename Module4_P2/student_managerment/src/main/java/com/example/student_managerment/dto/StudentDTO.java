package com.example.student_managerment.dto;

import com.example.student_managerment.model.ClassRoom;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    private int id;
    @NotBlank(message = "Không được để rỗng")
    private String name;
    @NotBlank(message = "Không được để rỗng")
    private String gender;
    private int age;
    @NotBlank(message = "Không được để rỗng")
    private String address;
    private ClassRoom classRoom;
}
