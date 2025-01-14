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

    public static void Displayrand(Node RAND) {
        Node current = RAND;
        while (current.prev != null) {
            current = current.prev;

        }

        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
    }

    public static void insertathead(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        System.out.println(head);
    }

public static void insertattail(Node head, int data) {
    Node newnode = new Node(data);

    if (head == null) {
        head = newnode;
    } else {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;
        newnode.prev=current;

    }
    System.out.println(newnode);
}
    public static void insertASP( Node head,int data){
        Node current= head;
        Node newone = new Node(data);
        int pos=3;
        for (int i=0;i<pos-1;i++){
            current=current.next;
        }
        newone.next=current.next;
        current.next=newone;


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
//        printit(a);
//        reverseit(a);
//        printit(d);
//        Displayrand(c);
//        printit(c);
           // printit(a);
           // Displayrand(d);
//                insertathead(b,22);
//                Displayrand(b);
//                printit(a);
//                printit(insertathead(a,22));
        insertattail(d,5);
        printit(a);
        insertASP(a,12);
        printit(a);



       }
}

