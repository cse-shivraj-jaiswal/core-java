class Employee {
	int id;
	String name;
	String mailId;
	long contactNumber;
	long adharNumber;
	String panNumber;
	String dateOfBirth;
	int age;
	String gender;
	String maritalStatus;
	static String company;
	String branch;
	String department;
	String reportingManager;
	String desegination;
	double salary;
	String role;
	double insentive;
	long uanNumber;
	double yearOfExperiance;
	static String city;
	static String state;
	static String country;

	public void displayEmployeeDetails(){
		System.out.println("Employee detail : ");
		System.out.println("------------------");
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("MailId : " + mailId);
		System.out.println("Contact Number : "+ contactNumber);
		System.out.println("Adhar Number: " +adharNumber);
		System.out.println("PAN Number : "+panNumber);
		System.out.println("Date Of Birth : "+ dateOfBirth);
		System.out.println("Age : "+age);
		System.out.println("Gender : " + gender);
		System.out.println("Marital Status : "+maritalStatus);
		System.out.println("Company : "+company);
		System.out.println("Branch : "+ branch);
		System.out.println("Department : "+department);
		System.out.println("Reporting Manager : "+reportingManager);
		System.out.println("Desedination : "+desegination);
		System.out.println("Salary : "+ salary);
		System.out.println("Role : "+role);
		System.out.println("Insentive : "+insentive);
		System.out.println("Universal Account Number : "+uanNumber);
		System.out.println("Year Of Experiance : "+yearOfExperiance);
		System.out.println("City : "+city);
		System.out.println("State : "+ state);
		System.out.println("Country : "+ country);

	}
	public void entry() {
		System.out.println("You have enter in the company. Have a nice morning!");

	}
	public void login() {
		System.out.println("You have login sucessfully!");

	}
	public void shortBreak() {
		System.out.println("You can take short break for 30 min.");

	}
	public void task() {
		System.out.println("Today task to do");

	}
	public void update() {
		System.out.println("I complted today task");

	}
	public void meeting() {
		System.out.println("Toaday meeting form 3-4");

	}
	public void reverseKt() {
		System.out.println("Today i have worked on database");

	}
	public void longBreak() {
		System.out.println("You can take 1 hr break");

	}
	public void logOut() {
		System.out.println("Log Out . Have a good day");

	}

}