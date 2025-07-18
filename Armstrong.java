import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Welcome to Armstrong Program");
        System.out.println("Enter your number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean armstrong = Armstrong(num);
        if(armstrong)
            System.out.println("Your number is an Armstrong number");
        else
            System.out.println("Your number is not an Armstrong number");
    }
    public static boolean Armstrong(int num){
        int n=num;
        int sum=0;
        int noOfdigits=totalDigits(num);
        while(num>0){
            int digit=num%10;
            sum+=pow(digit,noOfdigits);
            num/=10;
        }
        if (n==sum)
            return true;
        else
            return false;
    }
    public static int pow(int num1,int num2){
        int result=1;
        int i=0;
        while(i<num2){
            result*=num1;
            i++;
        }
        return result;
    }
    public static int totalDigits(int num){
        int digits=0;
        while(num>0){
            num=num/10;
            digits++;
        }
        return digits;
    }
}
