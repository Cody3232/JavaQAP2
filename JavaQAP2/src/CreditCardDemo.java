public class CreditCardDemo {
    public static void main(String[] args) {
// Define constant Money objects for testing (determines limit, and exceeds limit as the balance gets lower for testing/showing error message)
        final Money LIMIT = new Money(1000); 
        final Money FIRST_AMOUNT = new Money(200);
        final Money SECOND_AMOUNT = new Money(10.02);
        final Money THIRD_AMOUNT = new Money(25);
        final Money FOURTH_AMOUNT = new Money(990); 

// Create a Person with an Address
        Person owner = new Person("Cody", "Snow", new Address("123 Street DRive", "Big City", "A1B2C3"));

// Create a CreditCard with the owner and credit limit
        CreditCard visa = new CreditCard(owner, LIMIT);

// Print cardholder details and initial balance
        System.out.println(visa.getPersonals());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit: " + visa.getCreditLimit());
        System.out.println();

// Test charge transactions
        System.out.println("Attempt to charge " + FIRST_AMOUNT);
        visa.charge(FIRST_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("Attempt to charge " + SECOND_AMOUNT);
        visa.charge(SECOND_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());

// Test payment transaction
        System.out.println("Attempt to pay " + THIRD_AMOUNT);
        visa.payment(THIRD_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());

// Test exceeding credit limit
        System.out.println("Attempt to charge " + FOURTH_AMOUNT);
        visa.charge(FOURTH_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
    }
}
