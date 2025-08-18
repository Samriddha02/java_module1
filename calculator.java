import java.util.*;
public class calculator {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        int diff = a-b;
        int mul = a*b;
        int div = a/b;

        System.out.println("addition is - "+ sum);
        System.out.println("subtraction is - "+ diff);
        System.out.println("multiplication is - "+ mul);
        System.out.println("division is - "+ div);
    }
}
