import java.util.*;
public class greater {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a+"-First number is greater.");
        }
        else if (a < b) {
            System.out.println(b+"-second number is greater.");
        }
        else{
            System.out.println("both numbers are equal");
        }
    }
    
}
