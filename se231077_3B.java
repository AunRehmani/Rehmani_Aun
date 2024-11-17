import java.util.Scanner;

public class se231077_3B
{
    /// where = AAA[5:50];
    //AAA[15];
    //AAA[35];
    //AAA[55]

    int base=300;
    int lower_bound=5;

    void formula(){
        Scanner scan= new Scanner(System.in);
        System.out.println("enter index value < 50:");
        int i= scan.nextInt();

        int address=(base+(i-lower_bound));
        System.out.println("the address of AAA" +i+" array at specific element is:"+address);
    }

    public static void main(String[] args) {
        se231077_3B obj= new se231077_3B();
        obj.formula();
    }
}
