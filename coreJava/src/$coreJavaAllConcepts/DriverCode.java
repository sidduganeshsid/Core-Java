package $coreJavaAllConcepts;

//DriverCode
public class DriverCode{
	public static void main(String args[]) {
		System.out.println("welcome to entire core java");
		// Variables v = new Variables();
		System.out.println("main method");
		

	}
}
//EXAMPLES
/* 
//commented code, uncomment few lines and use it inside the main method.
//EXAMPLES STARTS HERE , examples works for oops concepts
class Student{}
class Employee{}
class GrandFather{

	
}
class Father extends GrandFather{
	
}
class Me extends Father
{

}
class Plane{}
class CargoPlane{}
class PassengerPlane{}
class FighterPlane{}

//examples ENDS HERE
*/

/* 
// public class DriverCode
// {
// 	public static void disp() {System.out.println("Hai through method");}
// 	//	public int add() { return 34+24 };
	
// 	//below are instance methods.
// 	//Methods Overloading
// 	public int add() { int a= 25;int b= 15; return a+b; };
// 	public void add(int a,int b) { System.out.println(a+b); };


// 	//jvm starts execution from here
// 	public static void main(String[] args) 
// 	{
// 		System.out.println("Hello world");
// 		System.out.print("Hai, Lets learn Java\n");
		
// 		System.out.print("Hai, Lets learn Java.");
// 		System.out.println("is It?");
// 		DriverCode.disp();//only static methods called in static context
// 		DriverCode dc = new DriverCode();
// 		dc.add(34,45);
// 		dc.disp();
		
// //		System.out.println();
// //		System.out.print();
// 	}
// }
*/

//concepts with code's

//is it below class allowed className?
class Class{
	// What is blueprint in java and how to represent it?
	// In java to represent a blue print we have a reserve word called "class".
}

//is below class possible?
// class Object{
	// To create an object in java we use "new" keyword
	// Syntax:
	//  ClassName variable=new ClassName();
	// new -> it is a signal to jvm to create some space for the Object in the heap area.
	// Tell the className,we inform the classname, JVM create the object and 
	// sends the
	// "hashCode" to the user.
	// User should collect the hashCode through "reference variable".			 
	// realtime example : BookMyShow
	// Objects : Person,Ticket,Cinemahall,Chair,3D-glasses,Screen,........
	// Note : Software means collection of many programs
	// 	 Programs means set of instructions.
	// 	 To write instructions we need to have a language
// }

class PrimitiveDataTypes
{
// 	Datatypes
// --------------
//   Every varaible has a type,every expression has a type and all types are strictly 
// typed/define in java
//   becoz java is strictlytype /statically typed language.
// Compiler role -> Compiler will check the value stored can be handled by
// datatype or not
// This checking which is done by compiler is 
// called "TypeChecking/Strictlytype checking".

// Primtive datatypes
// ================
//  meaning -> data which is commonly used and supported by any langauge to store 
// directly.
// a.Numeric values 
// => to store number
// a. whole number
// b. realnumber
// b.character values
// => to store character type of data
// c.boolean values
// => to store logical values
	
	//instance variables
	//1byte, -128 to 127 , 0
	byte b = 23;
	byte bc = 'a';
	byte bc2 = 'z';
	public void sizeOfByte(){
	System.out.println("Size of byte is :: "+Byte.SIZE);
 	System.out.println("MINVALUE  of byte is :: "+Byte.MIN_VALUE);
 	System.out.println("MAXVALUE of byte is :: "+Byte.MAX_VALUE);
	}
//byte = it is commonly used when we handle the data which is coming from stream,network.
// stream -> java.io package

	//2bytes, -32768 to +32767 , 0
	short s = 2343;
	short sc = 'A';
	short sc1 = '$';
										//Short.BYTE //gives size in bytes
// System.out.println("Size of short is :: "+Short.SIZE);//gives in bits
// System.out.println("MINVALUE  of short is :: "+Short.MIN_VALUE);
// System.out.println("MAXVALUE of short is :: "+Short.MAX_VALUE);
// Note: This data is not at all used in java and this data type is best sutied only 
// if u have old processors like 8086

	//4bytes, -2147483648 to 2147483647, 0
	int i = 97;
	int ic = '^';
	
	//8bytes, -9223372036854775808 to 9223372036854775807 , 0
	long l = 123456789123456789l;
	long lc = 's';
// 	If the data goes beyond the range of int,then to keep the data inside long 
// data type we need to explicitly suffix the
//   data with 'L' or 'l' otherwise it would result in "CompileTimeError"
// When int is not enough to hold the big values, then we use long data type.
//      When we work with large files, data would come to java program in terms of 
// GB's.
// long size = file.length();

	//4bytes, 1.4E-45 to 3.4028235E38 , 0.0 , IEEE
	float f = 12.123456789123456789f;
	float fc = 'a';
	float fi =12f;
	float fl = lc;
	float fl2 = l;
// 	Note: by default if u specify any real number/decimal number compiler will treat it
// as  "double", to specify
//           to the compiler to treat it as float, we need to suffix it with 'F' or 
// 'f'.

	//8bytes, 4.9E-324 to 1.7976931348623157E308  ,0.0 
	double d = 123.12346789123456789d;
	double df = 123.43f;
	double dc = 'z';
	double dl = l;

	//2bytes,  , 0
	char c = 'g';
	char ci = 65;
	char ci2 = 2345;
	// char c34 = true;
	// char cb = b; s; i; l;
	// char cl = f; d;

	//		,  ,false
	boolean bool = false;
	boolean bool1 = true;
	// boolean co = 234;
	// boolean c123 = 2.3f;
	// boolean cwe = 'c';

	//Type casting 
		//WI NE
	int ib = b;//type promotion
	float il = l;//widening

