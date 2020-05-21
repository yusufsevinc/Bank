
import java.util.Date;
import java.util.Scanner;

public class Accont {
    


    public int queue = 0;
    private int id = 0;
    private double balance = 100;
    
    
    static Scanner input = new Scanner(System.in);
    public int arraySize = 3;
    private int[] arrayId = new int[arraySize];
    private double[] arrayBalance = new double[arraySize];
    private Date[] arrayDate = new Date[arraySize];
    

    private Date now = new Date();
    

    public Accont() {
    }

    public Accont(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public double getBalance() {
        
     
        
        return balance;
    }



    public void setBalance(double balance) {
        
        this.balance = balance;
    }

    public Date getNow() {
        return now;
        
    }

    public void setNow(Date now) {
        this.now = now;
    }
    



    

    public void createAccont() {

        System.out.println("Welcome to the Bank");
        arrayId[getId()] = getId();
        System.out.print("Entry balance: ");
        setBalance(input.nextDouble());
        arrayBalance[getId()] = getBalance();
        arrayDate[getId()] = getNow();
        System.out.println("Create Accont Date: " + arrayDate[getId()]);
        System.out.println("User ID: " + arrayId[getId()]);
        System.out.println("User Balance: " + arrayBalance[getId()]);
        queue++;
        setId(queue);

    }//end createAccont
  

    public int getArraySize() {
        return arraySize;
    }
    
    

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    public int[] getArrayId(int i) {
        
        return arrayId;
    }

    public void setArrayId(int[] arrayId) {
        this.arrayId = arrayId;
    }

    public double[] getArrayBalance(int i) {
        
        System.out.println("Actual balance: " + arrayBalance[i]);
        
        return arrayBalance;
    }
    public double[] getArrayBalance() {
        
        System.out.println("Actual balance: " + (arrayBalance[0] + arrayBalance[1] + arrayBalance[2]));
        
        return arrayBalance;
    }

    public void setArrayBalance(double[] arrayBalance) {
       
        this.arrayBalance = arrayBalance;
    }

    public Date[] getArrayDate(int i) {
        return arrayDate;
    }

    public void setArrayDate(Date[] arrayDate) {
        this.arrayDate = arrayDate;
    }

    




   public void withdrawMoney(int k) {
        
        balance = arrayBalance[k];
        System.out.println("How much money will you withdraw ?");
        double road = input.nextDouble();
        if (road > getBalance()) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= road;
            System.out.println("Transaction succesful.");
            System.out.println("Actual balance: " + balance);
            arrayBalance[k] = balance;

        }

    }//end withDrawMoney

    public void investMoney(int k) {
        balance = arrayBalance[k];
        
        System.out.println("How much money will you invest ?");
        double road = input.nextDouble();
        if (road <= 0) {
            System.out.println("Insufficient balance.");

        } else {
            balance += road;
            System.out.println("Transaction succesful.");
            System.out.println("Actuel balance: " + balance);
            arrayBalance[k] = balance;

        }
    }//end investMoney
    

}//end class
