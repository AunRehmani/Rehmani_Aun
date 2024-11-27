class Insert {
    int[] name = {2, 3, 6, 7, 9, 10}; // Original array
    int insert = 4; // Value to insert
    int atIndex = 3; // Index at which to insert
    int size = name.length; // Original size of the array

    void insertValue() {
        // Check if the index is valid
        if (atIndex < 0 || atIndex > size) {
            System.out.println("Invalid index for insertion.");
            return;
        }

        // Create a new array with a size one greater than the original
        int[] newArray = new int[size + 1];

        // Copy elements up to the insertion index
        for (int i = 0; i < atIndex; i++) {
            newArray[i] = name[i];
        }

        // Insert the new value
        newArray[atIndex] = insert;

        // Copy the remaining elements
        for (int i = atIndex; i < size; i++) {
            newArray[i + 1] = name[i];
        }

        // Update the reference to the original array
        name = newArray;

        // Print the updated array
        System.out.println("Array After Insertion:");
        for (int value : name) {
            System.out.print(value + ", ");
        }
    }

    public static void main(String[] args) {
        Insert obj = new Insert();
        obj.insertValue();
    }
}
