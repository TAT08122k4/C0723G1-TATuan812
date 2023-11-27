package com.example.form_sign_up.dto;

import com.example.form_sign_up.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements Validator {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;
    private String email;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDTO userDTO = (UserDTO) target;
        if (18 > ((UserDTO) target).getAge()){
            errors.rejectValue("age",null,"Tuổi phải lớn hơn hoặc bằng 18");
        }
        if ("".equals(userDTO.firstName)){
            errors.rejectValue("firstName",null,"Vui lòng nhập firstName ");
        }else if (userDTO.firstName.length() < 5 || userDTO.firstName.length() >46){
            errors.rejectValue("firstName",null,"độ dài của chuỗi phải lớn hơn 5 và bé hơn 45");
        }
        if ("".equals(userDTO.lastName)){
            errors.rejectValue("lastName",null,"Vui lòng nhập lastName");
        }else if (userDTO.lastName.length() < 5 || userDTO.lastName.length() >46){
            errors.rejectValue("lastName",null,"độ dài của chuỗi phải lớn hơn 5 và bé hơn 45");
        }
        if ("".equals(userDTO.phoneNumber)){
            errors.rejectValue("phoneNumber",null,"Vui lòng nhập phoneNumber");
        }else if (!userDTO.phoneNumber.matches("(84|0[3|5|7|8|9])+([0-9]{8})")){
            errors.rejectValue("phoneNumber",null,"Không đúng định dạng số điện thoại");
        }

        if ("".equals(userDTO.email)){
            errors.rejectValue("email",null,"Vui lòng nhập email");
        }else if (!userDTO.email.matches("^[a-zA-Z0-9_!#$%&’*+=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")){
            errors.rejectValue("email",null,"Không đúng định dạng email");
        }
    }
}
