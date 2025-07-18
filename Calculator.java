import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=sc.nextInt();
        System.out.println("Please enter another number");
        int num2=sc.nextInt();
        cal(num1,num2);
    }

    private static void cal(int num1, int num2) {
        System.out.println("Please enter the operation you want to do");
        Scanner sc=new Scanner(System.in);
        String op=sc.nextLine();
        int result=switch (op){
            case "+" ->num1+num2;
            case "-" ->num1-num2;
            case "*" ->num1*num2;
            case "/" ->num1/num2;
            case "%" ->num1%num2;
            default -> {
                System.out.println("Invalid Operator");
                yield -1;
            }
        };
        System.out.println("The result of " + num1 + " " + op + " " + num2 + " is " + result);
    }
}
