import java.util.Scanner;
class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("BASIC CALCULATOR");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division (Quotient & Remainder)");
            System.out.println("5. Exit");
            System.out.print("Select your operation: ");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter second number: ");
                int num2 = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Result = " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Result = " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Result = " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            int quotient = num1 / num2;
                            int remainder = num1 % num2;
                            System.out.println("Quotient = " + quotient);
                            System.out.println("Remainder = " + remainder);
                        } else {
                            System.out.println("Error: Division by zero not allowed");
                        }
                        break;
                }
            }
            else if (choice != 5) {
                System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
        System.out.println("Thank you!");
        sc.close();
    }
}
