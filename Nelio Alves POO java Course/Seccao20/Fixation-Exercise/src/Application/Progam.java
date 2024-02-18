package Application;

import Models.Entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Progam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Employee> employeeList = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                employeeList.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            Double salary = sc.nextDouble();

            List<String> emails = employeeList.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(x -> x.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            Double sum = employeeList.stream()
                    .filter(e -> e.getName().charAt(0) == 'M')
                    .map(x -> x.getSalary())
                    .reduce(0.0, (x,y) -> x + y);

            System.out.println("\nEmail of people whose salary is more than 2000.00:");
            for(String s: emails){
                System.out.println(s);
            }
            System.out.println("\nSum of salary of people whose name starts with 'M': " + String.format("%.2f",sum));
        }
        catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }



        sc.close();
    }
}