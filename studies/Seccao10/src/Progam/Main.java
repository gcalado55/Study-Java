package Progam;

import Models.Entities.Account;
import Models.Exceptions.BusinessExceptions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter account data ");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial Balance: ");
        Double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account account =  new Account(number, holder, balance, withdrawLimit);

        System.out.print("\nEnter amount for withdraw: ");
        Double amount = sc.nextDouble();

        try{
            account.withdraw(amount);
            System.out.printf("New balance: %.2f", account.getBalance());
        }
        catch (BusinessExceptions e){
            System.out.println("Withdraw error:  " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}