public class Money {
    private long dollars;
    private long cents;

// Constructor to initialize Money with a double value.
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - this.dollars) * 100);
    }

// Copy constructor to create a new Money object with the same values.
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

// Adds another Money object to this one and returns a new Money object.
    public Money add(Money otherAmount) {
        long totalCents = this.toCents() + otherAmount.toCents();
        return new Money(totalCents / 100.0);
    }

// Subtracts another Money object from this one and returns a new Money object.
    public Money subtract(Money otherAmount) {
        long totalCents = this.toCents() - otherAmount.toCents();
        return new Money(totalCents / 100.0);
    }

// Compares this Money object to another.
    public int compareTo(Money other) {
        return Long.compare(this.toCents(), other.toCents());
    }

// Checks if two Money objects are equal.
    public boolean equals(Object other) {
        if (other instanceof Money) {
            Money otherMoney = (Money) other;
            return this.dollars == otherMoney.dollars && this.cents == otherMoney.cents;
        }
        return false;
    }

// Converts Money object to a string format "$Dollars.Cents".
    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }

// Converts the Money object into total cents.
    private long toCents() {
        return dollars * 100 + cents;
    }
}
