public class test {
    private int[] amount;
    private int newamount;
    private int capacity;

    public test(int capacity) {
        this.capacity = capacity;
        amount = new int[capacity];
        newamount = -1; // Initially, stack is empty
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (newamount == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (newamount == capacity - 1);
    }

    // Add an element to the top of the stack
    public void push(int amountnew) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            amount[++newamount] = amountnew;
        }
    }

    // Remove and return the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1; // Or throw an exception
        } else {
            return amount[newamount--];
        }
    }

    // Get the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Or throw an exception
        } else {
            int latestamount = amount[newamount];
            System.out.println("Top element is"+ latestamount);
        }
return -1;
    }

    // Print the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack: ");
            for (int i = newamount; i >= 0; i--) {
                System.out.print(amount[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        test test = new test(5);
        test.push(12);
        test.push(13);
        test.push(14);
        test.push(15);
        test.display();
        test.pop();
        test.peek();
        test.display();

    }
}

