public class Insert {

int array[] = {2,3,6,7,9,10};
int numinsert=8;
int atindex=3;
int sizeofarray= array.length;






 void insert(){
   if(sizeofarray>=atindex){
    array[atindex]=numinsert;

   }
   else {
       System.out.println("array is big cant insert");
   }
for (int i=0 ; i<sizeofarray; i++){
    System.out.print(array[i]+",");
}
 }

 public static void main(String[] args) {
  Insert obj = new Insert();
  obj.insert();
 }




}
