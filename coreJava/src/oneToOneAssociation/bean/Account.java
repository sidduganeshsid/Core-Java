package oneToOneAssociation.bean;

//Dependent Object 
public class Account {

	private String accNo;
	private String accName;
	private String accType;

	public Account(String accNo, String accName, String accType) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accType = accType;
	}

	public String getAccNo() {
		return accNo;
	}
	public String getAccName() {
		return accName;
	}
	public String getAccType() {
		return accType;
	}


}