class Account{
    String CustomerName;
    String AccountNumber;
    String Accounttype;
    double balance;

    Account(String name,String accNo,String accType,double bal){
        CustomerName=name;
        AccountNumber=accNo;
        Accounttype=accType;
        balance=bal;
    }
    void deposit(int amount){
        balance+=amount;
        System.out.println("Amount deposited:");
    }
    void displayBalance(){
        System.out.println("Current balance:"+balance);
    }
}
class SavingsAccount extends Account{
    SavingsAccount(String name,String accNo,double bal){
        super(name,accNo,"Savings",bal);
    }
    void computeInterest(double rate){
        double interest=balance*rate;
        balance+=interest;
        System.out.println("Interest added:"+interest);
    }
    void withdraw(double amount){
        if(amount<=balance){
        balance-=amount;
        System.out.println("Withdraw successfull:");
    }
    else{
        System.out.println("Insufficient balance.");
    }
  }
}
class currentAccount extends Account{
    final double min_balance=1000;
    final double service_charge=100;
    currentAccount(String name,String accNo,double bal){
        super(name,accNo,"Current",bal);
    }
    void CheckminimumBalance(){
        if(balance<min_balance){
            System.out.println("balance below minimum,service charge imposed");
            balance-=service_charge;
        }
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            CheckminimumBalance();
        }else{
            System.out.println("Insufficient balance:");
        }
    }
}

public class bank{
    public static void main(String args[]){
        SavingsAccount sacc=new SavingsAccount("akshata","b500",5000);
        currentAccount cacc=new currentAccount("krishna","6b44",400);

        System.out.println("--Savings Account--");
        sacc.deposit(1000);
        sacc.computeInterest(5);
        sacc.withdraw(2000);
        sacc.displayBalance();

        System.out.println("\n--Current Account--");
        cacc.withdraw(500);
        cacc.displayBalance();

    }
}