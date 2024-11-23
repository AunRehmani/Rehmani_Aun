

public class variables_se231077 {

    void name(){
        String name="AUN";
        System.out.println("name:" +name);


    }


    static int age=18 ;

    void myage(){
        int age_1=19;
        System.out.println("age:" +age);
        System.out.println("age_1:"+age_1);
        ++age;
        ++age_1;
        System.out.println("after");
        System.out.println("age:" +age);
        System.out.println("age_1:"+age_1);
           }






    public static void main(String[] args) {
        variables_se231077 obj = new variables_se231077();
        obj.name();
        obj.myage();
    }



}
