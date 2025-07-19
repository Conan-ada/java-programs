import java.util.*;
public class Maxnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // input using normal loop
        }
        int max=arr[0];
        for(int num:arr){
            if(num>max)
                max=num;
        }
        System.out.println(max);
    }
}