	short ei = (short) i; //explicit type casting | narrowing

// 	Note: Datatypes are actually represented to the compiler and jvm using reserve 
// words.
// reserve words are normally in "lower case".
// To map primitive data as Object in java from JDK1.5 concept of "Wrapper
// class" was introduced in
// JDK1.5 version.
//       byte -------------> Byte(C)
//                        short--------------> Short(C)
//      int    --------------> Integer(C)
//      long --------------> Long(C)
//      float --------------> Float(C)
//      double------------> Double(C

//CS
// CodeSnippets(JDK8 version)
// ------------------------------------
// For the code below, what should be the name of java file?
// 1.
// public class HelloWorld {
//     public static void main(String [] args) {
//         System.out.println("Hello World!");
//     }
// }
// A. Hello.java
// B. World.java
// C. HelloWorld.java
// D. helloworld.java
// 2.
// Does below code compile successfully?
// public class Test {
//     public static void main(String[] args) {
//         System.out.println("Hello");;;;;;;;;
//     }
// }
// A. yes
// B. no
// Ans: A
// In java every statement should be terminated with ; symbol
//   Note: ;  means ending.
// 3.
// What is the signature of special main method?
// A. public static void main(String args)   //[] is missing
// B. public static void main(String[] a)     //correct
// C. public static void main()//missing String[] args
// D. private static void main(String[] args)// private can't be for a main method
// 4.
// What will be the result of compiling and executing Test class?
//   java Test good morning everyone
// private class Test{ 
//    public static void main(String args[]) { 
//        System.out.println(args[1]);
//    }
// }
// A. compilation error  //valid answer becoz the main method class can't be private
// B. good
// C. morning
// D. everyone
// 5.
// For the class Test, which options, if used to replace /*INSERT*/, will print 
// "Hurrah! I passed..." on to the console? Select 2 options.
// public class Test {
//     /*INSERT*/ {
//         System.out.println("Hurrah! I passed...");
//     }
// }
// A. static public void main(String[] args)    // static and public can be 
// interchanged so valid
// B. public static void main(String[] a)//valid 
// C. static public void Main(String[] args)
// D. public void main(String[] args)
// E. protected static void main(String[] args)
// F. public void static main(String[] args)//here static and void is interchanged is 
// not possible
// 6.
// Suppose you have created a java file, "MyClass.java". 
// Which of the following commands will compile the java file?
// A. javac MyClass     //invalid becoz .java is missing
// B. java MyClass      // javac is command is used for compilation
// C. javac MyClass.class //invalid becoz .java is missing
// D. javac MyClass.java //valid
// E. java MyClass.java   //javac is the command for compilation and java is command 
// for execution
}

class Variables{ //6 types
	//primitive vairables
	int i1 = 1947;

	//instance variable 
	int sum = 23_23_255;
	boolean flag = false;
	long l;
	Integer sum2 = 78;
	// Student name;

	//static variables
	static int i = 23;
	static float productPrice = 23.5f;
	static int staticNum;
	// i = 25;

	//static block is mostly used to initialize the static variables
	static 
	{
		i=25;
		System.out.println("static block and var's");
		System.out.println(staticNum);
	}

	//reference variables
	Object oNum1 = 23;
	Object oNum2 = 23.4f;

	public void show(){
		//local variables
		int life = 100;
		System.out.println("life is "+life);
	}

	//final variables 
	final float pi = 3.14f; //compiler will gets to know the value

	//Additional Study
// 	Types of variables
// ==============
// Division 1 : Based on the type of value represented by a variable all variables are
// divided into 2 types. 
// They are: 
// 1. Primitive variables
// 2. Reference variables
// Primitive variables:
// Primitive variables can be used to represent primitive values.
// Example: int x=10; 
// Reference variables: 
// Reference variables can be used to refer objects. 
// Example: Student s=new Student();
// instance variable
// If the variable is declared inside the class, but outside the methods such 
// variables are called as 
// "instance variables".
// or
// if the value of the variables changes from object to object then such 
// variables are called as "instance variables"
// eg#1.
// Student std1= new Student();//id = 10, name =sachin
// Student std2= new Student();//id = 7,   name=dhoni
// When will the memory for instance varaible be given?
//   Ans. Only when the object is created JVM will create a memory and by default jvm 
// will also assign the default value
//            based on the datatype of the varaible.
// eg: int -> 0, float-> 0.0f, boolean -> false,char -> 
// , String -> null,....
// Note: scope of instance variable would be available only when we have reference 
// pointing to the object, 
//      if the object reference becomes null, then we can't access "instance 
// varaibles".
// Key points about instance varaibles
// =============================
// Instance variables: 
// => If the value of a variable is varied from object to object such type of 
// variables are called instance variables.
// => For every object a separate copy of instance variables will be created.
// => Instance variables will be created at the time of object creation and destroyed 
// at the time of object destruction 
//      hence the scope of instance variables is exactly same as scope of objects.
// => Instance variables will be stored on the heap as the part of object.
// => Instance variables should be declared with in the class directly but outside of 
// any method or block or constructor.
// => Instance variables can be accessed directly from Instance area. But cannot be 
// accessed directly from static area.
// => But by using object reference we can access instance variables from static area.
// eg#1.
// public class Test {
// boolean b;
// public static void main(String[] args) {
// Test t=new Test();
// System.out.println(t.b);//false
// }
// }
// eg#2
// public class Test {
// int i=10;//instance variable
// public static void main(String[] args) {
// System.out.println(i);//CE: instance variable can't be accessed 
// directly in static context
// Test t=new Test();//Object created i = 10 is stored in heap area
// System.out.println(t.i);//10
// t.methodOne();
// }
// public void methodOne(){
// //inside instance method instace variable can be directly 
// accessed.
// System.out.println(i);//10 becoz it is an instance varaible
// }
// }
// local varaibles
// ------------------
//   1. Variables which are created inside the method are called local variables and 
// memory for those variables
// will be given in  the stackarea.
//   2. During the execution of the method the memory for local variables will be 
// given,and after the execution of 
//       the method the memory for variables will be taken out from the stack area.
//   3. Local varaibles default value will not be given by the JVM, programmer should 
// give the default value.
//   4. If the programmer doesn't give default value and if he uses the varaible 
// inside the method then program would
// result in "CE".
// Keypoints of Local variables
// -------------------------------------
// Local variables: 
// => Some times to meet temporary requirements of the programmer we can declare 
// variables inside a method or 
//       block or constructors such type of variables are called local variables or 
// automatic variables or temporary variables 
//       or stack variables. 
// => Local variables will be stored inside stack. 
// => The local variables will be created as part of the block execution in which it 
// is declared and destroyed once 
//       that block execution completes. Hence the scope of the local variables is 
// exactly same as scope of the block in 
//       which we declared.
// => It is highly recommended to perform initialization for the local variables at 
// the time of declaration at least 
//       with default values.
// eg#1.
// public class Test {
// public static void main(String[] args) {
// int i=0;
// for(int j=0;j<3;j++)
// {
// i=i+j;
// }
// System.out.println(i);//valid
// System.out.println(j);//CE: 'j' variable not declared
//    }
// }
// eg#2.
// class Test {
// public static void main(String[] args) {
// try{
// int i=Integer.parseInt("ten");
// }
// catch(NullPointerException e){
// System.out.println(i);//CE: 'i' not declared
// }
// }
// eg#3.
// class Test{
// public static void main(String[] args){
// int x;
// System.out.println("hello");//hello
// }
// }
// Note: code would be compiled becoz variable x is not used anywhere.
// eg#4
// class Test{
// public static void main(String[] args){
// int x;
// System.out.println(x);//CE: 'x' not initalized
// }
// }

}

