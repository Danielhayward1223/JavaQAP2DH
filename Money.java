public class Money {
    private long dollars;
    private long cents;

    public Money(double amount) 
    {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - this.dollars) * 100);
    }

    public Money(Money otherObject) 
    {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money add(Money otherAmount) 
    {
        long newDollars = this.dollars + otherAmount.dollars;
        long newCents = this.cents + otherAmount.cents;

        if (newCents >= 100) 
        {
            newDollars += newCents / 100;
            newCents %= 100;
        }

        return new Money(newDollars + (double) newCents / 100);
    }

    public int subtract(Money otherAmount) 
    {
        double thisAmount = this.dollars + (double) this.cents / 100;
        double otherAmountValue = otherAmount.dollars + (double) otherAmount.cents / 100;

        double difference = thisAmount - otherAmountValue;

        if (difference > 0) 
        {
            return 1;
        } else if (difference < 0) 
        {
            return -1;
        } else 
        {
            return 0;
        }
    }

    public int compareTo(Money otherObject) 
    {
        double thisAmount = this.dollars + (double) this.cents / 100;
        double otherAmountValue = otherObject.dollars + (double) otherObject.cents / 100;

        if (thisAmount > otherAmountValue) 
        {
            return 1;
        } else if (thisAmount < otherAmountValue) 
        {
            return -1;
        } else 
        {
            return 0;
        }
    }

    public boolean equals(Money otherObject) 
    {
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    public String toString() 
    {
        return "$" + dollars + "." + cents;
    }
}
