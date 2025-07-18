import java.util.*;
public class SumArray {
    public static void main(String[] args) {
        System.out.println("Calculate Sum and Average of Array");
        System.out.println("Enter the number of elements in array:");
        Scanner sc=new Scanner((System.in));
        int num=sc.nextInt();
        int sum=sum(num);
        System.out.println("The sum of all the elements in array is: " + sum);
        int avg=sum/num;
        System.out.println("The average of all the elements in array is: " + avg);
    }


    private static int sum(int num) {
        int i=0;
        int[] arr=new int[num];
        System.out.println("Enter the elements");
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(i<num){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            i++;
        }
        return sum;
    }
}
