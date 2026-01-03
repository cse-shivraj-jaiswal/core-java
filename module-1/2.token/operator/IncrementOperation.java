class IncrementOperation{
	public static void main(String[] args) {
		int i=10;
		System.out.println("Content of i is: "+i);

		int j=20;
		System.out.println("Content of j is: "+j);

		int inc= ++i - j++ + i++ - ++j;
		System.out.println("Content of inc is: "+inc);

		System.out.println();

		System.out.println("Content of i is: "+i);
		System.out.println("Content of j is: "+j);
	}
}
