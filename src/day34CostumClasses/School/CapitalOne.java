package day34CostumClasses.School;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount account1=new BankAccount();
        account1.setInfo("Ahmet",123456789);

        System.out.println(account1);

        account1.deposit(2000);
        account1.checkBalance();

        account1.withdraw(900);
        account1.checkBalance();

        account1.deposit(900);
        account1.checkBalance();

        System.out.println("-----------------------------------");

        BankAccount account2=new BankAccount();// todo each object has its own copy
        account2.setInfo("Aygun",987654321);

        account2.deposit(10000);

        account2.checkBalance();


    }
}
