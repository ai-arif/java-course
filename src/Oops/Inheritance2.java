package Oops;

class Account{
    private String accountNo;
    private String name;
    private String address;
    private String phoneNo;
    private String dob;
    protected long balance;

    public Account(String accountNo, String name, String address, String phoneNo, String dob){
        this.accountNo = accountNo;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dob = dob;
        balance = 0;
    }

    public String getAccountNo(){
        return accountNo;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhoneNo(){
        return phoneNo;
    }

    public String getDob(){
        return dob;
    }

    public long getBalance(){
        return balance;
    }

    public void setAccountNo(String accountNo){
        this.accountNo = accountNo;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPhoneNo(String phoneNumber){
        phoneNo = phoneNumber;
    }

    public void setDob(String dob){
        this.dob = dob;
    }

    public void setBalance(long balance){
        this.balance = balance;
    }
}

class SavingsAccount extends Account{
    public SavingsAccount(String accountNo, String name, String address, String phoneNo, String dob) {
        super(accountNo, name, address, phoneNo, dob);
    }

    public void deposit(long amount){
        balance += amount;
    }

    public void withdraw(long amount){
        balance -= amount;
    }
}

class loanAccont extends Account{

    public loanAccont(String accountNo, String name, String address, String phoneNo, String dob) {
        super(accountNo, name, address, phoneNo, dob);
    }

    public void payEMI(long amount){
        balance -= amount;
    }

    public void repay(long amount){
        if(balance == amount){
            balance = 0;
        }
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("12354", "AI", "BAU", "012", "12");
        System.out.println(s.getName());
    }
}
