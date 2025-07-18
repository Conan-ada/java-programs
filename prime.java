import java.util.*;
public class prime {
    public static void main(String[] args) {
        System.out.println("Find out if a number is prime number or not");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int a=sc.nextInt();
        boolean primeNo=primeNo(a);
        if(primeNo)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean primeNo(int a) {
        int i=2;
        while(i<a){
            if(a%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
