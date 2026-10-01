package PracticeJava;
import java.io.Serializable;

public class Singleton implements Serializable {
	
	//volatile ensure that the changes across the thread instance
	private static volatile Singleton instance;
	
	private Singleton() {
		if(instance!=null) {
			throw new IllegalStateException("Instace already created");
			
			}
	}
	
	public static Singleton getInstance() {
		if(instance==null) {
			synchronized(Singleton.class){
				if(instance==null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	// Ensure the same instance is returned during deserialization
    protected Object readResolve() {
        return getInstance();
    }

    public void showMessage() {
        System.out.println("Singleton instance invoked!");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton single = new Singleton();
		single.showMessage();
	}

}


