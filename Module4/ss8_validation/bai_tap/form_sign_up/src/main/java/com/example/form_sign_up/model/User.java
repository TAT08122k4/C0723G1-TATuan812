package com.example.form_sign_up.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //    @NotBlank(message = "Không Null và Không Rỗng")
//    @Size(min = 5,max = 45,message = "Tối thiểu 5 kí tự và tối đa là 45")
    private String firstName;
    //    @NotBlank(message = "Không Null và Không Rỗng")
//    @Size(min = 5,max = 45,message = "Tối thiểu 5 kí tự và tối đa là 45")
    private String lastName;


    private String phoneNumber;


    int age;

    String email;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
//        User user = (User) target;
//        if (18 > ((User) target).getAge()){
//            errors.rejectValue("age",null,"Tuổi phải lớn hơn hoặc bằng 18");
//        }
//        if ("".equals(user.firstName)){
//            errors.rejectValue("firstName",null,"Vui lòng nhập firstName ");
//        }else if (user.firstName.length() < 5 || user.firstName.length() >46){
//            errors.rejectValue("firstName",null,"độ dài của chuỗi phải lớn hơn 5 và bé hơn 45");
//        }
//        if ("".equals(user.lastName)){
//            errors.rejectValue("lastName",null,"Vui lòng nhập lastName");
//        }else if (user.lastName.length() < 5 || user.lastName.length() >46){
//            errors.rejectValue("lastName",null,"độ dài của chuỗi phải lớn hơn 5 và bé hơn 45");
//        }
//        if ("".equals(user.phoneNumber)){
//            errors.rejectValue("phoneNumber",null,"Vui lòng nhập phoneNumber");
//        }else if (!user.phoneNumber.matches("(84|0[3|5|7|8|9])+([0-9]{8})")){
//            errors.rejectValue("phoneNumber",null,"Không đúng định dạng số điện thoại");
//        }
//
//        if ("".equals(user.email)){
//            errors.rejectValue("email",null,"Vui lòng nhập email");
//        }else if (!user.email.matches("^[a-zA-Z0-9_!#$%&’*+=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")){
//            errors.rejectValue("email",null,"Không đúng định dạng email");
//        }
//
//    }
    }
}
