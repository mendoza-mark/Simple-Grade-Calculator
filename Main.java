import java.util.Scanner;

public class Main {
    static double calculateAverage(double g1, double g2, double g3) {
        return (g1 + g2 + g3) / 3;
    }
    static double calculateAverage(double g1, double g2) {
        return (g1 + g2) / 2;
    }
    static void displayResult(String name, double average) {
        System.out.println("RESULTS");
        System.out.println("Student: " + name);
        System.out.println("Average: " + average);

        if (average >= 75) {
            System.out.println("Final Remark: PASSED");
        } else {
            System.out.println("Final Remark: FAILED");
        }
    }
    static void printLine(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("=");
        printLine(n - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        printLine(5);
        System.out.print(" SIMPLE GRADE CALCULATOR ");
        printLine(5);
        System.out.println();
        System.out.println();
        
        System.out.println("STUDENT INFORMATION");
        System.out.print("Enter student name: ");
        String name = input.nextLine();
        System.out.println();

        System.out.println("PLEASE ENTER THE STUDENT'S GRADE");
        System.out.print("Grade No.1: ");
        double g1 = input.nextDouble();

        System.out.print("Grade No.2: ");
        double g2 = input.nextDouble();

        System.out.print("Grade No.3: ");
        double g3 = input.nextDouble();
        System.out.println();

        double average = calculateAverage(g1, g2, g3);
        displayResult(name, average);

        double twoOnly = calculateAverage(g1, g2);
        System.out.print("Average of Grade No.1 and Grade No.2: " + twoOnly);

        input.close();
    }
}