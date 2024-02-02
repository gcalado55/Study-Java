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
        int courseA = sc.nextInt();
        System.out.println("Students codes: ");
        for (int i = 0; i < courseA ; i++) {
            setStudent .add(new Student(sc.nextInt()));
        }

        System.out.print("How many students for course B? ");
        int courseB = sc.nextInt();
        System.out.println("Students codes: ");
        for (int i = 0; i < courseB ; i++) {
            setStudent .add(new Student(sc.nextInt()));
        }

        System.out.print("How many students for course C? ");
        int courseC = sc.nextInt();
        System.out.println("Students codes: ");
        for (int i = 0; i < courseC ; i++) {
            setStudent .add(new Student(sc.nextInt()));
        }

        System.out.println("Total students: " + setStudent.size());

    }
}