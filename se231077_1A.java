import java.util.Scanner;

public class se231077_1A {
     static String name[] = {"adam", "clark", "evens", "salim", "jones", "lane", "pace", "smith"};



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("give index number to search:0-8");
        int find = scan.nextInt();

        if (find > name.length) {
            System.out.println("cant found! give valid number");
        } else {
            System.out.println("the name at index " + find + " is:" + name[find]);

        }
    }

}





