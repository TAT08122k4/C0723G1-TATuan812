package ss10_stack_queue.bai_tap.stack_after_reverse;

public class Main  {
    public static void main(String[] args) {
        StackReverse stack = new StackReverse();
        int [] arrInt = {1,2,3,4,5};
        stack.reverseInt(arrInt);
        for (int arr: arrInt) {
            System.out.println(arr);
        }
        StackReverse stackStr = new StackReverse();
        String str = "abcdef";
        System.out.println(stack.reverseStr(str));
    }
}
