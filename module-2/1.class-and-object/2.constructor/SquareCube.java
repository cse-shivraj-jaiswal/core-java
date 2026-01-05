import java.util.Scanner;
class SquareCube {
	public static void main(String[] args){
	//public  void operation(int sq, int cube, int sqroot, int cubeRoot) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int square = n*n;
		System.out.println("Square of number : "+square);
		int cube = n*n*n;
		System.out.println("Cube of number : "+ cube);
		double squareRoot = Math.sqrt(n);
		System.out.println("Square root of number : " + squareRoot);
        double cubeRoot = Math.cbrt(n);
        System.out.println("Cube root of number : "+cubeRoot);





	}
} 