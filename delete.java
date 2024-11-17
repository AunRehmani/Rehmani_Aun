public class delete {
    int array[] = {2,3,6,7,9,10};
    int i;
    int delete=3;

void deleteit(){
    for (i=0;i<array.length;i++){
        if(delete==array[i]){
            for (int j=i;j<array.length-1;j++){
                array[j]=array[j+1];
            }
            break;

        }
        for( i=0; i<array.length-1;i++){
            System.out.print(array[i]+",");
        }

    }


}

    public static void main(String[] args) {
        delete obj= new delete();
        obj.deleteit();
    }

}
