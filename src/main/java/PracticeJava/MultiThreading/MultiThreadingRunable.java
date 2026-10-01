package PracticeJava.MultiThreading;

public class MultiThreadingRunable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Mythreads());
		t1.start();
	}

}
class Mythreads implements Runnable{
	public void run() {
		System.out.println("Thread running "+Thread.currentThread().getName());
	}
}