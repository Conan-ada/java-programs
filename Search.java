import java.util.*;
public class Search {
    public static void main(String[] args) {
        boolean found=false;
        System.out.println("Find an Element");
        Scanner sc=new Scanner((System.in));
        System.out.println("Enter the number of rows in array:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns in array:");
        int cols=sc.nextInt();
        int[][] arr=new int[rows][cols];
        System.out.println("Enter the elements");
        int i=0;
        int j=0;
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the element you want to search");
        int findNo=sc.nextInt();
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                if(findNo==arr[i][j]){
                    found=true;
                    break;
                }
            }
            if(found){
                System.out.println("The element in array is found at: " + i + " and " + j);
                break;
            }
            else
                System.out.println("The element in array is not found");
            break;
        }
    }
}
