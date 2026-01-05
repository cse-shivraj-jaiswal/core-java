class JavaApplication {
	public static void execution(){
		Student s = new Student();

		//indirect read operation - safe
		System.out.println(s.getId());
		System.out.println(s.getName());


		s.setId(1);
		s.setName("Supriya");
		//indirect read operation - safe
		System.out.println(s.getId());
		System.out.println(s.getName());

	}

}