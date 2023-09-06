package ss3_array.thuc_hanh;

import java.util.Scanner;

public class IsExit {
    public static void main(String[] args) {
        String[] arrNameStudents = {"tuanTA","TuanNM","QuyenMarved","HieuNgu"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name Student:");
        String inputName = sc.nextLine();
        boolean isExit = false;
        for (int i = 0; i < arrNameStudents.length; i++) {
            if (arrNameStudents[i].equals(inputName)){
                System.out.println("Position of the students in the list " + inputName + "is : " + i);
                isExit = true;
                break;
            }
        }
        if (!isExit){
            System.out.println("Not found" + inputName + " in the list. ");
        }
    }
}
