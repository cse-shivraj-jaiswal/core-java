import java.util.Scanner;
class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;

        // calculate sum of digits
        while (temp>0) {
            sum+=temp%10;
            temp/=10;
        }

        // check Harshad condition
        if (num % sum==0) {
            System.out.println(num + " is a Harshad Number");
        } else {
            System.out.println(num + " is not a Harshad Number");
        }
        sc.close();
    }
}
