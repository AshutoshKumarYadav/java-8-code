package PracticeJava.MultiThreading;

public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mythread = new MyThread();
		mythread.start();// Start the thread
	}

}
class MyThread extends Thread{
	public void run() {
		System.out.println("Thread is running : "+Thread.currentThread().getName());
	}
}
