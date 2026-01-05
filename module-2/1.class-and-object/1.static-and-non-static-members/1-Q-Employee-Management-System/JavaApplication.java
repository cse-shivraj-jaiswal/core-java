class JavaApplication {
	public static void execution() {
		Employee.company = "Capgeimin";
		Employee.city = "Jalandhar";
		Employee.state = "Punjab";
		Employee.country = "India";

		Employee employee1 = new Employee();
		System.out.println("Employee1 : "+employee1);
		employee1.id = 1;
		employee1.name = "Supriya";
		employee1.mailId = "supriya@gmail.com";
		employee1.contactNumber = 9693455231l;
		employee1.adharNumber = 123456789876l;
		employee1.panNumber = "MJPK7846";
		employee1.dateOfBirth = "7-8-2004";
		employee1.age = 21;
		employee1.gender = "Female";
		employee1.maritalStatus = "unmaried";
		employee1.branch = "software";
		employee1.department = "IT";
		employee1.reportingManager = "Shiv Raj";
		employee1.desegination = "Assistance software developer";
		employee1.salary = 530000.0d;
		employee1.role = "SoftWare developer";
		employee1.insentive = 6000d;
		employee1.uanNumber = 783947393l;
		employee1.yearOfExperiance = 1;
		employee1.displayEmployeeDetails();


		Employee employee2 = new Employee();
		System.out.println("Employee2 : "+employee2);
		employee2.id = 2;
		employee2.name = "Abdul";
		employee2.mailId = "abdul@gmail.com";
		employee2.contactNumber = 7793455231l;
		employee2.adharNumber = 1234676789876l;
		employee2.panNumber = "AJPK7846";
		employee2.dateOfBirth = "25-2-2004";
		employee2.age = 21;
		employee2.gender = "Male";
		employee2.maritalStatus = "unmaried";
		employee2.branch = "software";
		employee2.department = "IT";
		employee2.reportingManager = "Shiv Kumar";
		employee2.desegination = "Assositate software developer";
		employee2.salary = 550000.0d;
		employee2.role = "SoftWare developer 1";
		employee2.insentive = 6000d;
		employee2.uanNumber = 782347393l;
		employee2.yearOfExperiance = 1;
		employee2.displayEmployeeDetails();



		Employee employee3 = new Employee();
		System.out.println("Employee3 : "+employee3);
		employee3.id = 3;
		employee3.name = "Alok";
		employee3.mailId = "alok@gmail.com";
		employee3.contactNumber = 9693679231l;
		employee3.adharNumber = 123456098876l;
		employee3.panNumber = "ARPK7846";
		employee3.dateOfBirth = "16-8-2004";
		employee3.age = 21;
		employee3.gender = "Male";
		employee3.maritalStatus = "unmaried";
		employee3.branch = "software";
		employee3.department = "IT";
		employee3.reportingManager = "Shiv Raj";
		employee3.desegination = "Assistance software developer";
		employee3.salary = 630000.0d;
		employee3.role = "SoftWare developer and Tester ";
		employee3.insentive = 6000d;
		employee3.uanNumber = 7889647393l;
		employee3.yearOfExperiance = 1;
		employee3.displayEmployeeDetails();



	}


}