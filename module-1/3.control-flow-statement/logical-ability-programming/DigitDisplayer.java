class DigitDisplayer{
	public static void main(String[] args) {
		int n=12345;
		int r=0;
		for(int t=n;t!=0;t=t/10){
			r=t%10;
			System.out.println(r);
		}
	}
}
