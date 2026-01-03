class NumberVerifierSystem{
	public static void main(String[] args) {
		int n = 10;
		if((n<0)&&(n%2==0)){
			System.out.println(n+" is a negative and even no.");
		}
		if((n<0)&&(n%2!=0)){
			System.out.println(n+" is a negative and odd no.");
		}
		if((n==0)&&(n%2==0)&&(n/2==0)){
			System.out.println(n+" is a neutral number");
		}
		if((n>0)&&(n%2==0)){
			System.out.println(n+" is a positive and even no.");
		}
		if((n>0)&&(n%2!=0)){
			System.out.println(n+" is a positive and odd no.");
		}
	}
}
