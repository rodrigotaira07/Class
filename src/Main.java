public class Main {
    public static void main(String[] args) {

//        Account bobsAccount = new Account(1234,100.00,"Bob","bobo@gmail.com","424242424");
//        System.out.println(bobsAccount.getBalance());
//        System.out.println(bobsAccount.getEmail());
//        bobsAccount.deposit(111);
//        bobsAccount.withdraw(100);
//
//        Account tairaAccount = new Account("Taira","teste","12345");
//        System.out.println(tairaAccount.getNumber()+"    "+ tairaAccount.getPhoneNumber());

          VipCustomer p1 = new VipCustomer();
          System.out.println(p1.getName());
          System.out.println(p1.getCreditLimit());
          System.out.println(p1.getEmail());

          VipCustomer p2 = new VipCustomer("Taira",100);
          System.out.println(p2.getName());
          System.out.println(p2.getCreditLimit());
          System.out.println(p2.getEmail());

          VipCustomer p3 = new VipCustomer("Rodrigo",1000,"testeee");
          System.out.println(p3.getName());
          System.out.println(p3.getCreditLimit());
          System.out.println(p3.getEmail());
   }
}