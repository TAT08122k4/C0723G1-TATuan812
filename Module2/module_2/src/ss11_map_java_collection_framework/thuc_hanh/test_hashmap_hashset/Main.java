package ss11_map_java_collection_framework.thuc_hanh.test_hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Tuan", 18, "Đn");
        Student student2 = new Student("Kiet", 20, "Đn");
        Student student3 = new Student("Toai", 29, "Đn");
        Map<Integer,Student> studentMap = new HashMap<Integer,Student>();
        studentMap.put(3,student1);
        studentMap.put(2,student2);
        studentMap.put(1,student3);
        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println(".......Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student3);
        students.add(student1);
        students.add(student2);
        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}
