
import java.util.Scanner;

public class Atm {

    static Accont accont = new Accont();
    
    static Scanner input = new Scanner(System.in);
    static int user ;
    boolean run = true;

    public static void main(String[] args) {
        accont.createAccont();
        accont.createAccont();
        accont.createAccont();
        
        
        System.err.print("User Id entry: ");
        user = input.nextInt();
        Atm atm = new Atm();
        switch (user) {
            case 0:
                atm.transactions();
            case 1:
                atm.transactions();
            case 2:
                atm.transactions();
        }

    }//end main

    public void transactions() {
        
        while (run) {

            System.err.println("Welcome to the BANK.\n"
                    + "------------------------"
                    + "Start transaction;\n"
                    + "------------------------"
                    + "Press '1' to learn current balance.\n"
                    + "------------------------"
                    + "press '2' to invest money.\n"
                    + "------------------------"
                    + "Press '3' to withdraw money.\n"
                    + "------------------------"
                    + "Press '4' to exit.");
            int press = accont.input.nextInt();
            switch (press) {
                case 1:
                  accont.getArrayBalance(user);
                    break;

                case 2:
                    
                    accont.investMoney(user);
                    break;
                case 3:
                  
                    accont.withdrawMoney(user);
                    break;
                case 4:
                    
                    accont.getArrayBalance();
                    run = false;
                    break;
                   

            }//end switch

        }//end while
    }// end transactions

}// end class
