package $coreJavaAllConcepts;

//DriverCode
public class DriverCode{
	public static void main(String args[]) {
		System.out.println("welcome to entire core java");
		Variables v = new Variables();
		System.out.println("main method");
		

	}
}

//examples , examples works for oops concepts
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
class PrimitiveDataTypes
{//instance variables
	//1byte, -128 to 127 , 0
	byte b = 23;
	byte bc = 'a';
	byte bc2 = 'z';

	//2bytes,  , 0
	short s = 2343;
	short sc = 'A';
	short sc1 = '$';

	//4bytes, , 0
	int i = 97;
	int ic = '^';
	
	//8bytes, , 0
	long l = 123456789123456789l;
	long lc = 's';

	//4bytes,  , 0.0 , IEEE
	float f = 12.123456789123456789f;
	float fc = 'a';
	float fi =12f;
	float fl = lc;
	float fl2 = l;

	//8bytes,  ,0.0 
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

}

class Operators{

}

class Literals{

}

class Conditionals{

}

class Loops{

}

class Methods{
	//4 ways in methods

// No input and no return type(output)

// Inputs and no return [argument(passer) vs parameter(taker)]

// No input and returning

// Input and returning


// //performing activity by taking input
// //stack frame life is as long as the methods records present in it.
	//method overriding 

}

class Method1 extends Methods{

}

class ArrayIMPconcept{}

class StringIMPconcept{}

//is below class possible?
// class Object{
// }

class OOPs{

}

class ExceptionHandling{

}

class MultiThreading{

}

class CollectionFrameWork{

}

class MapConcept{}

class Generics{}

class FileHandling{}

class StreamAPI{}

class DateTimeAPI{}



//EXTRA


//features of java
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

