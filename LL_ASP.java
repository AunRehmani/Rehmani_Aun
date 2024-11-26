public class LL_ASP
{
    class Node{

        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    class LL_3{
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

        void insertatebegin(int data){
            Node newone = new Node(data);
            newone.next=head;
            head=newone;
        }

        void insertASP(int data){
           Node current= head;
            Node newone = new Node(data);
            int pos=3;
             for (int i=0;i<pos-1;i++){
                 current=current.next;
             }
             newone.next=current.next;
             current.next=newone;


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

    public void main(String[] args) {
        LL_3 list = new LL_3();
        list.add(10);
        list.add(30);
        list.add(50);
        list.printit();
        list.insertatebegin(100);
        System.out.println("the element 100 is inserted at begin");
        list.printit();
        list.insertASP(40);
        System.out.println("the element 40// is inserted at 3 position");
        list.printit();
        System.out.println("reverse of list:");
        list.reverseit();
        list.printit();

    }
}
