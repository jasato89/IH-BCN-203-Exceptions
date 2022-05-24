import java.util.Objects;

public class Account {

    private String name;
    private String address;
    private double balance;
    private String accountNumber;

    public Account(String name, String address, double balance, String accountNumber) {
        this.name = name;
        this.address = address;
        setBalance(balance);
        this.accountNumber = accountNumber;
    }

    public Account() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance no puede ser inferior a 0");
        } else {
            this.balance = balance;

        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getAccountNumber() +getAddress() + getName() + getBalance());
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null) return false;
        Account account = (Account) obj;
        if (getName().equals(account.getName()) && getAccountNumber().equals(account.getAccountNumber())) return true;
        return false;
    }

    @Override
    protected Account clone()  {
        System.out.println("Se procede a realizar un clone");
        System.out.println("Se procede a realizar un clone");
        return new Account(getName(), getAddress(), getBalance(), getAccountNumber());
    }

    @Override
    public String toString() {
        String result = "Account: {Name :  " + name + "}, Address: " + address;
        return result;
    }
}
