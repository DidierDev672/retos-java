package Five;

import java.util.ArrayList;
import java.util.List;

/*
 * Crea una clase `Banco` que tenga una lista de cuentas bancarias. Cada cuenta bancaria debe
 * tener atributos como titular, saldo, y un método para depositar y retirar dinero. Agrega un 
 * método para calcular el saldo total del banco.
 * Pasos:
 * 1. Define la clase CuentaBancaria con atributos titular y saldo.
 * 2. Agrega métodos para depositar y retirar dinero.
 * 3. Define la clase Banco con una lista de cuentas bancarias.
 * 4. Agrega un método para calcular el saldo total del banco.
 * 5. Crea instancias de CuentaBancaria y Banco, y realiza operaciones de depósito y retiro.
 */

class Bank {
    String id;
    List<BankAccount> bankAccount;

    public Bank(String id, List<BankAccount> bankAccount) {
        this.id = id;
        this.bankAccount = bankAccount;
    }

    void totalBalance() {
        int sum = 0;
        for (BankAccount bankAccount2 : bankAccount) {
            sum += bankAccount2.balance;
        }

        System.out.println("Saldo total del banco: " + sum);
    }

    @Override
    public String toString() {
        return "Bank{" +
                ", id='" + this.id + '\'' +
                ", bankAccount='" + this.bankAccount + '\'' +
                '}';
    }

}

class BankAccount {
    String headline;
    double balance;

    public BankAccount(String headline, double balance) {
        this.headline = headline;
        this.balance = balance;
    }

    void toDeposit(double deposit) {
        this.balance = (this.balance + deposit);
    }

    void toWithdraw(double withdraw) {
        this.balance = (this.balance - withdraw);
    }

    @Override
    public String toString() {
        return "Bank Account {" +
                "headline='" + this.headline + '\'' +
                ", balance='" + this.balance + '\'' +
                '}';
    }

}

public class Five {
    public static void main(String[] args) {
        List<BankAccount> bankAccounts = new ArrayList<>();

        BankAccount bankAccount = new BankAccount("Didier Arias", 280.000);
        bankAccount.toDeposit(700.000);
        bankAccounts.add(bankAccount);

        bankAccount.toWithdraw(10.000);

        Bank bank = new Bank("1038134311", bankAccounts);
        System.out.println(bank.toString());
        bank.totalBalance();
    }
}