import java.util.*;
public class Deleting {
    public static void main(String[] args) {
        System.out.println("Deleting an element from the array");
        System.out.println("Enter the length of Array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pos=-1;
        int i;
        System.out.println("Enter the element you want to delete:");
        int num=sc.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]==num){
                pos=i;
                break;
            }
        }
        if(pos == -1)
            System.out.println("Element not found in Array");
        else{
            for(i=pos;i<n-1;i++)
                arr[i]=arr[i+1];
        }
        System.out.println("New Array:");
        for(i=0;i<n-1;i++){
            System.out.println(arr[i]);
        }
    }
}
