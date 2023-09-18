package ss9_dsa_danh_sach.bai_tap.implement_method_arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>(14);
        myList.add(10);
        myList.add(1);
        myList.add(0);
        myList.add(2);
        myList.add(7);
        myList.add(100);
        myList.add(101);
        myList.add(102);
        myList.add(3,103);
        for (int i = 0; i <= myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println(myList.contains(3));

        Object[] e = (Object[]) myList.clone();
        System.out.println(Arrays.toString(e));
        System.out.println(myList.remove(5));
        Object[] e1 = (Object[]) myList.clone();
        System.out.println(Arrays.toString(e1));
        myList.clear();
        for (int i = 0; i <= myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println(myList.size());
        System.out.println(myList.indexOf(100));
        System.out.println(myList.isEmpty());




    }
}
