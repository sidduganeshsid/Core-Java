package multiThreading;
//2 ways multithreading can be achieved [extends Thread, implements Runnable]
class Child extends Thread
{
	public void run()
	{
//		super.run();
//		super.start();
		for(int i=0;i<10;i++)
		{

			for(int j=0;j<10;j++)
			{
				System.out.print(" "+"Child");
			}
			System.out.println();
		}
	}
}

public class MainChildThreadForCpuTime {

	public static void main(String[] args) {
		Child c = new Child();
		c.start();
		//two threads started execution
		for(int i=0;i<10;i++)
		{
			
			for(int j=0;j<10;j++)
			{
				System.out.print(" "+"Main");
			}
			System.out.println();
		}
	}

}
