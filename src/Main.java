import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kilo;
        double boy;
        double vucutKitle;

        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu Giriniz: ");
        kilo = input.nextInt();

        System.out.print("Boyunuzu Giriniz: ");
        boy = input.nextDouble();

        vucutKitle = kilo/(boy*boy);
        System.out.print("Vucut Kitle Endeksiniz: " + vucutKitle);




    }
}
