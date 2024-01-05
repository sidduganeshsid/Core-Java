package oneToOneAssociation.bean;

//target object
public class Employe {

	private String eid;
	private String ename;
	private String eaddr;

	// HAS-A relationship
	Account account;

	// Constructor injection
	public Employe(String eid, String ename, String eaddr, Account account) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddr = eaddr;
		this.account = account;
	}

	public void getEmployeDetails() {
		System.out.println("Employee Details are :: ");
		System.out.println("EMPID   ::  " + eid);
		System.out.println("EMPNAME ::  " + ename);
		System.out.println("EMPADDR ::  " + eaddr);
		System.out.println("==========================================");
		System.out.println("ACCOUNT Details are :: ");
		System.out.println("ACCNO   ::  " + account.getAccNo());
		System.out.println("ACCNAME ::  " + account.getAccName());
		System.out.println("ACCTYPE ::  " + account.getAccType());
	}

}
