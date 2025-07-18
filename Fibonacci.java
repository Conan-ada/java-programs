import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci series");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num =sc.nextInt();
        fibonacci(num);
    }

    private static void fibonacci(int num) {
        int num1=0;
        int num2=1;
        int num3;
        System.out.println("Fibonacci Series");
        System.out.println(num1);
        System.out.println(num2);
        int i=3;
        while(i<=num){
            num3=num1+num2;
            System.out.println(num3);
            num1=num2;
            num2=num3;
            i++;
        }
    }
}
