class IfElseIfStatementTask{
	public static void main(String[] args) {
		char signal='g';
		if((signal=='R') || (signal=='r')){
			System.out.println("Stop");
		}
		else if((signal=='Y') || (signal=='Y')){
		System.out.println("Ready");
		}
		else if((signal)=='G' || (signal=='g')){
		System.out.println("Go");
		}
		else{
		System.out.println("Do whatever you want");
		}
	}
}
