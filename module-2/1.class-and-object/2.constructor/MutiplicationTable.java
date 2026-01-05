import java.util.Scanner;8

class MutiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();


        if (n % 2 == 0) {
            
            System.out.println("Even Number - Forward Multiplication Table");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        } else {
            
            System.out.println("Odd Number - Backward Multiplication Table");
            for (int i = 10; i >= 1; i--) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }

    }
}
