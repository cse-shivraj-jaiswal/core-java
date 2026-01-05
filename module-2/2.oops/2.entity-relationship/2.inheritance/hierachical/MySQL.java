class MySQL extends Database {
	public void displayMySQLDBInfo() {
		System.out.println("MySQL DB Info");
		System.out.println("---------------");
		System.out.println("URL : "+url);
		System.out.println("Username : "+username);
		System.out.println("Passsword : Passsword");
		System.out.println();
	}
	public void crudOperation() {
		System.out.println("System Generated Queries!");
	}
}