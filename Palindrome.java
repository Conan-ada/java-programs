import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome number");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check for palindrome:");
        int num =sc.nextInt();
        int rev_num = reverse(num);
        if(rev_num==num)
            System.out.println(num + " is a Palindrome number");
        else
            System.out.println(num + " is not a Palindrome number");
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
