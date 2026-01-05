class JavaApplication {
	public static void execution() {
		Student student = new Student(1, "Sup", "Sup@gmail.com", 9876543210l);
		student.displayStudentInfo();

		Project project = new Project(1, "E-com", "Java based Web Application");
		student.createProject(project);

		student.readProject();

		student.updateProject(1,"Airline Reservstion", "Javascript Baed web application");
		student.readProject();

		student.deleteProject(1);
		student.readProject();


	}

}