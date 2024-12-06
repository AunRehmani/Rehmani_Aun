<<<<<<< HEAD
public class LL {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    class linkedlist {
        Node head;    //head of the list

        void add(int data) {

            Node newnode = new Node(data);

            if (head == null) {
                head = newnode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newnode; // tail of the list contains null fresh node
            }
        }

        void print() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + "->");
                current = current.next;
            }
        }

    }


        public void main(String[] args) {
            linkedlist list = new linkedlist();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(100);
            System.out.println("the linkedlist:");
            list.print();

        }

    }
=======
public class LL {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
 void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
     void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next!= null){
            currentNode = currentNode.next;
        }
        currentNode.next=newNode;
    }
    void deletebeginnig(){
        if(head== null){
            return;
        }
        else {
            head=head.next;
        }

    }
    void deletelast() {
        Node currentNode = head;
        if (head == null) {
            return;
        } else {
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;

        }

    }
        void Specificpos(int data){
        Node newNode = new Node(data);
            if(head==null){
                return;
            }
            else {
                head=head.next;
            }
            Node current = head;
            Node previous=null;
            while (current !=null && current.data!=data){
                previous=current;
                current=current.next;
            }
            previous.next=current.next;
        }
        public boolean search(int x){
        Node current= head;
        while (current!=null){
            if (current.data==x){
                System.out.println("Iteam searched : "+current.data);
                return true;
            }
            current=current.next;
        }
        System.out.println("Item not found");
        return false;
        }

     void printlist(){
        if (head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode!= null){
            System.out.print(currentNode.data+"->");
            currentNode=currentNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        LL list = new LL();
        list.addlast(10);
        list.addlast(20);
        list.addlast(30);
        list.printlist();
        list.addFirst(40);
        list.addFirst(50);
        list.addFirst(60);
        list.printlist();
        list.deletebeginnig();
        list.printlist();
        list.deletelast();
        list.printlist();
        list.Specificpos(20);
        list.printlist();
        list.search(80);
    }
}
>>>>>>> origin/aunbranch
