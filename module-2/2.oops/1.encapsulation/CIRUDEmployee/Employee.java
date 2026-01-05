class Employee {
	private int id;
	private String name;
	private long contactNumber;
	private String mailId;
	private String designation;
	private String role;
	private long salary;
	private double yearOfExp;

	public Employee(int id,String name,long contactNumber, String mailId, String designation,String role, long salary, double yearOfExp) {
		this.id = id;
		this.name = name;
		this.contactNumber = contactNumber;
		this.mailId = mailId;
		this.designation = designation;
		this.role = role;
		this.salary = salary;
		this.yearOfExp = yearOfExp;

	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getContacNumber() {
		return contactNumber;
	}
	public String getMailId() {
		return mailId;
	}
	public String getDesignation() {
		return designation;
	}
	public String getRole() {
		return role;
	}
	public long getSalary() {
		return salary;
	} 
	public double getYearOfExp() {
		return yearOfExp;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public void setYearOfExp(double yearOfExp) {
		this.yearOfExp = yearOfExp;
	}


}