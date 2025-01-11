public class se231077_Queue_circular {
    static class CircularQueue {
        private int[] queue;
        private int front, rear, size;

        // Constructor to initialize the queue with a given size
        public CircularQueue(int size) {
            queue = new int[size];
            front = -1;
            rear = -1;
            this.size = size;
        }

        // Method to check if the queue is full
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Method to check if the queue is empty
        public boolean isEmpty() {
            return front == -1;
        }

        // Method to add an element to the queue
        public void enqueue(int element) {
            if (isFull()) {
                System.out.println("Queue is full! Cannot enqueue.");
            } else {
                if (front == -1) {
                    front = 0; // First element added
                }
                rear = (rear + 1) % size; // Circular increment
                queue[rear] = element;
                System.out.println("Enqueued: " + element);
            }
        }

        // Method to remove an element from the queue
        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty! Cannot dequeue.");
            } else {
                System.out.println("Dequeued: " + queue[front]);
                if (front == rear) {
                    front = rear = -1; // Reset when the queue becomes empty
                } else {
                    front = (front + 1) % size; // Circular increment
                }
            }
        }

        // Method to view the front element
        public int front() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return queue[front];
        }

        // Method to display the elements in the queue
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
            } else {
                System.out.print("Queue elements: ");
                int i = front;
                while (i != rear) {
                    System.out.print(queue[i] + " ");
                    i = (i + 1) % size;
                }
                System.out.println(queue[rear]);
            }
        }
    }


        public static void main(String[] args) {
            CircularQueue queue = new CircularQueue(5);

            // Enqueue elements
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);

            // Display elements
            queue.display();

            // Dequeue an element
            queue.dequeue();

            // Display elements again
            queue.display();

            // Enqueue more elements
            queue.enqueue(50);
            queue.enqueue(60);

            // Display elements
            queue.display();

            // Front element
            System.out.println("Front element: " + queue.front());
        }
    }


