import java.util.Scanner;
class JavaApplication {
	static   Employee e;
	public static void execution(){
		Scanner sc = new Scanner(System.in);
		boolean selection = true;
		while(selection){
		System.out.println("Employee details: ");
		System.out.println("_________________");
		System.out.println("Enter the choice ");
		System.out.println("1. create  : ");
		System.out.println("2. Read : ");
		System.out.println("3. Update : ");
		System.out.println("4. Delete : ");
		System.out.println("5. Exit");
		int choice = sc.nextInt();
		switch(choice) {
		case 1 :{
				e  = new Employee(1, "Sup", 9693455231l , "supriya@gamail.com", "Developer", "SDE", 457458l, 2.5);
				System.out.println("Employee created sucessfully : ");
				break;
		}
	case 2 : {
		System.out.println("Id : "+e.getId());
		System.out.println("Name : "+e.getName());
		System.out.println("ContactNumber : " +e.getContacNumber());
		System.out.println("Gmail : "+e.getMailId());
		System.out.println("Desigenation : "+e.getDesignation());
		System.out.println("Role : "+e.getRole());
		System.out.println("Salary : "+e.getSalary());
		System.out.println("Year of experience : "+e.getYearOfExp());
		break;
		}
	case 3 : {

		e.setContactNumber(5458935375l);
		e.setMailId("priya@gmail.com");
		e.setDesignation("senior developer");
		e.setRole("SDE2");
		e.setSalary(8889999l);
		e.setYearOfExp(6);

		System.out.println("Updated ContactNumber : " +e.getContacNumber());
		System.out.println("Updated Gmail : "+e.getMailId());
		System.out.println("Updated Desigenation : "+e.getDesignation());
		System.out.println("Updated Role : "+e.getRole());
		System.out.println("Updated Salary : "+e.getSalary());
		System.out.println("Updated Year of experience : "+e.getYearOfExp());
		break;
	}
case 4 : {
	e = null;
	System.out.println("Deleted kr denei !");
	break;
}
case 5 : {
	System.out.println("Thank you!!");
	selection = false;
	break;

}
default : {
	System.out.println("Invalid choice: ");
}

	}
	}

		


	}
}