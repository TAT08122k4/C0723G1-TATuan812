package ss10_stack_queue.bai_tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public boolean checkPalindrome(String str){
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i < stack.size(); i++) {
            queue.add(stack.get(i));
        }
        if (stack.size() != queue.size()){
            return false;
        }
        for (int i = 0; i < stack.size();) {
            if (stack.pop() != queue.remove()){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        System.out.println(palindrome.checkPalindrome(str));
    }
}
