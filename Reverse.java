import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        System.out.println("Reverse a number");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to reverse:");
        int num =sc.nextInt();
        int rev_num = reverse(num);
        System.out.println("The Reverse of " + num + " is " + rev_num);
    }
    public static int reverse(int num){
        int num1=0;
        while(num>0){
            int r=num%10;
            num1=num1*10+r;
            num=num/10;
        }
        return num1;
    }
}
