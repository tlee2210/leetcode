public class testQueue {
    public static void main(String[] args) {
        MyArrayQueue queue = new MyArrayQueue(3);
//        queue.push(1);
//        queue.push(2);
//        queue.push(3);
//        queue.push(4);
//        queue.show();
//        queue.pop();
//        queue.show();
        MyLinkedListQueue myLinkedListQueue = new MyLinkedListQueue();
        myLinkedListQueue.push(1);
        myLinkedListQueue.push(2);
        myLinkedListQueue.push(3);
        myLinkedListQueue.push(4);
        myLinkedListQueue.show();
        myLinkedListQueue.pop();
        myLinkedListQueue.show();
    }
}
