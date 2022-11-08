import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Írj egy programot, ami beolvas 3 keresztnevet (feltételezhető, hogy amit beír a felhasználó, az
//keresztnév), majd ezeket ábécé sorrendben kiírja. Ne használj beépített rendező függvényt
        Scanner sc = new Scanner(System.in);

        String[] nevek = new String[3];

        System.out.println("kerek egy keresztnevet : ");
        nevek[0] = sc.next();
        System.out.println("kerek egy masik keresztnevet : ");
        nevek[1] = sc.next();
        System.out.println("kerek egy harmadik keresztnevet : ");
        nevek[2] = sc.next();

        System.out.println("abece sorrendben : ");

        Arrays.sort(nevek);
        for (int i = 0; i < nevek.length; i++) {
            System.out.println(nevek[i]);
        }


    }
}