package multiThreading;

class MyThread12 implements Runnable
{
	public void run()
	{

		for(int i=0;i<5;i++)
		{
			Thread.yield();
			System.out.println("\n"+Thread.currentThread().getName()+"="+i);
			for(int j=0;j<5;j++)
			{
				System.out.print(" "+"run()inMT");
			}
			System.out.println();
		}
	}
}

public class Yield {

	public static void main(String[] args) {
		MyThread12 mt = new MyThread12();
		Thread t = new Thread(mt);
		t.start();
		
		//name of thread
	System.out.println(t);
		for(int i=0;i<5;i++)
		{
			System.out.println("\n"+Thread.currentThread().getName()+"="+i);
			for(int j=0;j<5;j++)
			{
				System.out.print(" "+"mainT");
			}
			System.out.println();
		}
		
		
		
	}

}
