public class Insert {
    // Class-level variables
    int[] originalArray = {10, 20, 30, 40, 50};
    int newValueAtEnd = 60; // Value to be inserted at the end
    int newValueAtPosition = 25; // Value to be inserted at a specific position
    int position = 2; // Position to insert the new value (0-based index)


    // Method to insert a value at the end of the array
    void insertAtEnd() {
        // Create a new array with size one greater than the original
        int[] newArray = new int[originalArray.length + 1];

        // Copy the original array elements to the new array
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        // Insert the new value at the end
        newArray[newArray.length - 1] = newValueAtEnd;

        // Update the original array reference
        originalArray = newArray;
    }

    // Method to insert a value at a specific position in the array
    void insertAtPosition() {
        // Create a new array with size one greater than the original
        int[] newArray = new int[originalArray.length + 1];

        // Copy elements before the specified position
        for (int i = 0; i < position; i++) {
            newArray[i] = originalArray[i];
        }

        // Insert the new value at the specified position
        newArray[position] = newValueAtPosition;

        // Copy the remaining elements
        for (int i = position; i < originalArray.length; i++) {
            newArray[i + 1] = originalArray[i];
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
        // Insert value at the end
        Insert obj= new Insert();
        obj.insertAtEnd();

        // Insert value at a specific position
        obj.insertAtPosition();

        // Traverse the array using a traditional for loop
        System.out.println("Final Array:");
        obj.traverseArray();
    }
}
