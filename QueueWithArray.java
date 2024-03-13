public class QueueWithArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        //add
        public static void add(int data) {
            if(rear == size-1) {
                System.out.println("Queue is full");
                return;
            }

            rear = rear+1;
            arr[rear] = data;
        }

        //remove
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++) {
                arr[i] = arr[i+1];
            }
            rear = rear-1;
            return front;
        }

        //peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }
    }

    static class CircularQueue {
        static int arr[];
        static int size;
        static int rear;
        static int front;
        
        CircularQueue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }
        public static boolean isFull() {
            return (rear+1) % size == front;
        }

        //add
        public static void add(int data) {
            if(isFull()) {
                System.out.println("Queue is full");
                return;
            }

            if(front == -1) {
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }

        //remove
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int result = arr[front];
            //last element delete
            if(rear == front) {
                rear = front = -1;
            } else {
                front = (front+1) % size;
            }
            return result;
        }

        //peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        // Queue q = new Queue(5);
        // q.add(1);
        // q.add(2);
        // q.add(3);

        // while(!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }

        // CircularQueue q1 = new CircularQueue(3);
        // q1.add(1);
        // q1.add(2);
        // q1.add(3);
        // System.out.println(q1.remove());
        // q1.add(4);
        // System.out.println(q1.remove());
        // q1.add(5);

        // while(!q1.isEmpty()) {
        //     System.out.println(q1.peek());
        //     q1.remove();
        // }
    }
}
