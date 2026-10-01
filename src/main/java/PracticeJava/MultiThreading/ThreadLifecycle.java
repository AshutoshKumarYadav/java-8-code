package PracticeJava.MultiThreading;

public class ThreadLifecycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LifeOfThread lt = new LifeOfThread();
		System.out.println("State before start : "+lt.getState());
		lt.start();
		System.out.println("State after start : "+lt.getState());
	}

}
 class LifeOfThread extends Thread{
	 public void run() {
		 try {
			 Thread.sleep(2000);
			 System.out.println(" Thread is running ");
		 }catch(InterruptedException  e) {
			 e.printStackTrace();
		 }
	 }
	 
 }