package Level_1_Task_03;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of grades: ");
        int numGrade = scanner.nextInt();

        double[] grades = new double[numGrade];

        for(int i = 0; i<numGrade; i++){
            System.out.print("Enter the grade" + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        double sum = 0;
        for(int i = 0; i<numGrade; i++){
            sum += grades[i];
        }

        double average = sum / numGrade;

        System.out.printf("The average grade is: %.2f%n", average);

    }
}
