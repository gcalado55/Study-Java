package Application;

import Models.Entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Progam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Student> setStudent = new HashSet<>();

        System.out.print("How many students for course A? ");
        int numberOfStudents = sc.nextInt();
        System.out.println("Students codes: ");
        for (int i = 0; i < numberOfStudents ; i++) {
            setStudent .add(new Student(sc.nextInt()));
        }

        System.out.print("How many students for course B? ");
        numberOfStudents = sc.nextInt();
        System.out.println("Students codes: ");
        for (int i = 0; i < numberOfStudents ; i++) {
            setStudent .add(new Student(sc.nextInt()));
        }

        System.out.print("How many students for course C? ");
        numberOfStudents = sc.nextInt();
        System.out.println("Students codes: ");
        for (int i = 0; i < numberOfStudents ; i++) {
            setStudent .add(new Student(sc.nextInt()));
        }

        System.out.println("Total students: " + setStudent.size());

    }
}