package ss10_stack_queue.thuc_hanh.mygenericstack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T>  stack;

    public MyGenericStack(){
        stack = new LinkedList();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if (isEmpty()){
  throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if (stack.size() == 0){
            return true;
        }
        return false;
    }
    public static void stackOfString(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("f");
        stack.push("e");
        stack.push("h");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.println("1.2 Pop Elements from stack: ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("\n 3.3 Size of stack after pop operations: " + stack.size());
    }
    public static void stackOfInteger(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.println("1.2 Pop Elements from stack: ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("\n 3.3 Size of stack after pop operations: " + stack.size());
    }
}
