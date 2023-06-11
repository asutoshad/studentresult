package assignmet;

import java.util.Scanner;

public class ExamResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] subjects = new String[5];
        String[] name = new String[2];
        int[][] marks = new int[2][5];

        for (int j = 0; j < 2; j++) {
            System.out.println("Student Name : ");
            name[j] = scanner.nextLine();

            for (int i = 0; i < 5; i++) {
                System.out.print("Enter the name of book " + (i + 1) + ": ");
                subjects[i] = scanner.nextLine();

                System.out.print("Enter the marks obtained in " + subjects[i] + ": ");
                marks[j][i] = scanner.nextInt();

                scanner.nextLine();
            }
        }

        System.out.println("\nEntered data:");

        for (int j = 0; j < 2; j++) {
            System.out.println("Student Name: " + name[j]);
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                System.out.println("Book: " + subjects[i] + ", Marks: " + marks[j][i]);
                sum += marks[j][i];
            }
            int totalMarks = sum;
            double percentage = (sum * 100) / 500.0;
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");
            if (percentage > 35){
                System.out.println("You passed, Congrats");
            }
            else
                System.out.println("You failed, Try again.");
            System.out.println();
        }

        scanner.close();
    }
}