class Identifiers{
	// Identifier
	// ========
	//   It is a name in java program.
	//   It can be a classname,methodname,variable name and label name.
	// class Test{
	// public static void main(String[] args){
	// int x= 10;
	// }
	// }
	// Totally 5 identifers
	// eg#2.
	// class Test{
	// public static void main(String[] args){
	// System.out.println("sachin");
	// }
	// }
	// Totally 7 identifiers.
	// Rules(syntax for compiler + jvm) for writing an identifier
	// ---------------------------------------------------------------------------
	// Rule1: The only allowed characters in java identifiers are
	// a to z, A to Z,0 to 9, _(underscore),$  
	// Rule2: If we use any other characters it would result in compile time error
	// int ^* = 10;(invalid)
	// int total = 10;(valid)
	// int total#= 35;(invalid)  
	// Rule3: Identifiers are not allowed to start with digits
	// int telusko1 =100;(valid)
	// int 1telusko = 100;(invalid)
	// Rule4: Java identifiers are case sensitive,meaning number and Number is different.
	// class   Demo{
	// int number=10;
	// int Number=20;
	// int nUmber= 30;
	// int NUMBER = 40;
	// }
	// Rule5: There is no lenght limit on java identifiers, but still it is a good 
	// practise to keep the
	//  length of the identifier not more than 15characters.
	// int priorityOfThreadWithMinValue = 1;
	// Rule6: We can't use reserve words as a identifers.
	//   eg:  int if = 10; //CE
	// Rule7: Predefined class names can be used as identifiers like String,Runnable
	// eg#1
	// String Runnable = "sachin";
	// System.out.println(Runnable);//sachin
	// eg#2
	// int String = 10;
	// System.out.println(String);//10
	// Note: Even though predefined class names can be used as an indetifiers,it is not a 
	// good practise to keep
}

class ReservedWords{
	//ReservedWords
	// =It is a built in words/keywords which has already a predefined meaning to it
// 	Note: for boolean datatypes the only values allowed for a variable is "true,false",
// other than this if we try
// to keep any values it would reslut in "CompileTimeError".
//    => All reserved  words names would start with "lower case ".
//    => In java all Classnames/interfacenames would start with "upper case"
// 


}

class Operators{//7 operators commonly

//ARITHMETIC OPERATOR + - * / %
		// int a=4;
		// int b=2;
		// int res=a%b;
		// System.out.println(res);


//ASSIGNMENT OPERATOR 
	/*
		 * int a=10; int b=20;
		 * 
		 * System.out.println(a>b); System.out.println(a<b); System.out.println(a==b);
		 */
		/*
		 * int abc=5; abc=10;
		 * 
		 * 
		 * 
		 * int a,b,c,d;
		 * 
		 * a=b=c=d=10+5;
		 * 
		 * System.out.println(a + " "+b + " " +c+" "+d);
		 */
		
		
		//  int a=2;
		//  a+=20;
		//  System.out.println(a);
		//  a-=20;
		//  System.out.println(a);
		//  a*=20;
		//  System.out.println(a);
		//  a/=20;
		//  System.out.println(a);
		//  a%=20;
		//  System.out.println(a);

//RELATIONAL OPERATORS
	/*
		 * int a=8; int b=2;
		 * 
		 * if(a>b) { if(a==10) { System.out.println("Subtraction");
		 * System.out.println(a-b); } else {
		 * System.out.println("A is greater but not equal to 10"); } } else if(a==b) {
		 * System.out.println("Addition"); System.out.println(a+b); } else if(a<b) {
		 * System.out.println("a is lesser"); } else {
		 * 
		 * }
		 */
		
		/*
		 * int a=10; int b=20; int c=5;
		 * 
		 * if(a<b) { if(a<c) { System.out.println("A is the least "+a); }
		 * 
		 * else { System.out.println("C is the least"+c); } } else if(b<c) {
		 * System.out.println("B is least" +b); } else {
		 * System.out.println("C is least"+ c);
		 * 
		 * }
		 */

//LOGICAL OPERATOR
	// int a=10;
	// 	int b=20;
	// 	int c=30;
		
	// 	if(a<b && a==b)
	// 	{
	// 		System.out.println("A is least");
	// 	}
	// 	else if(b<c && b==a)
	// 	{
	// 		System.out.println("B is least");
	// 	}
	// 	else if(c <a && c<b)
	// 	{
	// 		System.out.println("else block last block");
	// 	}
	// 	else
	// 	{
	// 		System.out.println("Last block");
	// 	}

//CONDITIONAL OPERATOR OR TERINARY OPERATOR ? : 
	/*
		 * int a=10; int b=20;
		 * 
		 * 
		 * int c= (a<b)? a: b; System.out.println(c);
		 */
		
		//  int a=100;
		//  int b=20;
		//  int c=60;
		 
		//  int res = (a<b)? (a<c? a:c):(b<c?b:c) ;
		//  System.out.println(res);
	 
