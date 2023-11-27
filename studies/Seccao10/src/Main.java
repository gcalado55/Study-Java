import Entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp;
        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int numberOfEmployees = sc.nextInt();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("\nEmployee #" + (i+1) + ": ");
            System.out.print("Id: ");
            Integer id = sc.nextInt();

            while (hasId(employees, id)){
                System.out.print("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        System.out.print("\n Enter the employee that will recieve a salary increase: ");
        int id = sc.nextInt();
        Employee emp = employees.stream().filter(test -> test.getId() == id).findFirst().orElse(null);
        if (emp == null){
            System.out.println("This id does not exist!!!");
        }
        else{
            System.out.print("Enter the percentage: ");
            Double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println("List of employees:");
        for (Employee employee: employees){
            System.out.println(employee);
        }



        sc.close();
    }

    public static boolean hasId(List<Employee> employees, Integer id){
        Employee emp = employees.stream().filter(test -> test.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}