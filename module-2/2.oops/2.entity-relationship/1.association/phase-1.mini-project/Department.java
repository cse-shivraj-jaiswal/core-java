public class Department {
	private int deptId;
	private String deptName;
	private int noOfCourse;
	private String deptHodName;
	private Student Student;

	public Department() {

	}
	public Department(int deptInt, String deptName, int noOfCourse, String deptHodName) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.noOfCourse = noOfCourse;
		this.deptHodName = deptHodName;
	}
	public int getdeptId() {
		return deptId;
	}
	public void setId(int id) {
		this.id = id;
	}

}