		//  int num1=100;
		//  int num2=20;
		//  int num3=60;
		//  if(num1<num2)
		//  {
		// 	 if(num1<num3)
		// 	 {
		// 		 System.out.println(num1);
		// 	 }
		// 	 else
		// 	 {
		// 		 System.out.println(num3);
		// 	 }
		//  }
		//  else if(num2<num3)
		//  {
		// 	 System.out.println(num2);
		//  }
		//  else
		//  {
		// 	 System.out.println(num3);
		//  }

//INCREMENT AND DECREMENT OPERATORS
		//int a=5;
		//System.out.println(a);
		//a++;
		//++a;
		//System.out.println(a);


//CS
		// int a=5;
		// int b;
		// b=a++ + --a - a-- - a++;
		// System.out.println(a);
		// System.out.println(b);

//BITWISE OPERATORS


//CS
// 7.
// Given code of Test.java file:
// public class Test {   
//     public static void main(String[] args){   
//         args[1] = "Day!";
//         System.out.println(args[0] + " " + args[1]);
//     }
// }
// And the commands:
// javac Test.java
// java Test Good
// What is the result?
// A. Good
// B. Good Day!
// C. Compilation Error
// D. JVM would create a problem during execution
// answer : D
// Consider below code of Test.java file:
// public class Test {   
//     public static void main(String[] args){   
//         System.out.println("Welcome " + args[0] +"!");
//     }
// }
// And the commands:
// javac Test.java
// java Test "James Gosling"  "Bill Joy"
// What is the result?
// A. Welcome James Gosling!
// B. Welcome Bill Joy!
// C. Welcome "James Gosling"!
// D. Welcome "Bill Joy"!
// E. Welcome James!
// F. Welcome Gosling!
// G. Welcome Bill!
// H. Welcome Joy!
// answer : A
// 10.
// Consider below code of Test.java file:
// public class Test {
//     public static void main(String[] args) {
//         boolean b1 = 0;
//         boolean b2 = 1;
//         System.out.println(b1 + b2);
//     }
// }
// What is the result of compiling and executing Test class?
// A. 0
// B. 1
// C. true
// D. false
// E. compilation error
// answer : E
// 11.
// Given:
// 35. String #name = "Jane Doe";
// 36. int $age = 24;
// 37. Double _height = 123.5;
// 38. double ~temp = 37.5;
// Which two statements are true? (Choose two.)
// A. Line 35 will not compile.
// B. Line 36 will not compile.
// C. Line 37 will not compile.
// D. Line 38 will not compile.
// answer : A,D
// 12.
// What will be the result of compiling and executing Test class?
// public class Test {   
//     public static void main(String[] args){   
//         byte b1 = ( byte ) ( 127 + 21 );    // byte b1 = (byte)(148)  
//         System.out.println(b1);
//     }
// }
// A. 148
// B. Compilation Error
// C. -108
// D. -128
// JVM : minrange + (result-maxrange-1)
//           = -128    + (148 - 127-1)
//          = -128     +(148-128)
//          = -128     +(20)
//          = -108
// 13.
// Consider below code of Test.java file:
// public class Test {
//     public static void main(String[] args) {
//         char c1 = 'a'; //ASCII code of 'a' is 97
//         int i1 = c1; //Line n1   // char----> int (implicit typecasting)
//         System.out.println(i1); //Line n2
//     }
// }
// What is the result of compiling and executing Test class?
// A. a
// B. 97
// C. Line n1 causes compilation failure
// D. Line n2 causes runtime error.
// answer : B
// 14.
// Given code of Test.java file:
// public class Test {
// public static void main(String[] args) {
//           byte b1 = 10; //Line n1
//   int i1 = b1; //Line n2  Compiler : byte-----> int(Implicit typecasting)
//           byte b2 = i1; //Line n3 Compiler : int------> byte (hey not possible u 
// explicitly tell)
//           System.out.println(b1 + i1 + b2);
//     }
// }
// What is the result of compiling and executing Test class?
// A. Line n1 causes compilation  error
// B. Line n2 causes compilation error.
// C. Line n3 causes compilation error.
// D. 30 printed on to console.
// answer : C
// 15.
// For the given code what is the output?
//    int x=100;
//    int a=x++; // a = 100, x = 101
//    int b= ++x;// b = 102, x = 102
//    int c= x++;// c = 102, x = 103                                    true          
// true        value
//    int d= (a<b) ? (a<c) ? a: (b<c)? b: c :x;//int d= (100<102)?(100<102):100
//    System.out.println(d);//100  
// A. 100
// B. 101
// C. 102
// D. 103
// E. compilation fails
// answer: A
// 16.
// class Test 
// {
// public static void main(String[] args) 
// {
// int a=100; // a= 10-
// System.out.println(-a++);//System.out.println(-100); now a = 101
// }
// }
// A. -101
// B. 99
// c. Compilation error
// d. -100
// e. -99
// answer : d
// fallthrough in switch
// ---------------------------
//  int a = 97;
//  switch(a){
// case 97: System.out.println("hello");
// case 98: System.out.println("hiee");
//  }
// output: hello
// hiee 
// since there is no break automatically control executed the next case also,this 
// condition in java under switch we call as
// "fallthrough".
// Sir Please You Can Explain For What We Use = a+""+b+""+c+""
// int a= 10,b=20,c=30;
// System.out.println(a + " " + b + " "+ c);//10 20 30
// javac Test.java
// java   Test  ind.txt
// java   Test  aus.txt
// public class Test{
// public static void main(String args[]){
// //file name will be supplied from the command line arguments
// //code written to open the file and read the contents from the file
// }
// }
// ind.txt
//  rahul
//  rohith
//  kohli
// aus.txt
//   warner
//   finch
//   smith

}

