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
