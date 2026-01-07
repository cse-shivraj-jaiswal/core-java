class Son extends Father{
	@Override
	public  ScientificCalculator buyCalculator() {
		return new ScientificCalculator();
	}
}