class Literals{
	// Literal Any constant value which can be assigned to a variable is called literal
	// int data =10;
	// literal -> 10
	// data  -> variableName/identifier
	// int     -> datatype/reserveword

//CS
// Q> 
// Consider below code: 
// public class Test {
//     public static void main(String[] args) {
//         char c = 'Z';
//         long l = 100_00l;//from JDK1.7 for a literal we can give _ also, if we give
// compiler will remove that _ in .class file
//         int i = 9_2;//from JDK1.7 for a literal we can give _ also, if we give 
// compiler will remove that _ in .class file
//         float f = 2.02f; 
//         double d = 10_0.35d;//from JDK1.7 for a literal we can give _ also, if we 
// give compiler will remove that _ in .class file
//         l = c + i;//char + int = int   int -----> long (implicit)
//         f = c * l * i * f;//char * long*int*float = float
//         f = l + i + c;//long+int+char = long  long---> float(implicit)
//         i = (int)d;//double----> int(explicit)
//         f = (long)d;//double---> long  , long ---> float (implicit)
//     }
// }
// Does above code compile successfully?
// A. Yes
// B. No
// Answer : A
// Q> 
// class Test 
// {
// public static void main(String[] args) 
// {
// int a = 20;   // a = 18
// int var= --a * a++ + a-- - --a;//  var = 19 * 19 + 20 -18 = 363
// System.out.println("a = " + a);// a = 18
// System.out.println("var = " + var);//var= 363
// }
// }
// A. 
//  a = 18
//  var=363
// B. 
//     a = 363
//     var=363
// C. Compilation Error
// D.
//   a = 25
// var= 363
// answer : A
// Q> 
// class Test 
// {
// public static void main(String[] args) 
// {
// int i = 5; // i  = 5,6,7
//    //5 < 6(true)
// if (i++ < 6)
// {
// System.out.println(i++);//System.out.println(6)
// }
// }
// }
// A. 5
// B. 6
// C. Program executes succesfully but nothing is printed on to console
// D. 7
// Q> 
// int x  = 4;//line-n1
// int y = 4++;//line-n2   whether it is post or pre-increment it can only be done on 
// variables not on direct literals
// System.out.println(x);
// System.out.println(y);
// A. line-n1 CompileTimeError
// B. x=4
//      y=5
// C. x=5
//      y=5
// D. line-n2 CompileTimeError
// Answer: D
// Q> 
// 24
//  int x = 4;//line-n1
//  int y =++(++x);//line-n2 whether it is post or pre-increment it can only be done 
// on variables not on direct literals
//  System.out.println(x);
//  System.out.println(y);
// A. line-n1 CompileTimeError
// B. x=4
//      y=5
// C. x=5
//      y=5
// D. line-n2 CompileTimeError
// Answer: D
// Q> 
// boolean b=true;//line -n 1
//  b++;//line-n2    Ans. increment and decrement is applicable only for 
// integral,floating type and character type not for boolean type
//  System.out.println(b); 
// A. line-n1 Compile Time Error
// B. line-n2 Compile Time Error
// C. false
// D. true
// E. None of the above
// Anser : B
// Q> 
//   int b,c,d;//declaring the variables
//   int a= b = c = d=10;/intializing the values for b=c=d and finally giving the 
// value to a variable with declaration
//   Will the code compile?
// A. yes
// B. no
// Answer: A
// Q> 
//   int a = b = c = d = 20;//b,c,d not declared but using so CompileTime Error
//   System.out.println(a);
//   Will the code compile?
// A. yes
// B. no
// Answer : B
// Q> 
//  byte c = (10> 20) ? 30 : 40;//literals are involved so compiler performs operation
//   byte c =40; 
//  byte d =(10<20) ? 30 : 40;//literals are involved so compiler performs operation
//   byte d =30;
//  System.out.println(c);//40
//  System.out.println(d);//30
// A. 30
//      40
// B. 40
//      30
// C. 10
//      20
// D. 20
//      10
// E. CompiletimeError
// Answer : B
// Q>  
//  int a = 10, b = 20;//type checking is valid no problem
//  byte c = (a>b) ? 30 : 40;//literals are not involved in operation, so compiler 
// would just check type checking of result
//       Compiler will see 30,40 type it knows is int, 
// so the result should be of int type only.
//       if compiler only perform the operation it will 
// try to map with casting chart otherwise it wants
//      the exact type.
//  byte d =(a<b)  ? 30  : 40;
//  System.out.println(c);
//  System.out.println(d);
// A. 30
//      40
// B. 40
//      30
// C. 10
//      20
// D. 20
//      10
// E. CompiletimeError 
// Answer: E
// Q> 
// Consider below statements:
// 1. int x = 5____0;// Literal values can be with _  also but it should be in b/w not
// at the beginging or at the end
// 2. int y = ____50;//invalid becoz starts with _ 
// 3. int z = 50____;//invalid becoz in ends with _
// 4. float f = 123.76_86f;//valid
// 5. double d = 1_2_3_4;//valid
// How many statements are legal?
// A. One statement only
// B. Two statement only
// C. Three statement only
// D. Four statement only
// E. All 5 statement only.
// Answer : C
// Note: 
// Compiler -> it checks only the syntax and makes the jvm execution smoothful
// JVM          -> Creates the memory for the variables and perform type casting and 
// generates the result.
// Q>  
// int x=10 , y=15 ;
//  if(++x < 10 & ++y > 15) {   //11<10(false)  & 16>15(true)
//   x++;
//  }
//  else {
//   y++;//17
//  }
//  System.out.println(x+"----"+y);
// predict x and y value by replacting the operators with
//    ||   => x and y  value  ?
//    || -> it is called as "Short circuit OR operator"
//      second operand evaluation will happen only if the first operand result 
// is false
// x = 12
// y = 16
//    && => x and y value 
//    && -> it is called as "Short circuit AND operator"
//      second operand evaluation will happen only if the first operand result 
// is true
// x = 11
// y = 16
//     |    => x and y value  
//      |=> It is called as "Logical OR operator"
//     both the operands result will be evaluated.
// x = 12
// y = 16
//    &   =>  x and y value  ?
//    & -> It is called as "Logical AND operator"
//     both the operands  result will be evaulated 
// x =11
// y =17
// Q> 
// int x=10 ;
//  if(++x < 10 && ((x/0)>10) ) { //11<10===> if(false)
//  System.out.println("Hello"); 
//  }
//  else {
//   System.out.println("Hi"); 
//  }
// A. Hello
// B. Hi
// C. Compile Time Error
// D. Exception
// E. None of the above.
// Answer : B
// Q>
// Give
// int i=10;//10
// int j=20;//30
// int k= (j+=i)/5;//  k = (j= j+i)/5
//        k= (j=20+10)/5
//        k = (j=30)/5
//        k= 30/5
//        k= 6
// System.out.println(i+":"+j+":"+k);
// A.10:30:6
// B.10:22:22
// C.10:22:20
// D.10:22:6
// Answer : A
// Q> 
// Syntax of if
// --------------
//  if(boolean){
// stmt-1;
// stmt-2;
//  }else{
// stmt-3;
// stmt-4;
// }
//  int x =10;
//  if(x){//CE: unexpected type required: boolean,found:int
// System.out.println("hello");
//  }else{
// System.out.println("hiee");
// }
// A. hello
// B. hiee
// C. CompileTime Error
// D. Some problem by jvm at the execution
// E. None of the above
// Answer: C
// Q> 
// int x =10;
// if(x=20){//CE: unexpected type required: boolean,found:int
// System.out.println("hello");
//  }else{
// System.out.println("hiee");
// }
// A. hello
// B. hiee
// C. CompileTime Error
// D. Some problem by jvm at the execution
// E. None of the above
// Answer: C
// Q>
// int x =10;
// if(x==20){//operator used is Equality operator   ==, !=  output is boolean
// System.out.println("hello");
//  }else{
// System.out.println("hiee");
// }
// A. hello
// B. hiee
// C. CompileTime Error
// D. Some problem by jvm at the execution
// E. None of the above
// Anser: B
// Q>
// boolean b= false;
// if(b=true){//assignment operator is evaluted on boolean data type, JVM if(true)
// System.out.println("hello");
//  }else{
// System.out.println("hiee");
// }
// A. hello
// B. hiee
// C. CompileTime Error
// D. Some problem by jvm at the execution
// E. None of the above
// Answer : A
// Q>
// boolean b= false;
// if(b==true){//Equality operator result is boolean type , JVM if(false == true) ----
// > if(false)
// System.out.println("hello");
//  }else{
// System.out.println("hiee");
// }
// A. hello
// B. hiee
// C. CompileTime Error
// D. Some problem by jvm at the execution
// E. None of the above
// Answer: B
// Q>
// if(boolean)
// stmt-1;
// Note: if there is only statement which needs to be a part of if, then {} is 
// optional.
// if(true)
// System.out.println("hello");
// A. Compile Time Error
// B. hello
// C. Some problem by jvm at the execution
// D. None of the above
// Answer : B
// Q>
// public class Test{ 
// public static void main(String args[]){ 
// if(true); 
// }
// } 
// A. Compile Time Error
// B. hello
// C. Some problem by jvm at the execution
// D. No Output
// Answer : D(becoz ; is also valid java statement)
// Q>
// Note: if there is only statement which needs to be a part of if, then {} is 
// optional,but that statement should not
//    be a declarative statement.
// public class Test{ 
// public static void main(String args[]){ 
// if(true) 
// int x=10; //CE: declaration not allowed here
// }
// } 
// A. Compile Time Error
// B. hello
// C. Some problem by jvm at the execution
// D. No Output
// Answer: A
// Q>
// public class Test{ 
// public static void main(String args[]){ 
// if(true) {
// int x=10; //valid for compiler becoz of {}
// }
// }
// } 
// A. Compile Time Error
// B. hello
// C. Some problem by jvm at the execution
// D. No Output
// Answer: D
// Q> 
// public class Test{ 
// public static void main(String args[]){ 
// if(true) 
// System.out.println("hello");//Dependent of if statement
// System.out.println("hiee");//Independent of if statement
// }
// } 
// How many statements are independent of if?
// A. 0-stmt
// B. 1-stmt
// C. 2-stmt
// D. 3-stmt
// Answer: B
}

