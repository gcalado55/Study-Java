package Application;

import Models.Entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Progam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<LogEntry> setLog = new HashSet<>();
            String line = br.readLine();

            while (line != null){
                String[] fields = line.split(" ");
                setLog.add(new LogEntry(fields[0], Date.from(Instant.parse(fields[1]))));
                line = br.readLine();
            }
            System.out.println("Total users: " + setLog.size());
        }

        catch (IOException e){
            System.out.println(e.getMessage());
        }


    }

}