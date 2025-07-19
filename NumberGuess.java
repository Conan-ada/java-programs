import java.util.*;
public class NumberGuess {
    public static void main(String[] args) {
        System.out.println("Please enter a number between 1 and 1000");
        Scanner sc=new Scanner(System.in);
        Random rand = new Random();
        int randInt = rand.nextInt(1000);
        int num;
        do {
            num= sc.nextInt();
            if(num==randInt)
                System.out.println("Congrats!You guessed it right.");
            else if(num>randInt)
                System.out.println("Please enter a smaller number.");
            else
                System.out.println("Please enter a larger number");
        }while(num!=randInt);
    }
}
