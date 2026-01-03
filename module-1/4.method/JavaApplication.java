import java.util.Scanner;
class JavaApplication{
	public static void execution(){
		//ArithmeticOperation.addition(1,2);
		//ArithmeticOperation.addition(3,4);
		//ArithmeticOperation.addition(5,6);

		//NumberDisplayerSystem.series(1,10);
		//NumberDisplayerSystem.series(-10,-20);
		//NumberDisplayerSystem.series(10,10);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Starting point of integer type");
		int s = scanner.nextInt();
		System.out.println("Enter the ending point of integer type");
		int e = scanner.nextInt();
		NumberDisplayerSystem.series(s,e);
	}
}
