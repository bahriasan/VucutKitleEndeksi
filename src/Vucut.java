import java.util.Scanner;

public class Vucut {
    public static void main(String[] args) {
        double boy, kilo, endeks;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        endeks = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz: " + endeks);

    }
}
