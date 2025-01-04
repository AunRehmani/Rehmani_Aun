public class se231077_L6_Stack {
    int[] stackarray;
    int index;
    int arraysize;

   public se231077_L6_Stack(int arraysize){
       this.arraysize=arraysize;
       stackarray=new int[arraysize];
       index=0;
   }

   boolean isFull(){
        if (index==arraysize){
            System.out.println("array is full");
            return true;

        }
       System.out.println("array contain element at index"+index);
        return false;

   }
    boolean isEmpty(){
       if(index==0){
           System.out.println("array is empty");
           return true;
       }
        System.out.println("array is full");
       return false;
    }
        int givesize(){
            return index;
        }


   void push(int element){
       if(isFull()){
           System.out.println("array is full");
       }
       stackarray[index]=element;
       index++;
   }
    int pop(){
       if(isEmpty()){
           System.out.println("array is empty");
           return -1;
       }
       else {
           index--;
           int poppedelement=stackarray[index];
           System.out.println("element "+ poppedelement +" from stack");
           return poppedelement;
       }

   }

    public static void main(String[] args) {
     se231077_L6_Stack stack = new se231077_L6_Stack(6);
        System.out.println("size of array before insertion:" +stack.givesize());
     stack.push(1);
     stack.push(2);
     stack.push(3);
     stack.push(4);
     stack.push(5);
     stack.push(6);
        System.out.println("size of array after insertion:" +stack.givesize());
        stack.pop();
        stack.pop();
        System.out.println("size of array :" +stack.givesize());
   }
}

