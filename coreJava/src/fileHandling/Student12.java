package fileHandling;

class StudentTrail
{
	private int sId;
	private String sName;
	private char sGender;
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public char getsGender() {
		return sGender;
	}
	public void setsGender(char sGender) {
		this.sGender = sGender;
	}
	
	@Override
	public String toString() {
		return "StudentTrail [sId=" + sId + ", sName=" + sName + ", sGender=" + sGender + "]";
	}
	
	
}

public class Student12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
