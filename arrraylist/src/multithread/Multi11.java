package multithread;


public class Multi11 extends Thread{
	public void run() {
		System.out.println("run method");
		//System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("ashu");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());

		/*for(int i=0;i<5;i++) {
			System.out.println(i);
		}*/
	}
	public static void main(String[] args) {
		Multi11 r1=new Multi11();
		r1.start();
		/*for(int i=0;i<5;i++)
		{
			System.out.println(i+"main");
		}*/
		System.out.println("main method"+currentThread());
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(1);
		System.out.println(Thread.currentThread().getPriority());
	}
	
}
