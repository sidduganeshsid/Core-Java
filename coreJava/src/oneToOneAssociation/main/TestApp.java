package oneToOneAssociation.main;

import oneToOneAssociation.bean.Account;
import oneToOneAssociation.bean.Employe;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = new Account("ABC123", "sachin", "Savings");

		// Constructor Injection
		Employe employe = new Employe("IND10", "sachin", "MI", account);
		employe.getEmployeDetails();

	}

}
