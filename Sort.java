import java.util.*;
public class Sort {
    public static void main(String[] args) {
        System.out.println("A Program to check if an array is sorted or not");
        System.out.println("Enter the number of elements in array:");
        Scanner sc=new Scanner((System.in));
        int num=sc.nextInt();
        boolean isSorted=sorted(num);
        if(isSorted){
            System.out.println("Array is Sorted");
        }
        else
            System.out.println("Array is not Sorted");
    }

    private static boolean sorted(int num) {
        int i=1;
        int[] arr=new int[num];
        System.out.println("Enter the elements");
        Scanner sc=new Scanner(System.in);
        arr[0]=sc.nextInt();
        while(i<num){
            arr[i]=sc.nextInt();
            if(arr[i-1]>arr[i])
                return false;
            i++;
        }
        return true;
    }
}
