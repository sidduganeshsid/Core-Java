package oneToManyAssociation.bean;

public class Employee {
	private String eid;
	private String ename;
	private Integer age;
	public Employee(String eid, String ename, Integer age) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.age = age;
	}
	
	public void getEmployeeDetails()
	{
		System.out.println("Emplo");
	}
	
}
