class Student {
	final int id;
	final String name;
	final String mailId;
	final long contactNumber;
	Student(int id, String name,String mailId, long contactNumber){
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.contactNumber = contactNumber;
	}

	static final String city;
	static final String state;
	static final String country;
	static {
		city = "Jalandhar";
		state = "Punjab";
		country = "India";
	}
	public void displayStudentInfo() {
		// final int id = 1;
		// //id = 2; //cte
		// String mailId = "raja@gmail.com";
		// mailId = "king@gmail.com";
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Mail Id : "+ mailId);
		System.out.println("Id : "+ id);	
		System.out.println("contactNumber : "+contactNumber);
		System.out.println("City : "+ city);
		System.out.println("State : "+state);
		System.out.println("Country : "+country);

	}

}
