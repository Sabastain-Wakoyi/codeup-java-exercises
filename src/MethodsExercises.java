import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1 Basic Arithmetic Methods

       // addition
//    public static int addition(int a, int b) {
//        return (a + b);
//    }
//
//    //subtraction
//    public static int subtraction(int a, int b) {
//        return (a - b);
//    }
//
//    //multiplication
//    public static int multiplication(int a, int b) {
//        return (a * b);
//    }
//
//    //division
//    public static int division(int a, int b) {
//        return (a / b);
//    }
//
//    //modulus
//    public static int modulus(int a, int b) {
//        return (a % b);
//    }

        //bonus
//    public static int multiply(int x, int y) {
//        if (x == 0 || y == 0) {
//            return 0;
//        } else if (y > 0) {
//            System.out.println("x " + x);
//            System.out.println("y " + y);
//
//            int count = x + multiply(x, y - 1);
//
//            System.out.println("count " + count);
//
//            return count;
//        }
//        return multiply(x, y);
//    }


        // 2Create a method that validates that user input is in a certain range
        public static int getInteger(int min, int max){
            Scanner scanner =  new Scanner(System.in);
            int input = Integer.parseInt(scanner.nextLine());
            if (input < min){
                System.out.println("enter a number within the range");
                return getInteger(min,max);
            } else if (input > max){
                System.out.println(" enter a number within the range");
                return getInteger(min, max);
            }
            System.out.println("Thank you");
            return input;
        }

    }

}
