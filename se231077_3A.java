import java.util.Scanner;

public class se231077_3A
{
    void element_find(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first value:");
        int a = scan.nextInt();
        System.out.println("enter second value:");
        int b= scan.nextInt();
        int formula=b-a+1;
        System.out.println("the total elements of array are:"+formula);
    }

    public static void main(String[] args) {
        se231077_3A obj= new se231077_3A();
        obj.element_find();
    }
}
