import java.util.Scanner;

public class GradeEvaluationSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter mark: ");
        int mark = input.nextInt();

        System.out.println();
        System.out.println("Grade Report");
        System.out.println("------------");
        System.out.println("Student Name: " + name);
        System.out.println("Mark        : " + mark);

        if (mark < 0 || mark > 100) {
            System.out.println("Result      : Invalid mark");
        } else if (mark >= 80) {
            System.out.println("Grade       : A");
            System.out.println("Result      : Excellent");
        } else if (mark >= 70) {
            System.out.println("Grade       : B");
            System.out.println("Result      : Good");
        } else if (mark >= 60) {
            System.out.println("Grade       : C");
            System.out.println("Result      : Satisfactory");
        } else if (mark >= 50) {
            System.out.println("Grade       : D");
            System.out.println("Result      : Pass");
        } else {
            System.out.println("Grade       : F");
            System.out.println("Result      : Fail");
        }

        input.close();
    }
}
