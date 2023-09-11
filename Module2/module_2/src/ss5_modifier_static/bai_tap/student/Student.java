package ss5_modifier_static.bai_tap.student;

public class Student {
    private String name = "Tuan";
    private String nameClass = "C07";

    public Student() {
    }

    protected String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

     String getNameClass() {
        return nameClass;
    }

     void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }
}
