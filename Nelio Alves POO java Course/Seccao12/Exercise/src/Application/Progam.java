package Application;
import Models.Entities.Contract;
import Models.Entities.Installment;
import Services.ContractService;
import Services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Progam {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter contract data: ");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        System.out.print("Date (dd/MM/yyy): ");
        LocalDate date = LocalDate.parse(sc.next(),fmt);
        System.out.print("Contract value: ");
        Double totallValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totallValue);

        System.out.print("Enter the quota number: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, n);

        for (Installment i: contract.getInstallments()){
            System.out.println(i);
        }



        sc.close();
    }
}