package ss5_modifier_static.bai_tap.student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getNameClass());
        student.setName("Hieu");
        student.setNameClass("C08");
        System.out.println(student.getName());
        System.out.println(student.getNameClass());
    }
}
