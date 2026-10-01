package PracticeJava;
public final class ImmutablePerson {
    private final String name;
    private final int age;
    private final Address address;  // Mutable object

    public ImmutablePerson(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        // Defensive copy to prevent modifications from outside
        this.address = new Address(address.getStreet(), address.getCity());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        // Return a new Address object instead of the original reference
        return new Address(address.getStreet(), address.getCity());
    }

    @Override
    public String toString() {
        return "ImmutablePerson{name='" + name + "', age=" + age + ", address=" + address + "}";
    }
}

