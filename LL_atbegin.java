public class LL_atbegin {

    class Node{
        int data;
        Node next;

       public Node(int data){
           this.data=data;
           this.next=null;
       }
    }

    class LL_2{
        Node head;


        void add(int data){
        Node newnode = new Node( data);

        if(head==null){
            head=newnode;
        }

        else{
            Node current = head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=newnode;
        }



    }
    void insert_atbegin(int data){
        Node newone = new Node(data);
        newone.next=head;
        head=newone;

        }

    void printit(){
            Node current =head;
            while(current!=null){
                System.out.print(current.data+"->");
                current=current.next;
            }
    }
    }

    public  void main(String[] args) {
        LL_2 list = new LL_2();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(70);

        System.out.println("printing linked list");
        list.printit();
        System.out.println();
        System.out.println("inserting 100 at the begining of list");
        list.insert_atbegin(100);
        list.printit();
    }

}
