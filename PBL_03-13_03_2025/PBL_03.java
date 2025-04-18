/* Date: 2025-03-13. */
class Client {
    private String name;
    private double balance;

    public Client(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0){
            this.balance += amount;
            System.out.println("Deposit of " + amount + " successful. \nNew balance: " + this.balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (this.balance >= amount && amount > 0) {
            this.balance -= amount;
            System.out.println("Withdraw of " + amount + " successful. \nNew balance: " + this.balance);
        } else {
            System.out.println("Invalid withdrawl amount or insufficient balance.");
        }
    }
    public void printClientData() {
        System.out.printf("Name: %s%nBalance: %.2f%n", this.name, this.balance);
    }
}

class Bank {
    public static void main(String[] args) {
        Client c1 = new Client("Jandira Silva", 2500);
        Client c2 = new Client("Sandra Rodrigues", 1800);
        Client c3 = new Client ("Luciana Teixeira", 5000);

        c1.printClientData();
        c2.printClientData();
        c3.printClientData();

        c1.withdraw(1000);
        c1.printClientData();

        c2.withdraw(2000);
        c2.deposit(500);
        c2.printClientData();

        c3.deposit(1000);
        c3.printClientData();
    }
}
