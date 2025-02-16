public class Address {
    private String street;
    private String city;
    private String postalCode;

// Constructor to initialize Address fields.
    public Address(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }


// Provides a string representation of the address.
    @Override
    public String toString() {
        return street + ", " + city + ", " + postalCode;
    }
}
