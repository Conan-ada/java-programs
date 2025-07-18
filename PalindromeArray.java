import java.util.*;
public class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Checking Palindrome array.");
        System.out.println("Enter the number of elements in array:");
        Scanner sc=new Scanner((System.in));
        int num=sc.nextInt();
        int i=1;
        int[] arr=new int[num];
        System.out.println("Enter the elements");
        for(i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr2 = new int[num];
        for (i = 0; i < num; i++) {
            arr2[i] = arr[i];
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
        int x=0;
        for(i=0;i<num;i++){
            if(arr[i]!=arr2[i])
                x=1;
        }
        if(x==1)
            System.out.println("Not Palindrome");
        else System.out.println("Palindrome");
    }
}
