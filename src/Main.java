import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu (metre cinsinden) Giriniz : ");
        double boy = input.nextDouble(), vucutKitleIndeksi;
        System.out.println("Lütfen Kilonuzu Giriniz :");
        int kilo = input.nextInt();

        vucutKitleIndeksi = kilo /(boy * boy) ;

        System.out.println("Vücut Kitle İndeksiniz : " + vucutKitleIndeksi);

    }
}
