import java.util.*;
public class gcd {
    public static void main(String[] args) {
        System.out.println("Find out GCD");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter one number");
        int a=sc.nextInt();
        System.out.println("Enter another number");
        int b=sc.nextInt();
        int gcd=gcd(a,b);
        System.out.println("GCD is " + gcd);
    }

    private static int gcd(int a, int b) {
        int gcd=1;
        int least=least(a,b);
        for(int i=least;i>=2;i--){
            if(a%i==0 && b%i==0){
                gcd=i;
                break;
            }
        }
        return gcd;
    }
    public static int least(int a,int b){
        if(a<b)
            return a;
        else
            return b;
    }
}
