class ConditionalOperation{
	public static void main(String[] args) {
		int i=10;
		System.out.println("Content of i is: "+i);

		int j=50;
		System.out.println("Content of j is: "+j);

		boolean c=i<j;
		System.out.println("Content of c is: "+c);

		int r=c?(i+j):(i*j);
		//indirect utilization
		System.out.println("Content of r is "+r);

		//direct utilization
		System.out.println(c ? 'J' : "Java");
	}
}
