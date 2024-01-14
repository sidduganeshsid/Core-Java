package enumConcept;

enum Week
{
	MON, TUE, WEB, THU, FRI, SAT, SUN;
}


enum Result
{
	PASS, FAIL, NORESULTS; //by default static and final
}

enum Compass
{
	NORTH, SOUTH, EAST, WEST;
}

//above codes are used instead of class
class Demo
{
	final int PASS = 35;
	//PASS => error
}



public class Enum1 {

	enum Gender
	{
		MALE, FEMALE, OTHER;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
