public abstract class Money {

    protected int amount;
    private String currency;

    static Dollar dollar(int amount)  {
        return new Dollar(amount, "USD");
    }

    static Franc franc(int amount)  {
        return new Franc(amount, "CHF");
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    abstract Money times(int multiplier);

    String currency() {
        return currency;
    }

    public boolean equals(Object object)  {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

}
