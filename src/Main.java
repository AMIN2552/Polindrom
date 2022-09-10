import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = a / 1000;
        int c = a % 10;
        int d = a / 100;
        int e = d % 10;
        int f = a % 100;
        int g = f / 10;

        if (b == c && e == g){
            System.out.println("YES");
        }else
            System.out.println("NO");

    }
}