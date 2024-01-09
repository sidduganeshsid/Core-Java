package multiThreading;

class Lanka implements Runnable
{
	public void run()
	{
		for(int i=1;i<=435;i++)
		{
			System.out.println("Day "+i);
		}
		System.out.println("RAMA ARRIVED");
	}
}

public class Join {

	public static void main(String[] args) throws InterruptedException 
	{
		Lanka l = new Lanka();
		Thread t = new Thread(l);
		t.start();
		
		t.join();
		System.out.println("SITA JOINED WITH RAMA");
		
		
	}

}
