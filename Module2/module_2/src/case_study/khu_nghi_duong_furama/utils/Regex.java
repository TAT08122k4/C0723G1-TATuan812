package case_study.khu_nghi_duong_furama.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String ID_REGEX  = "^NV-[0-9]{4}$";
    private static final String NAME_REGEX = "^[A-ZÀÁẠẢÃÂẦẤẬẨẪĂẰẮẶẲẴÈÉẸẺẼÊỀẾỆỂỄÌÍỊỈĨÒÓỌỎÕÔỒỐỘỔỖƠỜỚỢỞỠÙÚỤỦŨƯỪỨỰỬỮỲÝỴỶỸĐ][a-zàáạảãâầấậẩẫăằắặẳẵèéẹẻẽêềếệểễìíịỉĩòóọỏõôồốộổỗơờớợởỡùúụủũưừứựửữỳýỵỷỹđ]*(?:[ ][A-ZÀÁẠẢÃÂẦẤẬẨẪĂẰẮẶẲẴÈÉẸẺẼÊỀẾỆỂỄÌÍỊỈĨÒÓỌỎÕÔỒỐỘỔỖƠỜỚỢỞỠÙÚỤỦŨƯỪỨỰỬỮỲÝỴỶỸĐ][a-zàáạảãâầấậẩẫăằắặẳẵèéẹẻẽêềếệểễìíịỉĩòóọỏõôồốộổỗơờớợởỡùúụủũưừứựửữỳýỵỷỹđ]*)*$";
    private static final String DOB_REGEX = "^(((0+[1-9]|[12][0-9]|30)[/]((0+[4|6|9])|11)[/]\\d{4}))|(((0+[1-9]|[12][0-9]|[3][0|1])[/]((0+[1|3|5|7|8])|1+[0|2])[/]\\d{4}))|(((0+[1-9]|[12][0-9]))[/]02)[/]\\d{4}$";
    private static final String GENDER_REGEX = "(Male|Female|male|female)";
    private static final String INDENTITYCARDNUMBER_REGEX = "([0-9]{9,12})";
    private static final String PHONE_REGEX = "^0\\d{9}$";
    private static final String EMAIL_REGEX = "^[\\w\\-\\.]+@([\\w-]+\\.)+[\\w-]{2,}$";
    private static final String ACADEMICLEVEL_REGEX = "(Intermediate Level)|(College)|(Unniversity)";
    private static final String POSITION_REGEX = "(Receptionist)|(Serve)|(Expert)|(Supervisor)|(Manager )|(Direction)";
    private static final String SALARY_REGEX = "^([1-9]{1}[0-9]{1,})$";
    private static final String CUSTOMER_ID_REGEX = "^KH-[0-9]{4}$";
    public static boolean is18YearsOld(String birthday){
        LocalDate localDate = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate currentDate = localDate.now();
        Period period = Period.between(localDate,currentDate);
        return period.getYears() >= 18;
    }

    public static boolean checkCustomerId(String id){
        Pattern pattern = Pattern.compile(CUSTOMER_ID_REGEX);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
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
