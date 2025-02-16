public class Person {
    private String firstName;
    private String lastName;
    private Address home;

// Constructor to make a Person object.
    public Person(String firstName, String lastName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }

// Displays the person as s string
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + home;
    }
}
