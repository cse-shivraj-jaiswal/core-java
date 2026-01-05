public class Student {
	private int id;
	private String name;
	private String mailId;
	private long contactNumber;
	private Project  project;

	public Student() {

	}
	public Student(int id, String name, String mailId, long contactNumber) {
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.contactNumber = contactNumber;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public void displayStudentInfo() {
		System.out.println("Student information ");
		System.out.println("__________________");
		System.out.println("ID : "+ getId());
		System.out.println("Name : "+ getName());
		System.out.println("Mail Id  : "+ getMailId());
		System.out.println("Contact Number : "+ getContactNumber());
		System.out.println("");
	}
	public void createProject(Project project) {
		if(this.project == null && project != null) {

			this.project = project;
			System.out.println("Project created");
		}
		else {
			System.out.println("Project not Created");
		}
	}

	public void readProject() {
		if(this.project != null) {
			this.getProject().displayProjectInfo();
			System.out.println("Project displayed!");
		}
		else {
			System.out.println("Project not displayed!");
		}
	}

	public void updateProject(int id, String name, String description) {
		if(id > 0 && name != null && description != null){
			if(this.getProject().getId() == id) {
				this.getProject().setName(name);
				this.getProject().setDescription(description);
				System.out.println("Project updated");
			}
			else {
				System.out.println("Project not updated");
			}
		}
		else {
			System.out.println("Invalid data!");
		}
	}

	public void deleteProject(int id) {
		if(id > 0) {
			if(this.getProject().getId() == id) {
				this.setProject(null);
				System.out.println("Project deleted !");
			}
			else {
				System.out.println("NO Existing Project !");
			}
		}
		else {
			System.out.println("Invallid data!");
		}
	}
}