import java.util.Scanner;

//public class SE31077_DSA_L1 {
//    static class SwapExample {
//        private int a;
//        private int b;
//
//        public SwapExample(int a, int b) {
//            this.a = a;
//            this.b = b;
//        }
//
//        public void swap() {
//            a = a ^ b;
//            b = a ^ b;
//            a = a ^ b;
//        }
//
//        public void display() {
//            System.out.println("a = " + a + ", b = " + b);
//        }
//
//    }
//            public static void main(String[] args) {
//                SwapExample obj = new SwapExample(5, 10);
//                System.out.println("Before swap:");
//                obj.display();
//                obj.swap();
//                System.out.println("After swap:");
//                obj.display();
//            }
//        }



//       static boolean areEqualUpToThreeDecimalPlaces(double num1, double num2) {
//
//            long roundedNum1 = Math.round(num1 * 1000);
//            long roundedNum2 = Math.round(num2 * 1000);
//
//
//            return roundedNum1 == roundedNum2;
//        }
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//
//            System.out.print("Enter the first floating-point number: ");
//            double num1 = scanner.nextDouble();
//
//            System.out.print("Enter the second floating-point number: ");
//            double num2 = scanner.nextDouble();
//
//
//            if (areEqualUpToThreeDecimalPlaces(num1, num2)) {
//                System.out.println("The numbers are the same up to three decimal places.");
//            } else {
//                System.out.println("The numbers are NOT the same up to three decimal places.");
//            }
//
//            scanner.close();
//        }
//
//
//
//    }






//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//
//            System.out.print("Enter the first number: ");
//            double num1 = scanner.nextDouble();
//
//            System.out.print("Enter the second number: ");
//            double num2 = scanner.nextDouble();
//
//            System.out.print("Enter the third number: ");
//            double num3 = scanner.nextDouble();
//
//
//            String result = checkOrder(num1, num2, num3);
//            System.out.println(result);
//
//            scanner.close();
//        }
//
//
//        public static String checkOrder(double num1, double num2, double num3) {
//            if (num1 < num2 && num2 < num3) {
//                return "increasing";
//            } else if (num1 > num2 && num2 > num3) {
//                return "decreasing";
//            } else {
//                return "Neither increasing nor decreasing order";
//            }
//        }
//    }



