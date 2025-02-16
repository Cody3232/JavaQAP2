public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

// Constructor to produce CreditCard giving the owner and a limit.
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit); 
        this.balance = new Money(0); 
    }

// Retrieves the personal details of the card owner.
    public String getPersonals() {
        return owner.toString();
    }

// Gives current balance.
    public Money getBalance() {
        return new Money(balance);
    }

// Retrieves credit limit.
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

// Charges an amount to the credit card if within the limit of the credit card.
    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount);
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

// Processes a payment.
    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
