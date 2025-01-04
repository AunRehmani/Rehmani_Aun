import java.util.ArrayList;
public class se231077_L6_arraylist {
    static class stack{
        ArrayList<Integer> list = new ArrayList<>();

        void push(int element){
            list.add(element);
            System.out.println("element added:"+element);
        }
        boolean isEmpty(){
            if(list.size()==0){
                System.out.println("list is empty");
            }
            return false;
        }
        void pop(){
            if(isEmpty()){
                System.out.println("list is empty");
            }
            int top= list.remove(list.size()-1);
            System.out.println("element poped:"+top);
        }

//        void peek(){
//            if(isEmpty()){
//                System.out.println("list empty");
//            }
//            else {
//
//            }
        }

    public static void main(String[] args) {
        stack obj = new stack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.pop();

    }
    }

