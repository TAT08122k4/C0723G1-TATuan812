package ss10_stack_queue.bai_tap.queue_linked_list;

public class Solution {
    public void enQueue(){
        Queue queue = new Queue();
        Node node = new Node();
        if (queue.front == null){
            queue.front = queue.rear = node;
        }
    }
}
