class JavaApplication {
public static void execution() {
		// Student.city = "Jalandhar";
		// Student.state = "Punjab";
		// Student.country = "India";

		Student student1 = new Student(1,"Raja","raja@gmail.com",9876543210l);
		System.out.println("student1 : "+student1);
		// student1.id = 1;
		// student1.name = "Raja";
		// student1.mailId = "raja@gmail.com";
		// student1.contactNumber = 9876543210l;
		 student1.displayStudentDetails();


		Student student2 = new Student(2,"Rani","rani@gmail.com",9876543211L);
		System.out.println("student1 : "+student1);
		// student2.id = 2;
		// student2.name = "Rani";
		// student2.mailId = "rani@gmail.com";
		// student2.contactNumber = 9876543211L;
		student2.displayStudentDetails();



	//Members
	// System.out.println(Members.sv);
	// Members.sm();

	// Members members = new Members();

	// System.out.println(members.nsv);
	// members.nsm();
	}
}