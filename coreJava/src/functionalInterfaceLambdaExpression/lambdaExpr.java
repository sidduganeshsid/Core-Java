package functionalInterfaceLambdaExpression;

@FunctionalInterface
interface ICalc
{
//	void add();
	void add(int num1,int num2);
}

@FunctionalInterface
interface MarksLost
{
	void marks(int marksgained);
}

public class lambdaExpr {

	public static void main(String[] args) {
		//anonymous inner class
//		ICalc ic = ()->{
//			int num = 1;
//			int num2 = 2;
//			int res = num + num2;
//			System.out.println("adding two nums :: "+res);
//		};
//		ic.add();
		
//		ICalc ic = (a,b)->{
//			int res = a+b;
//			System.out.println("adding nums :: "+res);
//			
//		};
//		ic.add(2,4);
		
		//one parameter means brackets are optional
		MarksLost ml = marks -> System.out.println(100-marks);
		ml.marks(67);
	}

}
