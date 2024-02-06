public class CreditCard {

    private Person owner;
    private Money balance;
    private Money creditLimit;

    public CreditCard(Person owner, Money creditLimit) 
    {
        this.owner = owner;

        this.creditLimit = new Money(creditLimit);

        this.balance = new Money(0, 0);
    }

    public Money getBalance() 
    {
        return new Money(balance);
    }

    public Money getCreditLimit() 
    {
        Money availableCredit = creditLimit.subtract(balance);
        return new Money(availableCredit); 
    }

    public String getPersonals() 
    {
        return owner.toString();
    }

    public void charge(Money amount) 
    {
        Money potentialBalance = balance.add(amount);
        if (creditLimit.compareTo(potentialBalance) >= 0) 
        {
            balance = potentialBalance;
            System.out.println("Charge: " + amount);
        } else 
        {
            System.out.println("Exceeds credit limit");
        }
    }

    public void payment(Money amount) 
    {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
