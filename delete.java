import java.util.Arrays;



 public class delete{
    int[] names = {2,3,6,7,9,10};
    int deleteIndex = 3;
    int arraySize = names.length;
    void deleteName() {
        int[] updatedNames = new int[arraySize - 1];
        for (int i = 0, j = 0; i < arraySize; i++) {
            if (i != deleteIndex) {
                updatedNames[j++] = names[i];
            }
        }
        int elementmove = arraySize - deleteIndex - 1;

        System.out.println("Updated array after deletion: " + Arrays.toString(updatedNames));

    }

    public static void main(String[] args) {
        delete program = new delete();
        program.deleteName();
    }
}

