public class SE231077_DSA_L3 {
//     static class Node {
//        int data;
//        Node next;
//
//        // Constructor to create a new node
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//     static class SinglyLinkedList {
//        Node head; // head of the list
//
//        // Method to append a new node at the end of the list
//        public void append(int data) {
//            Node newNode = new Node(data);
//            if (head == null) {
//                head = newNode;
//                return;
//            }
//            Node lastNode = head;
//            while (lastNode.next != null) {
//                lastNode = lastNode.next;
//            }
//            lastNode.next = newNode;
//        }
//
//        // Method to find the length of the linked list
//        public int length() {
//            int count = 0;
//            Node currentNode = head;
//            while (currentNode != null) {
//                count++;
//                currentNode = currentNode.next;
//            }
//            return count;
//        }
//
//        // Method to print the linked list (for testing purposes)
//        public void printList() {
//            Node currentNode = head;
//            while (currentNode != null) {
//                System.out.print(currentNode.data + " -> ");
//                currentNode = currentNode.next;
//            }
//            System.out.println("null");
//        }
//
//        public static void main(String[] args) {
//            SinglyLinkedList linkedList = new SinglyLinkedList();
//            linkedList.append(1);
//            linkedList.append(2);
//            linkedList.append(3);
//
//            linkedList.printList(); // Print the linked list
//            System.out.println("Length of the linked list: " + linkedList.length());
//        }
//    }

//   static class Node {
//        int data;
//        Node next;
//
//        // Constructor to create a new node
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//     static class SinglyLinkedList {
//        Node head; // head of the list
//
//        // Method to append a new node at the end of the list
//        public void append(int data) {
//            Node newNode = new Node(data);
//            if (head == null) {
//                head = newNode;
//                return;
//            }
//            Node lastNode = head;
//            while (lastNode.next != null) {
//                lastNode = lastNode.next;
//            }
//            lastNode.next = newNode;
//        }
//
//        // Method to print the middle node of the linked list
//        public void printMiddle() {
//            if (head == null) {
//                System.out.println("The list is empty.");
//                return;
//            }
//
//            Node slowPointer = head;
//            Node fastPointer = head;
//
//            // Move fastPointer two steps and slowPointer one step
//            while (fastPointer != null && fastPointer.next != null) {
//                slowPointer = slowPointer.next; // Move slow pointer by 1
//                fastPointer = fastPointer.next.next; // Move fast pointer by 2
//            }
//
//            // When fastPointer reaches the end, slowPointer will be at the middle
//            System.out.println("The middle node is: " + slowPointer.data);
//        }
//
//        // Method to print the linked list (for testing purposes)
//        public void printList() {
//            Node currentNode = head;
//            while (currentNode != null) {
//                System.out.print(currentNode.data + " -> ");
//                currentNode = currentNode.next;
//            }
//            System.out.println("null");
//        }
//
//        public static void main(String[] args) {
//            SinglyLinkedList linkedList = new SinglyLinkedList();
//            linkedList.append(1);
//            linkedList.append(2);
//            linkedList.append(3);
//            linkedList.append(4);
//            linkedList.append(5);
//
//            linkedList.printList(); // Print the linked list
//            linkedList.printMiddle(); // Print the middle node
//        }
//    }

//    static class Node {
//        int data;
//        Node next;
//
//        // Constructor to create a new node
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//     static class SinglyLinkedList {
//        Node head; // head of the list
//
//        // Method to append a new node at the end of the list
//        public void append(int data) {
//            Node newNode = new Node(data);
//            if (head == null) {
//                head = newNode;
//                return;
//            }
//            Node lastNode = head;
//            while (lastNode.next != null) {
//                lastNode = lastNode.next;
//            }
//            lastNode.next = newNode;
//        }
//
//        // Method to remove duplicates from the sorted linked list
//        public void removeDuplicates() {
//            if (head == null) {
//                return; // List is empty
//            }
//
//            Node currentNode = head;
//
//            while (currentNode != null && currentNode.next != null) {
//                // If current node's data is the same as the next node's data
//                if (currentNode.data == currentNode.next.data) {
//                    // Skip the next node
//                    currentNode.next = currentNode.next.next;
//                } else {
//                    // Move to the next node
//                    currentNode = currentNode.next;
//                }
//            }
//        }
//
//        // Method to print the linked list (for testing purposes)
//        public void printList() {
//            Node currentNode = head;
//            while (currentNode != null) {
//                System.out.print(currentNode.data + " -> ");
//                currentNode = currentNode.next;
//            }
//            System.out.println("null");
//        }
//
//        public static void main(String[] args) {
//            SinglyLinkedList linkedList = new SinglyLinkedList();
//            linkedList.append(1);
//            linkedList.append(1);
//            linkedList.append(2);
//            linkedList.append(3);
//            linkedList.append(3);
//            linkedList.append(4);
//            linkedList.append(4);
//            linkedList.append(5);
//
//            System.out.println("Original list:");
//            linkedList.printList(); // Print the original linked list
//
//            linkedList.removeDuplicates(); // Remove duplicates
//
//            System.out.println("List after removing duplicates:");
//            linkedList.printList(); // Print the modified linked list
//        }
//    }

//     static class Node {
//        int data;
//        Node next;

