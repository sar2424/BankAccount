
public class MainClass
{
    public static void main(String[] args)
    {
        BankAccount harryChecking = new BankAccount();
        
        harryChecking.deposit(500);
        harryChecking.withdraw(300);
        
        System.out.println(harryChecking.getBalance());
        
    }
}

