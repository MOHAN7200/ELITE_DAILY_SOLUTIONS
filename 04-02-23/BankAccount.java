//BankAccount




import java.io.*;
import java.util.*;

class BankAccount{
    private String name;
    private int accountNo;
    private static int balance;
    public BankAccount(int accountNo,String name){
        this.name = name;
        this.accountNo = accountNo;
    }
    public void deposit(int amt){
        balance+=amt;
    }
    public void withdraw(int amt){
        if(balance-amt<0)
            System.out.println("Negative Balance Transaction Cancelled");
        else
            balance-=amt;
    }
    public void display(){
        System.out.println(accountNo+" "+name+" "+balance);
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int acc = Integer.parseInt(in.nextLine());
        String name = in.nextLine();
        int n = Integer.parseInt(in.nextLine());
        BankAccount a = new BankAccount(acc,name);
        for(int i=0;i<n;i++){
            String[] pro = in.nextLine().split(" ");
            
            if(pro[0].equals("Deposit")){
                int mon = Integer.parseInt(pro[1]);
                a.deposit(mon);
            }
            else if(pro[0].equals("Withdraw")){
                int mon = Integer.parseInt(pro[1]);
                a.withdraw(mon);
            }
            else if(pro[0].equals("Display")){
                a.display();
            }
        }
        
    }
}