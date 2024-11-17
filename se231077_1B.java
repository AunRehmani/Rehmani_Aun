public class se231077_1B {

    String name[] = {"adam", "clark", "evens", "salim", "jones", "lane", "pace", "smith"};
    String insert="davis";
    int atindex=0;
    int sizeofarray= name.length;

    void insert(){
        if(sizeofarray>=atindex){
            name[atindex]=insert;

        }
        else {
            System.out.println("array is big cant insert");
        }
        for (int i=0 ; i<sizeofarray; i++){
            System.out.print(name[i]+",");
        }
    }

    public static void main(String[] args) {
        se231077_1B obj = new se231077_1B();
        obj.insert();
    }

}


