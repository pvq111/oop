import java.util.Scanner;

public class Fibonacci {
    public static int Fibonacci(int t){
        if(t==0|| t== 1)return t;
        else return Fibonacci(t -1) + Fibonacci(t-2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(Fibonacci(n));
    }
} 