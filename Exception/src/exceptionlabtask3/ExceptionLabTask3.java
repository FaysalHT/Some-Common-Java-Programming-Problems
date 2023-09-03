package exceptionlabtask3;

import java.util.Scanner;

class AgeOutOfRangeException extends Exception {
    public AgeOutOfRangeException(String message) {
        super(message);
    }
}

class LowGpaException extends Exception {
    public LowGpaException(String message) {
        super(message);
    }
}

public class ExceptionLabTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            if (age > 25) {
                throw new AgeOutOfRangeException("Age is greater than 25");
            }

            System.out.print("Enter your GPA: ");
            double gpa = scanner.nextDouble();
            if (gpa < 2.5) {
                throw new LowGpaException("GPA is less than 2.5");
            }

            System.out.println("Your application is accepted and is under study");
        } catch (AgeOutOfRangeException e) {
            System.out.println("Application rejected: " + e.getMessage());
        } catch (LowGpaException e) {
            System.out.println("Application rejected: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

