public class Search {
   int array[]={1,4,67,77,89,99};
   int sizeofarray= array.length;
   int find=77;
   int i;
 void givenum(){

 }


   void searchme(){
     for(i=0;i<sizeofarray;i++){
         if(array[i]==find){
             System.out.println("the number you finding is "+find+" at index:"+i);
         }

     }
 }

    public static void main(String[] args) {
        Search obj = new Search();
        obj.searchme();
    }

}
