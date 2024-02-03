package Application;

import Models.Entities.Election;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Progam {
    public static void main(String[] args) {

        Map<String, Integer> votesMap = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");

                if (votesMap.containsKey(fields[0])){
                    Integer votesSoFar = votesMap.get(fields[0]);
                    votesMap.put(fields[0], Integer.parseInt(fields[1]));
                }
                else{
                    votesMap.put(fields[0], Integer.parseInt(fields[1]));
                }
                line = br.readLine();
            }

            for (String key : votesMap.keySet()) {
                System.out.println(key + ": " + votesMap.get(key));
            }

        }
        catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}