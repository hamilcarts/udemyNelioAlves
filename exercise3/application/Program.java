package exercise3.application;

import exercise3.entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter the student's name:");
        student.setNome(scan.nextLine());
        System.out.println("Enter the three notes:");
        student.setNote1(scan.nextDouble());
        student.setNote2(scan.nextDouble());
        student.setNote3(scan.nextDouble());
        student.finalNote();
        scan.close();
    }
}
