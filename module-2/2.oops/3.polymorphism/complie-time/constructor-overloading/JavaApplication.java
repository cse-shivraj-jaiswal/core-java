class JavaApplication {
	public static void execution() {
		Student student1 = new Student("Sup", 'F', "07/08/2004");
		student1.displayStudentInfo();

		Student student2 = new Student("Gaurav", 'M', "08/08/2004","gaurav882004@gmail.com");
		student2.displayStudentInfo();

		Student student3 = new Student("Abdul", 'M', "25/02/2002","abdul@gmail.com",896794859l);
		student3.displayStudentInfo();

		Student student4 = new Student("Alok", 'M', "16/08/2003","alok@gmail.com",76776794859l);
		student4.displayStudentInfo();


	}
}