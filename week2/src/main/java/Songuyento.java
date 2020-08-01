import java.util.Scanner;

public class Songuyento {
    public static void sieveEratosthenes(int n) {
        if (n <= 1) return;

        boolean[] sieveEratosthenes = new boolean[n+1];
        for (int i = 0; i < sieveEratosthenes.length; i++)
            sieveEratosthenes[i] = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = i * i; j <= n; j += i) {
                sieveEratosthenes[j] = false;
            }
        }

        for (int i = 2; i < sieveEratosthenes.length; i++)
            if (sieveEratosthenes[i])
                System.out.print(i + " ");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sieveEratosthenes(a);
    }

} 