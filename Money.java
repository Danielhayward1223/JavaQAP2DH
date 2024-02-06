public class Money{
    private long dollars;
    private long cents;

    public Money(long dollars, long cents) 
    {
        this.dollars = dollars;
        this.cents = cents;
        addDollar();
    }

    public Money(double amount) 
    {
        this.dollars = (long) amount;
        this.cents = (long) Math.round((amount - dollars) * 100);
        addDollar();
    }

    public Money(Money other) 
    {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    private void addDollar() 
    {
        while (cents >= 100) 
        {
            dollars++;
            cents -= 100;
        }
    }

    public Money add(Money other) 
    {
        long newCents = this.cents + other.cents;
        long newDollars = this.dollars + other.dollars;

        Money result = new Money(newDollars, newCents);
        result.addDollar();
        return result;
    }

    public Money subtract(Money other) 
    {
        long totalCentsThis = this.dollars * 100 + this.cents;
        long totalCentsOther = other.dollars * 100 + other.cents;
        if (totalCentsThis < totalCentsOther) 
        {
            System.out.println("Not enough funds to subtract");
        }

        long newCents = totalCentsThis - totalCentsOther;
        Money result = new Money(newCents / 100, newCents % 100);
        return result; 
    }

    public int compareTo(Money other) 
    {
        if (this.dollars > other.dollars) return 1;
        if (this.dollars < other.dollars) return -1;
        if (this.cents > other.cents) return 1;
        if (this.cents < other.cents) return -1;
        return 0;
    }

    public boolean equals(Object obj) 
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Money money = (Money) obj;

        return dollars == money.dollars && cents == money.cents;
    }

    public String toString() 
    {
        return String.format("$%d.%02d", dollars, cents);
    }
}