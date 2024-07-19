import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        double c;

        Scanner Alan = new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz : ");
        a = Alan.nextInt();

        System.out.print("2.Kenarı Giriniz : ");
        b = Alan.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenüs : " + c);
    }
}