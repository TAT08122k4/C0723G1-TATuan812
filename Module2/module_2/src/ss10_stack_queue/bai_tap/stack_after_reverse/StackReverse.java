package ss10_stack_queue.bai_tap.stack_after_reverse;

import java.util.Stack;

public class StackReverse {
    public int[] reverseInt(int[] elements){
         java.util.Stack<Integer> stack = new java.util.Stack<>();
        for (int i = 0; i < elements.length; i++) {
             stack.push(elements[i]);
        }
        for (int i = 0; i < elements.length; i++) {
            elements[i] = stack.pop();
        }
        return elements;
    }
    public String reverseStr(String str){
        Stack stacks = new Stack();
        String[] newStr = str.split("");
        Stack wStack = new Stack();
        for (int i = 0; i < newStr.length; i++) {
             wStack.push(newStr[i]);
        }
        str = "";
        for (int i = 0; i < newStr.length; i++) {
           str += wStack.pop();
        }
        return str;


    }
}
