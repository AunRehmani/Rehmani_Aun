public class DOUBLY_LL {

    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }


       public static void printit(Node head) {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.println();
        }

    public  static void reverseit(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse current node's pointer
            prev = current;      // Move pointers one position ahead
            current = next;
        }
        head = prev; // Update head to the new first node


    }





       public static void main(String[] args) {
           Node a = new Node(1);
           Node b = new Node(2);
           Node c = new Node(3);
           Node d = new Node(4);

           a.next=b;
           b.prev=a;
           b.next=c;
           c.prev=b;
           c.next=d;
           d.prev=c;
        printit(a);
        reverseit(a);
        printit(d);




       }
}

