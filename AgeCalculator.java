import java.util.*;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your birth year:");
        int birthYear = sc.nextInt();

        
        int currentYear = 2025;

        int age = currentYear - birthYear;

        System.out.println("You are " + age + " years old.");

        
    }
}
