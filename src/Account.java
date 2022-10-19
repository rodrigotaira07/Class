import java.security.PublicKey;

public class Account {
        private int number;
        private double balance;
        private String name;
        private String email;
        private String phoneNumber;

    public Account(String name, String email, String phoneNumber) {
        this(43433,100.00,name,email,phoneNumber);
    }

    public Account(){
            this(43433,100.00,"Bob","teste","1224314");
            System.out.println("Construtor");
        }

        public Account(int number, double balance, String name, String email, String phoneNumber){
            this.number = number;
            this.balance = balance;
            this.name = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        public void deposit(double depositAmount){
            this.balance += depositAmount;
            System.out.println("Ok. New balance = " + this.balance);
        }

        public void withdraw(double withdrawAmount){
            if(balance-withdrawAmount>=0) {
                this.balance -= withdrawAmount;
                System.out.println("Ok. Remaining balance = " + this.balance);
            }
            else
                System.out.println("Saldo insuficiente. Seu saldo e " + balance);
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }


