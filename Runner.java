import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        // Instantiate a Calc object
        Calc myCalculator = new Calc();
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Get valid user input for two numbers
        double n1 = getValidNumber(scan, " User,please enter the first number: ");
        double n2 = getValidNumber(scan, "User, please enter the second number: ");

        // Pass the numbers to the Calc object
        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);

        // Output from Calc instance
        System.out.println(myCalculator);

        // Examining the instance private data fields by calling get methods
        System.out.println("Calling num1 get method: " + myCalculator.getNum1());
        System.out.println("Calling num2 get method: " + myCalculator.getNum2());

        // Calling Calc methods directly
        double sum = myCalculator.add();
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + myCalculator.subtract());
        System.out.println("The product is: " + myCalculator.multiply());
        System.out.println("The quotient is: " + myCalculator.divide());
    }

    // Method to get valid numeric input from the user
    private static double getValidNumber(Scanner scan, String prompt) {
        double number;
        while (true) {
            System.out.print(prompt);
            if (scan.hasNextDouble()) {
                number = scan.nextDouble();
                scan.nextLine(); //  newline character
                break;
            } else {
                System.out.println("This is incorrect. Please enter a valid number.");
                scan.next(); // Clear the invalid input
            }
        }
        return number;
    }
}
