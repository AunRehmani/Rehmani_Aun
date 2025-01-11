import java.util.Arrays;

public class delete {
    // Class-level variables
   int[] originalArray = {10, 20, 30, 40, 50};
 int positionToDelete = 0; // Position to delete (0-based index)


    // Method to delete a value at the end of the array
    void deleteAtEnd() {
        // Check if the array is empty
        if (originalArray.length == 0) {
            System.out.println("Array is already empty.");
            return;
        }

        // Create a new array with size one less than the original
        int[] newArray = new int[originalArray.length - 1];

        // Copy all elements except the last one
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        // Update the original array reference
        originalArray = newArray;
    }

    // Method to delete a value at a specific position in the array
     void deleteAtPosition() {
        // Check if the position is valid
        if (positionToDelete < 0 || positionToDelete >= originalArray.length) {
            System.out.println("Invalid position. No deletion performed.");
            return;
        }

        // Create a new array with size one less than the original
        int[] newArray = new int[originalArray.length - 1];

        // Copy elements before the specified position
        for (int i = 0; i < positionToDelete; i++) {
            newArray[i] = originalArray[i];
        }

        // Copy the remaining elements after the specified position
        for (int i = positionToDelete; i < originalArray.length - 1; i++) {
            newArray[i] = originalArray[i + 1];
        }

        // Update the original array reference
        originalArray = newArray;
    }

    // Method to traverse the array
     void traverseArray() {
        for (int i = 0; i < originalArray.length; i++) {
            System.out.println("Element at index " + i + ": " + originalArray[i]);
        }
    }
    public static void main(String[] args) {
        delete obj = new delete();
        // Delete value at the end
        obj.deleteAtEnd();

        // Delete value at a specific position
        obj.deleteAtPosition();

        // Traverse the array using a traditional for loop
        System.out.println("Final Array:");
        obj.traverseArray();
    }

}
