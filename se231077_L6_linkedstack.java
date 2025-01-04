public class se231077_L6_linkedstack {
    // Node class for Linked List representation
     static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack class using Linked List
     static class StackUsingLinkedList {
        private Node top;

        // Constructor to initialize the stack
        public StackUsingLinkedList() {
            top = null;
        }

        // Method to push data to the stack
        public void push(int data) {
            Node newNode = new Node(data);
            // If the stack is empty, the new node will be the top
            if (top == null) {
                top = newNode;
            } else {
                // Otherwise, insert the new node at the top
                newNode.next = top;
                top = newNode;
            }
            System.out.println(data + " pushed to stack");
        }

        // Method to pop data from the stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1; // Return -1 if stack is empty
            }
            int poppedData = top.data;
            top = top.next; // Move the top to the next node
            System.out.println(poppedData + " popped from stack");
            return poppedData;
        }

        // Method to peek at the top element of the stack
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1; // Return -1 if stack is empty
            }
            return top.data;
        }

        // Method to check if the stack is empty
        public boolean isEmpty() {
            return top == null;
        }

        // Method to display the stack elements
        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }

            Node current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    // Main class to test the stack

        public static void main(String[] args) {
            StackUsingLinkedList stack = new StackUsingLinkedList();

            // Pushing elements onto the stack
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);

            // Displaying the stack
            stack.display();

            // Peeking the top element
            System.out.println("Top element is: " + stack.peek());

            // Popping elements from the stack
            stack.pop();
            stack.pop();

            // Displaying the stack after popping
            stack.display();

            // Checking the top element again
            System.out.println("Top element is: " + stack.peek());
        }
    }