class Conditionals{//if, if else , else if, switch

	// ELSE IF 
	// int num1=100;
	// int num2=20;
	// int num3=60;
	// if(num1<num2)
	// {
	// 	if(num1<num3)
	// 	{
	// 		System.out.println(num1);
	// 	}
	// 	else
	// 	{
	// 		System.out.println(num3);
	// 	}
	// }
	// else if(num2<num3)
	// {
	// 	System.out.println(num2);
	// }
	// else
	// {
	// 	System.out.println(num3);
	// }


	//SWITCH
	// int number=100;
	// switch(number){
	// case 100: System.out.println("1st case");
	// 		 break;
	// case 108: System.out.println("2nd case");
	// 		break;
	// case 10: System.out.println("3rd case");
	// 		break;
	// default : System.out.println("no cases matching");
	// }


	//CS
// 	Q> 
// public class Test{ 
// public static void main(String args[]){
// int x=10; 
// switch(x) 
// { 
// System.out.println("hello"); //Statement is not a part of 
// case lable so CompileTime Error
// }
// }
// }
// A. CompileTimeError
// B. hello
// C. JVM will create problem at the runtime
// D. None of the above
// answer : A
// Q> 
// switch(args){
// case label1: stmt-1;
// case label2: stmt-2;
// default : stmt-n
// }
// label  in switch should be "Compiletime Constants", meaning the value should be 
// know to compiler otherwise CE>
// public class Test{ 
// public static void main(String args[]){
// int x= 10; 
// int y = 20;
// switch(x) 
// { 
// case 10: System.out.println("hello"); 
//   break;
// case y:System.out.println("hiee"); //CE: 'y' value is not 
// CompileTime Constant
//  break;
// }
// }
// }
// A. CompileTimeError
// B. hello
// C. hiee
// D. JVM will create problem at the runtime
// E. None of the above
// Answer: A
// Q>
// public class Test{ 
// public static void main(String args[]){
// int x= 10; 
// final int y = 20;//final means compiler will get to know the value and 
// compiler treats it as "CompileTime Constant".
// switch(x) 
// { 
// case 10: System.out.println("hello"); 
// break;
// case y:System.out.println("hiee"); 
// break;
// }
// }
// }
// A. CompileTimeError
// B. hello
// C. hiee
// D. JVM will create problem at the runtime
// E. None of the above
// Answer: B
// Q> 
// public class Test{ 
// public static void main(String args[]){
// int x=10; 
// switch(x+1) 
// { 
// case 10:
// case 10+20:
// case  10+20+30:
// }
// }
// }
// A. CompileTimeError
// B. No Output
// C. JVM will create problem at the runtime
// D. None of the above
// Answer: B
// Q> 
// switch(args){
// case label1: stmt-1;
// case label2: stmt-2;
// default : stmt-n
// }
// label  in switch should be "Compiletime Constants", meaning the value should be 
// know to compiler otherwise CE>
// label value should be with in the range of switch argument type otherwise it would 
// result in "CE".
// public class Test{ 
// public static void main(String args[]){
// byte x=10; 
// switch(x) 
// { 
// case 10:System.out.println("hello");
// break;
// case 100: System.out.println("hiee");
//    break;
// case 1000: System.out.println("byee");//CE: possibly loss of 
// precession from byte to int
//      break;
// }
// }
// }
// A. CompileTimeError
// B. hello
// C. JVM will create problem at the runtime
// D. hiee
// Answer : A
// Q> 
// switch(args){
// case label1: stmt-1;
// case label2: stmt-2;
// default : stmt-n
// }
// label  in switch should be "Compiletime Constants", meaning the value should be 
// know to compiler otherwise CE>
// label value should be with in the range of switch argument type otherwise it would 
// result in "CE".
// public class Test{ 
// public static void main(String args[]){
// byte x=10; 
// switch(x+1) //byte + int  ----> int   , so switch(int)
// { 
// case 10:System.out.println("hello");
// break;
// case 100: System.out.println("hiee");
//    break;
// case 1000: System.out.println("byee");
//      break;
// }
// }
// }
// A. CompileTimeError
// B. hello
// C. JVM will create problem at the runtime
// D. hiee
// E. byee
// F. no output
// Answer : F
// Q> 
// switch(args){
// case label1: stmt-1;
// case label2: stmt-2;
// default : stmt-n
// }
// label  in switch should be "Compiletime Constants", meaning the value should be 
// know to compiler otherwise CE>
// label value should be with in the range of switch argument type otherwise it would 
// result in "CE".
// case lables value can't be duplicated, if we try to do it would result in "CE".
// public class Test{
// public static void main(String args[]){
// int x=97;
// switch(x){
// case 97:System.out.println("97");
// break;
//          case 99:System.out.println("99");
// break;
// case 'a':System.out.println("100"); // int x= 'a';  x = 97
// break;
// }
//   }
// }
// A. 97
// B. CompileTimeError
// C. JVM will create problem at the runtime
// D. 99
// E. 100
// Answer: B
// Q>
// What will be the output of compiling and executing the Test class? 
// public class Test {
//     public static void main(String[] args) {
//         int a = 5;
//         int x = 10;
//         switch(x) {
//             case 10:
//                 a *= 2;//a = a*2 = 5*2 = 10, a = 10
//             case 20:
//                 a *= 3;//a = a*3 ,  a=10*3 = 30, a = 30 
//             case 30:
//                 a *= 4;// a = a*4, a =30 * 4 =120, a= 120 
//         }
//         System.out.println(a);//120
//     }
// }
// A. 5
// B. 10
// C. 30
// D. 120
// E.CompileTimeError
// Answer: D
}

