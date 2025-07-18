import java.util.*;
public class Switching {
    public static void main(String[] args) {
        System.out.println("A switch Program");
        Scanner sc = new Scanner(System.in);
        int month=sc.nextInt();
        int m=switch (month){
            case 1->1;
            case 2->2;
            case 3->3;
            case 4->4;
            case 5->5;
            case 6->6;
            case 7->7;
            case 8->8;
            case 9->9;
            case 10->10;
            case 11->11;
            case 12->12;
            default ->{
                System.out.println("Invalid Input");
                yield -1;
            }
        };
        System.out.println("You printed "+ m);
    }
}
