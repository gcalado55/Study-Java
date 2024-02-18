
import Entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        List<Product> productList = new ArrayList<>();

        System.out.print("Enter the file path: ");
        String sourceFilePath = sc.nextLine();

        File sourceFile = new File(sourceFilePath);
        String sourceFolderPath = sourceFile.getParent();

        boolean success = new File(sourceFolderPath + "\\out").mkdir();

        String targetFilePath = sourceFolderPath + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFilePath))) {
            String itemCsv = br.readLine();

            while (itemCsv != null) {

                String[] fields = itemCsv.split(",");
                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);
                Integer quantity = Integer.parseInt(fields[2]);

                productList.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFilePath))) {
                for (Product p :productList){
                    bw.write(p.getName() + "," + String.format("%.2f", p.total()));
                    bw.newLine();
                }

                System.out.println(targetFilePath + " CREATED!");

            }
            catch (IOException e){
                System.out.println("Error writing the file: " + e.getMessage());
            }
        }
        catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        sc.close();
    }
}

//metodo de leitura do arquivo (lembrar da String itemCsv) e do metodo readLine
//metodo para escrita lembrar do metodo new line