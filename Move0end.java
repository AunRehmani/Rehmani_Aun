public class Move0end {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0,3,0};
        int n = arr.length;
        int nonZeroIndex = 0;

        System.out.println("before:");
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + ",");
        }





        // Move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        // Fill the remaining array with zeros
        for (int i = nonZeroIndex; i < n; i++) {
            arr[i] = 0;
        }

        System.out.println("After");
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + ",");
        }
    }
}