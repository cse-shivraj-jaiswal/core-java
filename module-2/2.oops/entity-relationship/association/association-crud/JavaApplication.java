class JavaApplication{
	public static void execution(){
		Student st=new Student(101,"Shivraj Jaiswal","jaisshivraj143@gmail.com",7705080317l);
		st.displayStudentInfo();
		Project pj =new Project(1,"Train details","Java-Backend based train details fetching website.");
		st.createProject(pj);
		st.readProject();

		st.updateProject(1,"Hang-Main Game","Python based simple game Application");
		st.displayStudentInfo();
		st.readProject();
		st.deleteProject(1);
	}
}
