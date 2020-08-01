import java.util.Scanner;
public class UCLN {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.print( gcd(a, b));


    }

    public static int gcd(int a, int b){
        if(b == 0) return a;
        if(a == 0) return b;
        if(b > a) return gcd(a, b%a);
        return gcd(b, a%b);
    }


}