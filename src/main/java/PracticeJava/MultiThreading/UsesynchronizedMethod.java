package PracticeJava.MultiThreading;

public class UsesynchronizedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SharedResource shared = new SharedResource();
		//Thread t1 = new Thread(()->shared.printnumber(5));
		//Thread t2 = new Thread(()->shared.printnumber(10));
		//t1.start();
		//t2.start();
		BlockSyn syn = new BlockSyn();
		//syn.printNumbers(5);
		Thread t3 = new Thread(()->syn.printNumbers(5));
		t3.start();
	}

}

class SharedResource{
	//Ensures that only one thread executes printNumbers() at a time.
	synchronized void printnumber(int n) {
		for(int i=0;i<=5;i++) {
			System.out.println("Synchronized :"+n*i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class BlockSyn{
	//Locks only a specific block instead of the whole method.
	void printNumbers(int n){
		synchronized(this) {
			for(int i=0;i<=5;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}










