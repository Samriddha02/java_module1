import java.util.*;
public class circle {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r=sc.nextInt();
        double pi=3.14;
        double area=pi*(r*r);
        System.out.println("the area of the circle is :- "+area);
    }
    
}
