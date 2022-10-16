import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // kiirjuk, hogy mi kell
        System.out.print("Kerek egy szamot : ");
        int i1 = sc.nextInt();
        System.out.print("Kerek meg egy szamot : ");
        int i2 = sc.nextInt();

        int iOsszeg = i1 + i2;
        System.out.println("ossz : " + iOsszeg);
        int iKulonbseg = i1 - i2;
        System.out.println("kulonb : " + iKulonbseg);
        int iSzorzat = i1 * i2;
        System.out.println("szorz : " + iSzorzat);
        int iHanyados = i1 / i2;
        System.out.println("hanyados : " + iHanyados);
        int iMaradekosOsztas = i1 % i2;
        System.out.println("maradekososztas : " + iMaradekosOsztas);

    }
}