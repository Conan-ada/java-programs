import java.util.*;
public class RevArray {
    public static void main(String[] args) {
        System.out.println("A Program to reverse an array.");
        System.out.println("Enter the number of elements in array:");
        Scanner sc=new Scanner((System.in));
        int num=sc.nextInt();
        reverse(num);
    }

    public static void reverse(int num) {
        int i=1;
        int[] arr=new int[num];
        System.out.println("Enter the elements");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int start = 0;
        int end = num - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(i=0;i<num;i++){
            System.out.println(arr[i]);
        }
    }
}

