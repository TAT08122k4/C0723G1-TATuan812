package ss10_stack_queue.thuc_hanh.linked_list_queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        MyLinkedListQueue myLinkedListQueue = new MyLinkedListQueue();
        myLinkedListQueue.enqueue(14);
        myLinkedListQueue.enqueue(22);
        myLinkedListQueue.enqueue(-6);
        System.out.println();
        System.out.println(myLinkedListQueue.toString());

    }
}
