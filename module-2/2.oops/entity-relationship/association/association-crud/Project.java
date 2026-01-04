public class Project{
	private int id;
	private String name;
	private String description;

	public Project(){}
	public Project(int id, String name, String description){
		this.id=id;
		this.name=name;
		this.description=description;
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

	public void setDescription(String Description){
		this.name=name;
	}
	public String getDescription(){
		return description;
	}

	public void displayProjectInfo(){
		System.out.println("Project Information----");
		System.out.println("Project id : "+getId());
		System.out.println("Project name:  "+getName());
		System.out.println("Project Description: "+getDescription());
		System.out.println();
	}

}
