package multiThreading;

class MyThread1 implements Runnable
{
	public void run()
	{

		for(int i=0;i<5;i++)
		{
			System.out.println("\n"+Thread.currentThread().getName()+"="+i);
			for(int j=0;j<5;j++)
			{
				System.out.print(" "+"run()inMT");
			}
			System.out.println();
		}
	}
}

public class RunnableRunForThreading {

	public static void main(String[] args) {
		MyThread1 mt = new MyThread1();
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
