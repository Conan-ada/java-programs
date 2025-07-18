import java.util.*;
public class Sum2Array {
    public static void main(String[] args) {
        System.out.println("Calculate Sum and Average of Array");
        Scanner sc=new Scanner((System.in));
        System.out.println("Enter the number of rows in array:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns in array:");
        int cols=sc.nextInt();
        int sum=0;
        int[][] arr=new int[rows][cols];
        System.out.println("Enter the elements");
        int i=0;
        int j=0;
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                sum+=arr[i][j];
            }
        }
        int totalno=i*j;
        System.out.println("The sum of all the elements in array is: " + sum);
        int avg=sum/totalno;
        System.out.println("The average of all the elements in array is: " + avg);
    }
}
