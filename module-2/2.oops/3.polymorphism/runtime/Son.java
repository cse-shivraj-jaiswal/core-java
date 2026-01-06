/*class Son extends Father{
	@Override
	public void career(){
		System.out.println("Future Doctor");
	}
}
*/

class Son extends Father{
	@Override
	public ScientificCalculator buyCalculator(){
		return new ScientificCalculator();
	}
}
