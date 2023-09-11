package ss5_modifier_static.thuc_hanh.static_method;

public class Main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111,"Tuan");
        Student s2 = new Student(112,"Hieu");
        Student s3 = new Student(113,"Huu");
        s1.change();
        s1.display();
        s2.display();
        s3.display();
    }
}
