import java.util.Scanner;
class Students {

	Scanner sc = new Scanner(System.in);
	int id;
	String name;
	long contactNumber;

	 public void create() {
	 	System.out.println("Student is created with : ");
	 }

	 public void insert() {
	 	System.out.println("Please Enter your detaails : ");
	 	System.out.println("Enter your id : ");
	 	id = sc.nextInt();
	 	sc.nextLine();
	 	System.out.println("Enter student Name: ");
	 	name = sc.nextLine();
	 	System.out.println();
	 	System.out.println("Enter your contact number: ");
	 	contactNumber = sc.nextLong();
	 	System.out.println();
	 	System.out.println("Inserted sucessfull. ");
	 }

	 public void read(){
	 	System.out.println("Id : "+id);
	 	System.out.println("Name : "+name);
	 	System.out.println("Contact number : "+contactNumber);
	 }

	 public void update() {
	 	System.out.println("Enter updated contact Details : ");
	 	contactNumber = sc.nextLong();
	 	System.out.println();
	 }

	 public void delete(Students s) {
	 	s = null;
	 	System.out.println("deleted sucessfully . ");

	 }
	 public void exit(){
	 	System.out.println("Thank you!");
	 }



}