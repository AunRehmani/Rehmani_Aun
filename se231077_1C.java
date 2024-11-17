import java.util.Arrays;

public class se231077_1C {

    String name[] = {"adam", "clark", "evens", "salim", "jones", "lane", "pace", "smith"};
    String delete = "salim";
    int atindex = 3;
    int sizeofarray = name.length;

    void delete() {
        String[] newArray = new String[sizeofarray - 1];

        for (int i = 0, j = 0; i < sizeofarray; i++) {
            if (i != atindex) {
                newArray[j++] = name[i];
            }
        }

        System.out.println("Array after deletion: " + Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        se231077_1C obj = new se231077_1C();
        obj.delete();
    }
}