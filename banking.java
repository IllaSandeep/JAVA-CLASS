import java.util.*;

class customer {
    String cust_id, cust_name, add;
    float bal;
    Scanner sc = new Scanner(System.in);

    public void get_custInfo() {
        System.out.println("Enter custid,name,balance, address");
        cust_id = sc.nextLine();
        cust_name = sc.nextLine();
        bal = sc.nextFloat();
        sc.nextLine();
        add = sc.nextLine();
    }

    public void show_cusInfo() {
        System.out.println("Customer Details are:");
        System.out.println("Id: " + cust_id);
        System.out.println("Name: " + cust_name);
        System.out.println("Balance: " + bal);
        System.out.println("Address: " + add);
    }
}

class Transaction extends customer {
    public void deposit(float amt) {
        System.out.println("AMOUNT DEPOSITED" + amt);
        bal += amt;
    }

    public void withdraw(float amt) {
        System.out.println("Amount Withdrawn" + amt);
        bal = bal - amt;
    }

    public void show_bal() {
        System.out.println("Available Balance" + bal);
    }
}

class Bank extends Transaction {
    static String bankname = "Canara Bank", ifsc = "CBN0003268";

    public void show_bankInfo() {
        System.out.println("Bank Name" + Bank.bankname);
        System.out.println("IFSC CODE:" + Bank.ifsc);
    }

    public static void main(String args[]) {
        Bank c1 = new Bank();
        c1.get_custInfo();
        c1.show_cusInfo();
        c1.deposit(1000);
        c1.show_bal();
        c1.withdraw(500);
        c1.show_bal();
    }
}