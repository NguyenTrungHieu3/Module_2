package ss11_dsa_stack_queue.bai_tap;

public class CircularLinkedListQueue<T> {
    public class Node {
        public T data;
        public Node link;

        public Node(T data) {
            this.data = data;
            link = null;
        }
    }

    private Node front;
    private Node rear;

    public CircularLinkedListQueue() {
        front = null;
        rear = null;
    }

    public void enQueue(T data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = rear = newNode;
        } else {
            rear.link = newNode;
            rear = newNode;
            rear.link = front;
        }
    }

    public T deQueue() {
        if (front == null) {
            return null;
        } else if (front == rear) {
            T element = front.data;
            front = null;
            rear = null;
            return element;
        } else {
            T element = front.data;
            front = front.link;
            rear.link = front;
            return element;
        }
    }

    public void displayQueue() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            Node temp = front.link;
            System.out.print(front.data);
            while (temp != front) {
                System.out.print("->"+temp.data);
                temp = temp.link;
            }
        }
    }

    public static void main(String[] args) {
        CircularLinkedListQueue<Integer> queue = new CircularLinkedListQueue<>();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.displayQueue();
        queue.deQueue();
        queue.displayQueue();
    }
}
