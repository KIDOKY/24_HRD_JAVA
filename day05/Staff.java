package day05;

public class Staff extends Person {
	// id
	private String id;
	private String dept;
	// private String dept; 담당부서
	
	public Staff(String id, String dept, String name, int age) {
		super(name, age);
		this.id = id;
		this.dept = dept;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String personInfo() {
		String info = super.personInfo();
		info += "\n사원ID: " + id + "\n담당부서: " + dept;
		return info;
	}
	
}
