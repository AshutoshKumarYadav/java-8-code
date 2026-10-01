package PracticeJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerilizationExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String FILE_NAME = "person_data.ser"; // File to store the serialized object
		// Step 2: Create a Person Object
		Person person = new Person("Alice",25,"mypassword123");
		// Step 3: Serialize the Object to a File
		serializeToFile(person,FILE_NAME);
		// Step 4: Deserialize the Object from the File
		Person deserializedPerson = deserializeFromFile(FILE_NAME);
	}
	// Method to deserialize object from file
	private static Person deserializeFromFile(String fileName) {
		// TODO Auto-generated method stub
		
		try {
			ObjectInputStream  in = new ObjectInputStream(new FileInputStream(fileName));
			System.out.println("Deserialization Successful! Reading object from: " + fileName);
			return (Person) in.readObject();
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	// Method to serialize object to file
	private static void serializeToFile(Person person, String fileName) {
		// TODO Auto-generated method stub
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
			out.writeObject(person);
			System.out.println("Serialization Successful! Object saved to: " + fileName);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}

//Step 1: Create a Serializable Class
class Person implements Serializable {
	private static final long serialVersionUID = 1L;// Ensures compatibility
	
	private String name;
	private int age;
	private transient String password;// Won't be serialized
	
	public Person(String name,int age, String password) {
		this.name=name;
		this.age=age;
		this.password=password;
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
	
	
}
