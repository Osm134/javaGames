import java.util.Scanner;

//public class ATM {
   /// package PROJECTS;
import java.util.Scanner;

    public class ATM {
        public String name;
        private int pin;
        private int balance;

        public ATM(String name, int pin, int balance) {
            this.name = name;
            this.pin = pin;
            this.balance = balance;
        }

        // verify the pin
        public boolean verifypin(int mypin) {
            return mypin == pin;
        }

        // to acces the private values we use getmethod
        int getBalance() {
            //System.out.println("your acc balance" + );
            return balance;
        }

        void setBalance(int deposit) {
            balance += deposit;
        }

        public void checkbalance() {
            System.out.println("your sccount balance = " + balance);
        }

        public void depositmoney(int depmoney) {
            // System.out.println("your balance =" + balance);
            balance += depmoney;
            System.out.println("after deposit = " + balance);
        }

        public void withdraw(int amount) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("your account balance is loww");
            }
        }

        public static void main(String[] args) {

            ATM myatm = new ATM("srikanth", 9951, 1000);
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter your pin : ");
            int mypin1 = sc.nextInt();

            if (myatm.verifypin(mypin1)) {
                System.out.println("your are login to your account");
            }


            while (myatm.verifypin(mypin1)) {
                System.out.println("choose the above option to go next action");
                System.out.println("1.check balance ");
                System.out.println("2.deposit money ");
                System.out.println("3.withdraw money");
                System.out.println("4.exit");

                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        int ac = myatm.getBalance();
                        System.out.println(ac);
                        break;
                    case 2:
                        System.out.println("enter tour amount you wanted to add");
                        int depmoney1 = sc.nextInt();
                        myatm.setBalance(depmoney1);
                        System.out.println("sucess");
                        break;
                    case 3:
                        System.out.println("enter amount  to withdraw");
                        int withdraw1 = sc.nextInt();
                        myatm.withdraw(withdraw1);
                        System.out.println("sucess");
                        break;
                    case 4:
                        System.out.println("thank you for your visiting");
                        return;
                    default:
                        System.out.println("invald key ");

                }

            }
        }
    }



