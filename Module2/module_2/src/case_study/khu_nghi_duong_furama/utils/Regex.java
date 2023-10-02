package case_study.khu_nghi_duong_furama.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String ID_REGEX  = "^NV-[0-9]{4}$";
    private static final String NAME_REGEX = "^[A-ZÀÁẠẢÃÂẦẤẬẨẪĂẰẮẶẲẴÈÉẸẺẼÊỀẾỆỂỄÌÍỊỈĨÒÓỌỎÕÔỒỐỘỔỖƠỜỚỢỞỠÙÚỤỦŨƯỪỨỰỬỮỲÝỴỶỸĐ][a-zàáạảãâầấậẩẫăằắặẳẵèéẹẻẽêềếệểễìíịỉĩòóọỏõôồốộổỗơờớợởỡùúụủũưừứựửữỳýỵỷỹđ]*(?:[ ][A-ZÀÁẠẢÃÂẦẤẬẨẪĂẰẮẶẲẴÈÉẸẺẼÊỀẾỆỂỄÌÍỊỈĨÒÓỌỎÕÔỒỐỘỔỖƠỜỚỢỞỠÙÚỤỦŨƯỪỨỰỬỮỲÝỴỶỸĐ][a-zàáạảãâầấậẩẫăằắặẳẵèéẹẻẽêềếệểễìíịỉĩòóọỏõôồốộổỗơờớợởỡùúụủũưừứựửữỳýỵỷỹđ]*)*$";
    private static final String DOB_REGEX = "";
    private static final String GENDER_REGEX = "(Male|Female|male|female)";
    private static final String INDENTITYCARDNUMBER_REGEX = "([0-9]{9})";
    private static final String PHONE_REGEX = "^0\\d{9}$";
    private static final String EMAIL_REGEX = "^[\\w\\-\\.]+@([\\w-]+\\.)+[\\w-]{2,}$";
    private static final String ACADEMICLEVEL_REGEX = "(Trung cấp)|(Cao đẳng)|(Đại học)|(Sau đại học)";
    private static final String POSITION_REGEX = "(lễ tân)|(phục vụ)|(chuyên viên)|(giám sát)|(quản lý)|(giám đốc)";
    private static final String SALARY_REGEX = "^([1-9]{1}[0-9]{1,})$";

    public static boolean checkRegexId(String id){
        Pattern pattern = Pattern.compile(ID_REGEX);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();

    }
    public static boolean checkRegexName(String name){
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();

    }
    public static boolean checkRegexDOB(String dob){
        Pattern pattern = Pattern.compile(DOB_REGEX);
        Matcher matcher = pattern.matcher(dob);
        return matcher.matches();

    }
    public static boolean checkRegexGender(String gender){
        Pattern pattern = Pattern.compile(GENDER_REGEX);
        Matcher matcher = pattern.matcher(gender);
        return matcher.matches();

    }
    public static boolean checkRegexIndentitycardnumber(String indextitycardnumber){
        Pattern pattern = Pattern.compile(INDENTITYCARDNUMBER_REGEX);
        Matcher matcher = pattern.matcher(indextitycardnumber);
        return matcher.matches();
    }
    public static boolean checkPhoneNumbers(String phoneNumbers){
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(phoneNumbers);
        return matcher.matches();
    }
    public static boolean checkEmail(String email){
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static boolean checkAcademicLevel(String acdemiclevel){
        Pattern pattern = Pattern.compile(ACADEMICLEVEL_REGEX);
        Matcher matcher = pattern.matcher(acdemiclevel);
        return matcher.matches();
    }
    public static boolean checkPosition(String position){
        Pattern pattern = Pattern.compile(POSITION_REGEX);
        Matcher matcher = pattern.matcher(position);
        return matcher.matches();
    }
    public static boolean checkSalary(String salary){
        Pattern pattern = Pattern.compile(SALARY_REGEX);
        Matcher matcher = pattern.matcher(salary);
        return matcher.matches();
    }

}
