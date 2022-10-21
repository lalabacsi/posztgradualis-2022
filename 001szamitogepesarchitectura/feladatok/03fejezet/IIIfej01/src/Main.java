import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. Írj programot ami beolvas egy egész, majd eldönti, hogy az alábbi esetek közül melyik áll fenn:
        //a. a szám páratlan
        //b. a szám páros és osztható néggyel, de nem osztható nyolccal
        //c. a szám páros és osztható nyolccal és néggyel is
        //d. a szám páros de nem osztható sem nyolccal sem néggyel
        //e. valami más féle szám

        System.out.print("Kerek egy szamot : ");

        int i1 = sc.nextInt();
        if (i1 % 2 != 0) {
            System.out.println(i1 + " paratlan");
        } else {
            if (i1 % 4 == 0 && i1 % 8 != 0) {
                System.out.println("paros, /4-el es nem /8-al");
            }
            if (i1 % 8 == 0) {
                System.out.println("paros, /4-el es  /8-al");
            }
            if (i1 % 4 != 0) {
                System.out.println("paros, de nem/4-el es nem /8-al");
            }
        }


    }
}