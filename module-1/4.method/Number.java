class Number{
	public static void isDeficientPerfectAbundant(int n) {
		if(n>0){
		int s=0;
		for(int i=1;i<n;i++){
			if(n%1==0){
				s=s+1;
			}
		}
		if(s<n){
			System.out.println(n+" is a Deficient Number.");
		}
		if(s==n){
			System.out.println(n+" is a Perfect Number.");
		}
		if(s>n){
			System.out.println(n+" is a Abundant Number.");
		}
	}
	else{
		System.out.println("Invalid Number.");
		}
	}
}
