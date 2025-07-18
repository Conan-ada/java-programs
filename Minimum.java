import java.util.*;
public class Minimum {
    public static void main(String[] args) {
        System.out.println("Checking minimum of two numbers");
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1= sc.nextInt();
//        System.out.println("Please enter another number");
//        int num2= sc.nextInt();
//        int ans=comp(num1,num2);
//        System.out.println("Minimum number is " + ans);
//        EvenOdd(num1);
//        int result=abs(num1);
//        System.out.println(result);
        grading(num1);
    }

    private static void grading(int num1) {
        System.out.println(num1>80?"High":(num1<80 && num1>50)?"Moderate":"Low");
    }

    private static int abs(int num1) {
        int result1=num1>0?num1:-(num1);
        return result1;
    }

    private static void EvenOdd(int num1) {
        System.out.println((num1%2==0)?"yes":"no");
    }


    private static int comp(int num1, int num2) {
        int result=num1<num2?num1:num2;
        return result;
    }
}
