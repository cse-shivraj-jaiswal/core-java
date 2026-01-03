class NumberDisplayerSystem{
	public static void series(int s, int e){
		if(s<e){
			System.out.println("Forward Series");
			for(int i=s;i<=e;i++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		else if(s>e){
			System.out.println("Backward Series");
			for(int i=s;i>=e;i--){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		else{
			System.out.println("Invalid Series");
		}
	}
}
