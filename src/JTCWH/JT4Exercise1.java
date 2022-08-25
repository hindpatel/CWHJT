package JTCWH;
import java.util.Scanner;
public class JT4Exercise1 {

    public static void main(String[] args) {

        Scanner student = new Scanner(System.in);

        System.out.print("The name of the student is: ");
        String studentName = student.nextLine();

        System.out.print("The marks in Subject 1 out of 100 is: ");
        int subject1 = student.nextInt();

        System.out.print("The marks in Subject 2 out of 100 is: ");
        int subject2 = student.nextInt();

        System.out.print("The marks in Subject 3 out of 100 is: ");
        int subject3 = student.nextInt();

        System.out.print("The marks in Subject 4 out of 100 is: ");
        int subject4 = student.nextInt();

        System.out.print("The marks in Subject 5 out of 100 is: ");
        int subject5 = student.nextInt();

        int percentage = ((subject1 + subject2 + subject3 + subject4 + subject5) * 100) / 500;

        System.out.println("The calculated percentage of " + studentName + " is " + percentage + "%.");

    }
}
