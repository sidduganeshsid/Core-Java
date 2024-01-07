package classTemplate;

/**
 * java documentation
 * 
 * >javac Firstcode.java
 * >java First
 * 
 * >javadoc Firstcode.java
 */

class Test {
    //static variables
    
    //staic block
    
    //static methods
    
    //java block or instance block
    
    //objects creation can be possible
    Object obj = new Object();
    
    //instance variables // variables are 
    
    //instance methods //methods are behavious
    public void disp() {
    	System.out.println("instance method");
    }
    
    //constructor
    Test(){
    
    }
    
    //static class is possible only for inner classes  
    static class Test2{
    	Test2(){System.out.println("static Inner class constructor");}
    	
        public void disp()
        {
            System.out.println("It's static inner class");
            //class can be created inside methods also, but it is used only inside the method
        }
    }
    
    class Test3{
    	Test3(){System.out.println("Inner class constructor");}
    	
        public void disp()
        {
            System.out.println("It's inner class");
//            show();
        }
    }
    
    
}

public class Main {
    public static void main(String args[]){
        //static variables gets executed first and gets stored inside the heap area 
        //next static block gets gecuted
        // obj.show(); error 
        // obj.disp(); error
        Test.Test2 t = new Test.Test2();//works only if inner class is static
        t.disp();
        Test to = new Test();
        
        
        Test.Test3 t2;
        t2 = to.new Test3();//we need object outer class to create obj of inner class
        t2.disp();
        
        Integer i4 = Integer.valueOf("10");
    	Integer i5 = Integer.valueOf(10);
    	Integer i9 = Integer.valueOf("1010", 2);//binary
    	Integer i6 = Integer.valueOf("10", 8);//octal
    	Integer i8 = Integer.valueOf("AF", 16);//hexadecimal
    	System.out.println(i8+" "+i9+" "+i6);
    	//    	Integer i7  = Integer.reverseBytes(126);
//    	System.out.println(i7); //2113929216
    	
        WrapperClass c = new WrapperClass();
        System.out.println(c.c11.getClass().getSimpleName());
        System.out.println(c.c22);
        
        
        
        int a = 10;
        int b = 10;
        System.out.println(a==b);
        System.out.println();
        Integer x = 10;
        Integer y = 10;
        Integer z = new Integer(10);
        System.out.println(x==y);//compares ref of obj's
        System.out.println(x.equals(y));//compares content
        System.out.println(x.equals(a));
        System.out.println(x == a);
        System.out.println("++++++++++++++");
        Integer i = 1000;
        Integer j = 1000;
        System.out.println();
        
        }
}

interface IBank //naming convention starts with 'I'
{
	//by default : public static final
	float amount = 0f;
	
	//by default : public abstract
	float deposit();
	float checkBalance();
	float withdraw();
}

//a kind design technique practice
class AdapterClass implements IBank
{	
//	public float amount = 0f;
	//dumb implementation
	public float deposit() {return 0;}
	public float checkBalance() {return 0;}
	public float withdraw() { return 0;}
	
}


class WrapperClass
{
	//below are instance var's
	//wrapper classes contains the utility methods
	//toString in wrapper classes is overriden to print the vale
	Byte b;
	Short s;
	Integer i;
	Long l;
	Float f;
	Double d;
	Character c;
	Boolean bl;
	
//	i = new Integer(10); why error
	Integer i1 = new Integer(10);
	Integer i2 = new Integer("10");
//	Integer i3 = new Integer("Ten"); //Number format exception
	
	
	
	Float f1 = new Float(10.5);
	Float f2 = new Float("10.5");
	Float f3 = new Float("10.5f");
	
	//String input case is not imp, case insensitive
	Boolean b1 = new Boolean("true");
	Boolean b2 = new Boolean("truE");
	Boolean b3 = new Boolean("TRUE");
	Boolean b4 = new Boolean(true);
	
	Character c1 = new Character('a');
//	Character c2 = new Character("a");//error String can't be char
	//Wrapper classes are treated as the immutable
	
	
	//immutable class means changes won't reflect in existing obj, new obj is created and ref is changed.
	
	
	//can we create our own immutable class ? 
	
	 //wrapper utility methods
	//String/Primitive to wrapper obj
	Integer i11 = Integer.valueOf("10");
	Integer i22 = Integer.valueOf(10);
	Float f33 = Float.valueOf(102);
	
	
	//primitive to wrapper
	Character c11 = new Character('a');
	char c22 = c11.charValue();
	
	
	
}