        // Constructor to create a new node
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//     static class SinglyLinkedList {
//        Node head; // head of the list
//
//        // Method to append a new node at the end of the list
//        public void append(int data) {
//            Node newNode = new Node(data);
//            if (head == null) {
//                head = newNode;
//                return;
//            }
//            Node lastNode = head;
//            while (lastNode.next != null) {
//                lastNode = lastNode.next;
//            }
//            lastNode.next = newNode;
//        }
//
//        // Method to print the linked list (for testing purposes)
//        public void printList() {
//            Node currentNode = head;
//            while (currentNode != null) {
//                System.out.print(currentNode.data + " -> ");
//                currentNode = currentNode.next;
//            }
//            System.out.println("null");
//        }
//
//        // Method to merge two sorted linked lists
//        public static SinglyLinkedList merge(SinglyLinkedList list1, SinglyLinkedList list2) {
//            SinglyLinkedList mergedList = new SinglyLinkedList();
//            Node current1 = list1.head;
//            Node current2 = list2.head;
//
//            // Dummy node to help with merging
//            Node dummy = new Node(0);
//            Node tail = dummy;
//
//            // Merge the two lists
//            while (current1 != null && current2 != null) {
//                if (current1.data <= current2.data) {
//                    tail.next = current1;
//                    current1 = current1.next;
//                } else {
//                    tail.next = current2;
//                    current2 = current2.next;
//                }
//                tail = tail.next; // Move the tail pointer
//            }
//
//            // If there are remaining nodes in list1
//            if (current1 != null) {
//                tail.next = current1;
//            }
//
//            // If there are remaining nodes in list2
//            if (current2 != null) {
//                tail.next = current2;
//            }
//
//            // Set the head of the merged list
//            mergedList.head = dummy.next; // Skip the dummy node
//            return mergedList;
//        }
//
//        public static void main(String[] args) {
//            SinglyLinkedList list1 = new SinglyLinkedList();
//            list1.append(1);
//            list1.append(3);
//            list1.append(5);
//
//            SinglyLinkedList list2 = new SinglyLinkedList();
//            list2.append(2);
//            list2.append(4);
//            list2.append(6);
//
//            System.out.println("List 1:");
//            list1.printList(); // Print the first linked list
//
//            System.out.println("List 2:");
//            list2.printList(); // Print the second linked list
//
//            SinglyLinkedList mergedList = SinglyLinkedList.merge(list1, list2); // Merge the two lists
//
//            System.out.println("Merged list:");
//            mergedList.printList(); // Print the merged linked list
//        }
//    }
//         static class Node {
//            int data;
//            Node next;
//
//            // Constructor to create a new node
//            Node(int data) {
//                this.data = data;
//                this.next = null;
//            }
//        }
//
//     static class SinglyLinkedList {
//        Node head; // head of the list
//
//        // Method to append a new node at the end of the list
//        public void append(int data) {
//            Node newNode = new Node(data);
//            if (head == null) {
//                head = newNode;
//                return;
//            }
//            Node lastNode = head;
//            while (lastNode.next != null) {
//                lastNode = lastNode.next;
//            }
//            lastNode.next = newNode;
//        }
//
//        // Method to print the linked list (for testing purposes)
//        public void printList() {
//            Node currentNode = head;
//            while (currentNode != null) {
//                System.out.print(currentNode.data + " -> ");
//                currentNode = currentNode.next;
//            }
//            System.out.println("null");
//        }
//
//        // Method to delete the entire linked list
//        public void deleteList() {
//            head = null; // Set head to null to delete the list
//            System.out.println("The linked list has been deleted.");
//        }
//
//
//        public static void main(String[] args) {
//            SinglyLinkedList linkedList = new SinglyLinkedList();
//            linkedList.append(1);
//            linkedList.append(2);
//            linkedList.append(3);
//
//            System.out.println("Original list:");
//            linkedList.printList(); // Print the original linked list
//
//            linkedList.deleteList(); // Delete the linked list
//
//            System.out.println("List after deletion:");
//            linkedList.printList(); // Print the linked list after deletion
//        }
//    }



     static class Node{

        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }

     static class LL_3{
        Node head;
        void add(int data){
            Node newnode =new Node(data);

            if(head==null){
                head=newnode;
            }

            else{
                Node current =head;
                while(current.next!=null){
                    current=current.next;
                }
                current.next=newnode;
            }
        }

        void printit(){
            Node current =head;
            while(current!=null)
            {
                System.out.print(current.data+"->");
                current=current.next;
            }
        }

        public void reverseit() {
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




    }

    public  static void main(String[] args) {
        LL_3 list = new LL_3();
        list.add(10);
        list.add(30);
        list.add(50);
    System.out.println("before reverse");
        list.printit();
        System.out.println();
        list.reverseit();
    System.out.println("after reverse");
    list.printit();


    }
}








