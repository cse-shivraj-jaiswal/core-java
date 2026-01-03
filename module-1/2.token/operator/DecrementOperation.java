class DecrementOperation{
	public static void main(String[] args) {
		int i=34;
		System.out.println("Content of i is: "+i);

		int j=75;
		System.out.println("Content of j is: "+j);

		int dec= i-- + --j + --i + j--;
		System.out.println("Content of dec is: "+dec);

		System.out.println();

		System.out.println("Content of i is: "+i);
		System.out.println("Content of j is: "+j);
	}
}
