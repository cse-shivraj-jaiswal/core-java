import java.lang.Object;
//constroctor overloading with chaning
class Student extends Object {
	String name;
	char gender;
	String mailId;
	String dob;
	long contactNumber;
	Student(String name, char gender, String dob) {
		super();
		this.name = name;
		this.gender = gender;
		this.dob = dob;
	}
	Student(String name, char gender, String dob, String mailId) {
		this.(name,gender,dob);
		this.mailId = mailId;
	}
	Student(String name, char gender, String dob, String mailId, long contactNumber) {
		this.(name,gender,dob,mailId);
		this.contactNumber = contactNumber;
	}
		public void displayStudentInfo() {
		System.out.println("Student Info ");
		System.out.println("_______________");
		System.out.println("Name : "+name);
		System.out.println("Gender : "+ gender);
		System.out.println("DOB : "+dob);
		System.out.println("Mail Id : "+ mailId);
		System.out.println("Contact Number : "+contactNumber);
		System.out.println();
	}

}




//constrstor overloading

// class Student {
// 	String name;
// 	char gender;
// 	String mailId;
// 	String dob;
// 	long contactNumber;
// 	Student(String name, char gender, String dob) {
// 		this.name = name;
// 		this.gender = gender;
// 		this.dob = dob;
// 	}
// 	Student(String name, char gender, String dob, String mailId) {
// 		this.name = name;
// 		this.gender = gender;
// 		this.dob = dob;
// 		this.mailId = mailId;
// 	}
// 	Student(String name, char gender, String dob, String mailId, long contactNumber) {
// 		this.name = name;
// 		this.gender = gender;
// 		this.dob = dob;
// 		this.mailId = mailId;
// 		this.contactNumber = contactNumber;
// 	}
	// public void displayStudentInfo() {
	// 	System.out.println("Student Info ");
	// 	System.out.println("_______________");
	// 	System.out.println("Name : "+name);
	// 	System.out.println("Gender : "+ gender);
	// 	System.out.println("DOB : "+dob);
	// 	System.out.println("Mail Id : "+ mailId);
	// 	System.out.println("Contact Number : "+contactNumber);
	// 	System.out.println();
	// }
// }