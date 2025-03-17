class Client {
    private String name;
    private double balance;

    public Client(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public void deposit() {

    }
    public void withdrawl() {

    }
    public void printClientData(Client c) {
        System.out.println("Name: %s%nBalance:%2.f%n", c.name, c.balance);
    }
}

class Bank(){
    public static void main(String[] args) {
        Client c1 = new Client("Jandira Silva", 2500);
        Client c2 = new Client("Sandra Rodrigues", 1800);
        Client c3 = new Client ("Luciana Teixeira", 5000);

        printClientData(c1);
    }
}
