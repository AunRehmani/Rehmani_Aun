<<<<<<< HEAD
public class Sort_LL {
    class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }


    class create{
        Node head;

        void add(int data){
            Node newnode= new Node (data);

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
            Node current = head;
            while(current!=null){
                System.out.print(current.data+"-->");
                current=current.next;
            }
            System.out.print("null");
        }

        void bubblesort(){
            if(head==null){
                head=null;
                System.out.println("list doesnt exist");
            }

            boolean swapped;

            do{
                swapped=false;
                Node current=head;

               while(current!=null && current.next!=null) {
                   if (current.data > current.next.data) {
                       int temp = current.data;
                       current.data = current.next.data;
                       current.next.data = temp;
                       swapped = true;

                   }
                   current=current.next;
               }
            }while (swapped);
        }



    }

    public void main(String[] args) {
        create list = new create();
           list.add(10);
           list.add(50);
           list.add(40);
           list.add(20);
           list.add(30);
           list.printit();
           list.bubblesort();
        System.out.println();
           list.printit();

    }

}
=======
public class Sort_LL {
    class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }


    class create{
        Node head;

        void add(int data){
            Node newnode= new Node (data);

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
            Node current = head;
            while(current!=null){
                System.out.print(current.data+"-->");
                current=current.next;
            }
            System.out.print("null");
        }

        void bubblesort(){
            if(head==null){
                head=null;
                System.out.println("list doesnt exist");
            }

            boolean swapped;

            do{
                swapped=false;
                Node current=head;

               while(current!=null && current.next!=null) {
                   if (current.data > current.next.data) {
                       int temp = current.data;
                       current.data = current.next.data;
                       current.next.data = temp;
                       swapped = true;

                   }
                   current=current.next;
               }
            }while (swapped);
        }



    }

    public void main(String[] args) {
        create list = new create();
           list.add(10);
           list.add(50);
           list.add(40);
           list.add(20);
           list.add(30);
           list.printit();
           list.bubblesort();
        System.out.println();
           list.printit();

    }

}
>>>>>>> origin/aunbranch
