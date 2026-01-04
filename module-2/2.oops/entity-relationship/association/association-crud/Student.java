public class Student{
	private int id;
	private String name;
	private String mailId;
	private long contactNumber;
	private Project project;


	public Student(){}
	public Student(int id, String name, String mailId, long contactNumber){
		this.id=id;
		this.name=name;
		this.mailId=mailId;
		this.contactNumber=contactNumber;
	}

	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public void setMailId(String mailId){
		this.mailId=mailId;
	}
	public String getMailId(){
		return mailId;
	}

	public void setContactNumber(long contactNumber){
		this.contactNumber=contactNumber;
	}

	public long getContactNumber(){
		return contactNumber;
	}

	public void setProject(Project project){
		this.project=project;
	}

	public Project getProject(){
		return project;
	}

	public void createProject(Project project){
		if(this.project ==null && project!=null){
			this.setProject(project);
			System.out.println("Project Created.");
			System.out.println("-------------------------------------");
			System.out.println();
		}else{
			System.out.println("Project not Created.");
			System.out.println("-------------------------------------");
			System.out.println();
		}
	}

	public void readProject(){
		if(this.project!=null){
			this.getProject().displayProjectInfo();
			System.out.println("Peoject Displayed");
			System.out.println("-------------------------------------");
			System.out.println();
		}else{
			System.out.println("Peoject not Displayed");
			System.out.println("-------------------------------------");
			System.out.println();
		}
	}

	public void updateProject(int id, String name, String description){
		if(id>0 && name!=null && description!=null){
			if(this.getProject().getId()==id){
				this.getProject().setName(name);
				this.getProject().setDescription(description);
				System.out.println("Project updated!");
				System.out.println("-------------------------------------");
				System.out.println();
			}
			else{
				System.out.println("Project not updated!");
				System.out.println("-------------------------------------");
				System.out.println();
			}
		}else{
			System.out.println("Invalid Data!");
			System.out.println("-------------------------------------");
			System.out.println();
		}
	}

	public void deleteProject(int id){
		if(id>0){
			if(this.getProject().getId()==id){
				this.setProject(null);
				System.out.println("Project deleted!");
				System.out.println("-------------------------------------");
				System.out.println();
			}else{
				System.out.println("Project not deleted!");
				System.out.println("-------------------------------------");
				System.out.println();
			}
		}else{
			System.out.println("Invalid Data!");
			System.out.println("-------------------------------------");
			System.out.println();
		}
	}

	public void displayStudentInfo(){
		System.out.println("Student Information----");
		System.out.println("Student Id : "+getId());
		System.out.println("Student Name:  "+getName());
		System.out.println("Student MailId: "+getMailId());
		System.out.println("Student contactNumber: "+getContactNumber());
		System.out.println("-------------------------------------");
		System.out.println();
	}


}
