class Employee {
	int id;
	String name;
	String mailId;
	long contactNumber;
	static String city;
	static String state;
	static String country;
	public static void entry() {
		System.out.println("Employee can enter into the campus");
	}
	public static void login() {
		System.out.println("Employee login into yhe office");
	}
	public static void shortBreak() {
		System.out.println("Employee went for tea");
	}
	public static void meeting() {
		System.out.println("Employee is meeting");
	}
	public static void longBreak() {
		System.out.println("Employee went for lunch");	
	}
	public static void logout() {
		System.out.println("Employe went logout");
	}
	public static void exit() {
		System.out.println("Employee exit form campus");
	}

}