class CommandLineArguments{}

class Loops{

}

class PatternProgramming{
	public static void pp1() 
	{
		int n=10;
		for(int i=0; i<n;++i)
		{
		System.out.println("*");
		}
		

	}

	public static void pp2() {

		
		int n=5;
		int i=0;
		while(i<n)
		{
			System.out.print("*");
			i++;
		}

	}

	public static void pp3() {

		
		
		int n=15;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

	
	public static void pp4() {
	
		
		int n=10;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				if((i==0 && j<n-1) || j==0 ||(i==n-1 && j<n-1)|| (j==n-1 &&i>0 &&i<n-1) )
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

	//letter P
	public static void pp5() {
	
		
		int n=10;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				// G (i==0 && j>0 && j< (3*n)/4) || 
				/*(j==0 && i>0 && i<n-1) ||
				(i==(n-1)/2 && j>=(n-1)/2 && j<=(3*n)/4) ||
				(j==(3*n)/4 && i>=(n-1)/2) ||
				(i==n-1 && j<(n-1)/2) ||
				(j==(n-1)/2 && i>=(n-1)/2)*/
				
				 //H j==0 || j==(3*n)/4 || i==(n-1)/2 && j<=(3*n)/4
				if(j==0 || i==0 && j<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2 ||
						j==(n-1)/2 && i<(n-1)/2 && i>0)
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

	//letters ABC
	public static void pp6() {
		
		
		int n=10;
		
		for(int i=0;i<n; i++)
		{
			for(int j=0 ; j<n; j++)
			{
				if((j==0 && i>0) ||
						(i==(n-1)/2 && j<=(3*n)/4) ||
						(i==0 && j<(3*n)/4) && j>0||
						(j==(3*n)/4 && i>0))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			for(int j=0 ; j<n; j++)
			{
				if((i==0 && j<(n-1)/2)|| (i==(n-1)/2)&& j>0 && j<(n-1)/2 
						||(i==n-1 && j<(n-1)/2) ||
						(j==(n-1)/2 && i>0 && i!=(n-1)/2 && i<n-1) || j==0
		)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			for(int j=0 ; j<n; j++)
			{
				if(i==0 && j>0 && j<(3*n)/4  || j==0 && i>0 && i<n-1 
						|| i==n-1 && j>0 && j<(3*n)/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			System.out.println();
		}
		

	}

	//deck card
	public static void pp7() {
	
		int n=28;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j==(n-1)/2 || i-j==(n-1)/2 || 
						j-i==(n-1)/2 ||i +j == n -1+ (n-1)/2||
						
						i==j || i+j ==n-1
						|| i==0 || j==0 || i==n-1 || j==n-1)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	//letter capital Q
	public static void pp8() {
		
		
		int n=11;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i==n/4 && j>n/4 && j<(3*n)/4)||
						
						(i==(3*n)/4) && j>n/4 && j<(3*n)/4 || 
						(j==n/4 && i>n/4 && i<(3*n)/4) || 
						(j==(3*n)/4) && i>n/4 && i<(3*n)/4||
						(i==j) && i>n/2 && j>n/2)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	//diamond pattern
	public static void pp9() {
		

		int n=11;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if( i+j>=(n-1)/2 && j<=(n-1)/2 && i<=(n-1)/2||
						i-j<=(n-1)/2 && i>=(n-1)/2  && j<=(n-1)/2||
						j-i <=(n-1)/2 && j>=(n-1)/2 && i<=(n-1)/2
						|| i+j <= n-1 + (n-1)/2 && i>(n-1)/2 && j>(n-1)/2
						
					    )
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}

class Methods{
//BASIC METHOD EXAMPLE====take class outside and uncomment 
// 	class Calculator1
// {
// 	int a, b, c;
// 	void add()
// 	{
// 		a=10;
// 		b=20;
// 		c=a+b;
// 		System.out.println(c);
// 	}	
// }
// public class LaunchCalc1 {
// 	public static void main(String[] args) {
// 		Calculator1 calc=new Calculator1();		
// 		calc.add();
// 	}
// }
//====================================

	//4 ways in methods

// No input and no return type(output)

// Inputs and no return [argument(passer) vs parameter(taker)]

// No input and returning

// Input and returning


// //performing activity by taking input
// //stack frame life is as long as the methods records present in it.
	//method overriding 

}

class MethodOverridingConcept extends Methods{
}

class NamingConventionsFollowedInJava{
	
// Conventions followed by java developers while writing a class is 
// a. className should be in "PascalConvention".
// eg: 
// BufferedReader,FileReader,InputStream,OutputStream,String,...
// b. variables are represented in "camelCase".
// eg: regNo,firstName,lastName,length,javaFullStack
// c. methods are represented in "camelCase".
// eg: toUpper(),toLower(),toString(),nextInt(),.....
// eg#1.
// //Blue print of Student Object
// class Student{//Student -> PascalConvention
// //HAS-Part ----> camelCaseConvention
// int sid;
// String name;
// int age;
// char gender;
// String address;
// //Does-Part ----> camelCaseConvention
// void play(){}
// void study(){}
// void drink(){}
// void sleep(){}
}

class ArrayIMPconcept{}

class StringIMPconcept{}

class AccessModifiers{}

class OOPs{
	// OOPS
	// --------
	// It stands for Object Orientation Principles.
	//   Object -> real time instance or an entity.
	// eg: Car,Student,Employee
	//   Every object in realtime will have 2 parts
	// what it has
	// what it does

	// OOPs
	// -------
	//  It is actually theory concept,which is implemented by many programming language 
	// like c++,java,python,...
	//  Any real time problem can be solved if we follow oop's principle.
	//  In OOP's, while solving the problem 
	// 1. We need to first mark the Objects.
	// 	   2. Every Object we mark should have 2 parts
	// a. HAS-Part/fields/attributes (store the information as 
	// variables)
	// b. Does-Part/behaviours(represent them as methods)
	// 3. To represent an Object, first we need 2 have a blueprint of an Object.
	// 4. we use "new" keyword/reserve word to create an Object for a 
	// blueprint(class).
	// 5. Every Object should always be in constant interaction
	// 6. Useless Object doesn't exists.
	//  What is Object?
	// Physical existense of any element we say as Object.
	// eg: book,Car,Computer,Dog,Student,......
	//  What is Has-Part and What is Does-part of an object represents?
	// 	 HAS-Part => indicates what it can hold
	// 	 Does-Part =>indicates what it can do
	// eg:   Student
	// |=> sid, 
	// name,age,gender,email,address(variables/identifiers)
	// |=> play,study,drink,sleep(methods)
}

class FunctionalInterface{}

class LamdbaExpression{
//can be written is there functional interface only
//()->
}

class ExceptionHandling{

}

class MultiThreading{

}

class CollectionFrameWork{

}

class MapConcept{

}

class StreamAPIConcept{}

class Generics{}

class FileHandling{}

class StreamAPI{

// import java.util.*;
// import java.util.stream.*;
// //Comparable(Predefined API for natural sorting order) -> compareTo(Object obj) 
// //Comparator(for userdefined class for customized sorting order)-> 
// compare(Obj1,Obj2)
// public class Test {
// public static void main(String[] args){
// ArrayList<Integer> al =new ArrayList<Integer>();
// al.add(10);
// al.add(0);
// al.add(15);
// al.add(5);
// al.add(20);
// System.out.println("Before sorting :: "+al);
// //using stream api
// List<Integer> resultList= 
// al.stream().sorted().collect(Collectors.toList());
// System.out.println("After sorting  :: "+resultList);
// List<Integer> customizedResult = al.stream().sorted((i1,i2)-
// >i2.compareTo(i1)).collect(Collectors.toList());
// System.out.println("After sorting  :: "+customizedResult);
// }
// }


}

class MethodReferenceAndConstructorReference{
	//methodReference available from jdk 1.8
	//method reference is easier than lambda expression
	
	
}

class DateTimeAPI{}


class INTERVIEW_NOTES{
	// int Integer = 10;
	// System.out.println(Integer);//10
}
//EXTRA


//features of java
//1.Simple
//2.Secure
//3.Robust
//4.Platform Independent
//5.Portable
//6.Multithreaded
//7.Distributed
/* 
1. Simple : similar syntax like c++
2. Object-Oriented : real world modeling
3. Platform Independent =Java source code is compiled to bytecode and this bytecode is not bound to any platform. In fact, this bytecode is only understandable by the JVM

4. Portable WORA (Write Once Run Anywhere) JVM and bytecode

5. Robust : 2 reasons behind this ,capable of handling unexpected termination of a program using {Exception Handling}.Java is strong lies in its memory management features.Java is strong lies in its memory management features.{GC}

6. Secure
Security problems like virus threats, tampering, eavesdropping, and impersonation can be handled or minimized using Java. Encryption and Decryption feature to secure your data from eavesdropping and tampering over the internet. 
java bytecode is also a text file (yes .class file also a text file with non-human-readable format). Even if somebody tries to add virus code in a bytecode file, then also we are safe, because our JVM is smart enough to distinguish viruses from normal programs. If a virus is found in a bytecode file, JVM will throw an exception and abort execution.

7. Interpreted
Java programming language uses both a compiler and an interpreter. Java programs are compiled to generate bytecode files then JVM interprets the bytecode file during execution. Along with this JVM also uses a JIT compiler (it increases the speed of execution)

8. Multi-Threaded
Thread is a lightweight and independent subprocess of a running program (i.e, process) that shares resources. And when multiple threads run simultaneously is called multithreading. In many applications, you have seen multiple tasks running simultaneously, for example, Google Docs where while typing text, the spell check and autocorrect tasks are running. 

The server also uses multithreading to provide its services to multiple client requests. In Java, you can create threads in two ways, either by implementing the Runnable interface or by extending the Thread class. 

https://www.interviewbit.com/blog/features-of-java/

Simple:
Easy to learn and use:
 
Secure:
Robust security features: 
Java incorporates mechanisms like:
Type checking: Ensures data integrity and prevents unauthorized access.
Garbage collection:
Security manager:
Portable: Write once, run anywhere (WORA): (without any modification)
Object-Oriented:(RW model) promoting code reusability, modularity, and maintainability.
		Encapsulation: Data and behavior are bundled within objects, protecting data integrity and promoting code organization.
		
		Inheritance: Classes can inherit properties and methods from parent classes, enabling code reuse and extensibility.
		
		Polymorphism: Objects can be treated as their common superclass, allowing for flexible and adaptable code.
		Robust:
		
		Abstraction:

Built-in error handling: Java incorporates exception handling mechanisms to gracefully manage errors and prevent program crashes.
Memory management: Garbage collection automatically handles memory allocation and deallocation, reducing memory-related errors.
Type safety: Strong typing helps prevent common programming mistakes and ensures data integrity.
Architecture-Neutral (Platform-Independent):

JVM enables portability: The Java Virtual Machine (JVM) abstracts away the underlying hardware and operating system, allowing Java code to run consistently across diverse platforms.
Multithreaded:

Concurrent execution: Java supports multithreading, enabling programs to handle multiple tasks simultaneously, enhancing responsiveness and performance in applications like web servers and games.
Interpreted:

Bytecode execution: Java code is first compiled into bytecode, which is then interpreted by the JVM during runtime, providing platform independence and security.
High Performance:

Optimized bytecode: The JVM's Just-In-Time (JIT) compiler can optimize bytecode during execution, improving performance significantly.
Distributed:

Network applications: Java's networking capabilities enable the development of distributed systems and web applications that can span multiple machines and platforms.
Dynamic:

Class loading at runtime: Classes can be loaded and unloaded as needed, allowing for flexible and adaptable applications.
Reflection: Java allows inspection of classes and objects at runtime, enabling dynamic code modification and adaptation.
*/

//diff main method signatures
//	public static void main(String[] args) {
//	static public void main(String[] args) {
//	public static void main(String[] harry) {
//	public static void main(String[] ...args) {
//	public static void main(String...args) {
//	public static void main(String... args) {
//	final public static void main(String args[]) {

