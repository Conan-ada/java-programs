import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // input using normal loop
        }
        System.out.println("Enter the element you want to check the count:");
        int count=sc.nextInt();
        int c=0;
        for(int num:arr){
            if(num==count)
                c++;
        }
        System.out.println(c + " times.");
    }
}

