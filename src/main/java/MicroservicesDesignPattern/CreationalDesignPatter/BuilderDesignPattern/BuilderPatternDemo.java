package MicroservicesDesignPattern.CreationalDesignPatter.BuilderDesignPattern;
//To “Separate the construction of a complex object from its representation so that the same construction process can create different representations.” Builder pattern is used
//It helps in constructing a complex object step by step and the final step will return the object.
public class BuilderPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User.UserBuilder("Alice", "alice@example.com").setAge(25).setAddress("New york").build();
		User user2 = new User.UserBuilder("Bob", "bob@example.com")
                .setAge(30)
                .build();  // No address provided
		
		//display
		user1.showUser();
		user2.showUser();
	}

}
class User{
	private String name;
	private String email;
	private int age;
	private String address;
	
	private User(UserBuilder builder) {
		this.name=builder.name;
		this.email=builder.email;
		this.age=builder.age;
		this.address=builder.address;
	}
	//Display User info
	public void showUser() {
		System.out.println("User{name='" + name + "', email='" + email + "', age=" + age + ", address='" + address + "'}");
	}
	//Static Builder class
	public static class UserBuilder{
		private String name;
		private String email;
		private int age;
		private String address;
		
		// Builder constructor with required parameters
		public UserBuilder(String name,String email) {
			this.name=name;
			this.email=email;
		}
		
		// Optional parameter methods
		public UserBuilder setAge(int age) {
			this.age=age;
			return this;
		}
		
		public UserBuilder setAddress(String address) {
			this.address=address;
			return this;
		}
		
		// Build method to create User object
		public User build() {
			return new User(this);
		}
		
		
	}
}