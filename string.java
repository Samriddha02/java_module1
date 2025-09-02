import java.util.*;
public class string {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "hello";
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.length());
        System.out.println(a.charAt(3));
        if(a.equalsIgnoreCase(b))
        System.out.println("both are equal");
        else
        System.out.println("both are nor equal");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two strings");
        String s1= sc.next();
        String s2= sc.next();
        s1.toUpperCase();
        s2.toUpperCase();
        if(s1.equalsIgnoreCase(s2))
        System.out.println("both are equal");
        else
        System.out.println("both are not equal");



    }
}
