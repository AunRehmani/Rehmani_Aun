import java.util.Arrays;

public class se231077_1B {

    String name[] = {"adam", "clark", "evens", "salim", "jones", "lane", "pace", "smith"};
    String insert = "davis";
    int atindex = 2;
    int size = 9;
    String[] nam;

    void insert() {
        if (size > atindex) {
            nam = new String[size];


            for (int i = 0; i < atindex; i++) {
                nam[i] = name[i];
            }


            nam[atindex] = insert;


            for (int i = atindex + 1; i < size; i++) {
                nam[i] = name[i - 1];
            }


            for (int i = 0; i < size; i++) {
                System.out.print(nam[i] + ",");
            }
        } else {
            System.out.println("Array is too small to insert.");
        }
    }

    public static void main(String[] args) {
        se231077_1B obj = new se231077_1B();
        obj.insert();
    }
}