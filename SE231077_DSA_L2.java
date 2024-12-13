public class SE231077_DSA_L2 {

//        public static int findDuplicate(int[] nums) {
//            // Step 1: Initialize the tortoise and hare
//            int tortoise = nums[0];
//            int hare = nums[0];
//
//            // Step 2: Move tortoise by 1 step and hare by 2 steps
//            do {
//                tortoise = nums[tortoise];          // Move tortoise by 1 step
//                hare = nums[nums[hare]];            // Move hare by 2 steps
//            } while (tortoise != hare);              // They meet at some point
//
//            // Step 3: Find the entrance to the cycle
//            tortoise = nums[0];                      // Start from the beginning
//            while (tortoise != hare) {
//                tortoise = nums[tortoise];          // Move tortoise by 1 step
//                hare = nums[hare];                  // Move hare by 1 step
//            }
//
//            return hare;                             // The duplicate number
//        }
//
//        public static void main(String[] args) {
//            int[] A = {3, 1, 3, 4, 2};
//            System.out.println("The repeated integer is: " + findDuplicate(A));
//        }


//        public static void main(String[] args) {
//            // Define the array with repeated integers
//            int[] B = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5};
//
//            // Create an array to count occurrences of numbers
//            int n = B.length;
//            int[] count = new int[n - 5]; // Adjust size based on expected range of numbers
//            int[] duplicates = new int[n - 5]; // Array to store duplicates
//            int duplicateCount = 0; // Counter for duplicates
//
//            // Count occurrences of each number
//            for (int i = 0; i < B.length; i++) {
//                int num = B[i]; // Get the current number
//                if (num >= 1 && num <= n - 5) { // Ensure the number is within the valid range
//                    count[num - 1]++; // Increment the count for this number
//                }
//            }
//
//            // Find the numbers that are repeated
//            for (int i = 0; i < count.length; i++) {
//                if (count[i] > 1) { // If the count is greater than 1, it's a duplicate
//                    duplicates[duplicateCount] = i + 1; // Store the number (i + 1 because of zero-based index)
//                    duplicateCount++; // Increment the duplicate count
//                }
//            }
//
//            // Output the result
//            System.out.print("The repeated integers are: ");
//            for (int i = 0; i < duplicateCount; i++) {
//                System.out.print(duplicates[i] + " "); // Print each duplicate
//            }
//        }


//        public static void main(String[] args) {
//            // Define a 2D matrix
//            int[][] matrix = {
//                    {1, 2, 3},
//                    {4, 5, 6}
//            };
//
//            // Get the dimensions of the original matrix
//            int rows = matrix.length;
//            int cols = matrix[0].length;
//
//            // Create a new matrix for the transpose
//            int[][] transposed = new int[cols][rows];
//
//            // Fill the transposed matrix
//            for (int i = 0; i < rows; i++) {
//                for (int j = 0; j < cols; j++) {
//                    transposed[j][i] = matrix[i][j]; // Swap rows and columns
//                }
//            }
//
//            // Print the transposed matrix
//            System.out.println("Transposed Matrix:");
//            for (int i = 0; i < cols; i++) {
//                for (int j = 0; j < rows; j++) {
//                    System.out.print(transposed[i][j] + " ");
//                }
//                System.out.println(); // New line after each row
//            }
//        }



        public static void main(String[] args) {
            // Define a square matrix
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            // Calculate and print the sums of the diagonals
            int leftDiagonalSum = calculateLeftDiagonalSum(matrix);
            int rightDiagonalSum = calculateRightDiagonalSum(matrix);

            System.out.println("Left Diagonal Sum: " + leftDiagonalSum);
            System.out.println("Right Diagonal Sum: " + rightDiagonalSum);
        }

        // Method to calculate the left diagonal sum
        public static int calculateLeftDiagonalSum(int[][] matrix) {
            int sum = 0;
            int n = matrix.length; // Size of the square matrix

            for (int i = 0; i < n; i++) {
                sum += matrix[i][i]; // Add the elements of the left diagonal
            }

            return sum;
        }

        // Method to calculate the right diagonal sum
        public static int calculateRightDiagonalSum(int[][] matrix) {
            int sum = 0;
            int n = matrix.length; // Size of the square matrix

            for (int i = 0; i < n; i++) {
                sum += matrix[i][n - 1 - i]; // Add the elements of the right diagonal
            }

            return sum;
        }
    }


















