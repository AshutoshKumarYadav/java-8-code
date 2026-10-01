package PracticeJava.MultiThreading;

public class AlternateThreadPrint {

	//Thread A : 1
	//Thread B : 2
	//Thread A : 3
	//Thread B : 4

	private static final Object lock = new Object();
	private static int count = 1;
	private static final int MAX = 4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread ThreadA = new Thread(
				()-> {
					while(count<=MAX) {
						synchronized(lock) {
							if(count%2 !=0) {
								System.out.println("Thread A: "+count);
								count++;
								lock.notify();
							}else {
								try {
									lock.wait();
								}catch(InterruptedException  e) {
									Thread.currentThread().interrupt();
								}
							}
						}
					}
				});
		Thread ThreadB = new Thread(
				()->{
					while(count<=MAX) {
						synchronized(lock) {
							if(count%2 ==0) {
								System.out.println("Thread B: "+count);
								count++;
								lock.notify();
							}else {
								try {
									lock.wait();
								}catch(InterruptedException e) {
									Thread.currentThread().interrupt();
								}
								
							}
						}
						
					}
				});
		ThreadA.start();
		ThreadB.start();
	}

}






















