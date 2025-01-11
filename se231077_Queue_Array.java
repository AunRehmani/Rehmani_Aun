import java.util.Scanner;
public class se231077_Queue_Array {
    static  class Queue{
        int[] array;
        int size;
        int front;
        int rear;

        Queue(int size){
            this.size=size;
            array=new int[size];
            front=0;
            rear=-1;
        }
        boolean isEmpty(){
            if(rear<front){
                //System.out.println("Queue is empty");
            return false;
            }
            return true;
        }
        boolean isFull(){
            if(rear==size-1){
                System.out.println("Queue is full");
            }
            return true;
        }

       void add(int data){
            if(isFull()){
                System.out.println("element is present:"+data);

            }
            array[++rear]=data;
        }

        int remove(){
            if(isEmpty()){
                System.out.println("queue is empty:"+isEmpty());
            }
           return array[front++];
        }

        int peek(){
            if(isEmpty()){
                System.out.println("is empty"+isEmpty());

            }
            return array[front];
        }
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("give size of queue:");
        int size=scan.nextInt();


        Queue obj =new Queue(size);




        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.remove();
        obj.remove();
        obj.remove();
        obj.remove();
        obj.remove();
        obj.remove();
//        System.out.println(obj.peek());
//        obj.remove();
//        System.out.println(obj.peek());
//        obj.remove();
//        System.out.println(obj.peek());
//        obj.remove();
//        System.out.println(obj.peek());






    }
}
