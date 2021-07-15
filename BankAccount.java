
public class BankAccount
{
    private double balance;
    
public BankAccount()
{
    this.balance = 100;

    
}

    
public BankAccount(double initialBalance)
{
    this.balance = initialBalance;
}

public void deposit (double amount)
{
    this.balance = this.balance + amount;
    
}

public void withdraw (double amount)
{
    this.balance = this.balance - amount;
}

public double getBalance()
{
    return this.balance;
}
}