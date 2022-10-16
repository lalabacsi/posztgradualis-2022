import java.util.Scanner;

public class Main {
    //3. Olvass be két 8 bites egész számot és írd ki, egész mondatban, hogy melyik a nagyobb. (pl.: 5 és 6
    //estén: 6 nagyobb mint 5. 5 és 5 esetén: 5 egyenlő 5.)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("kerek egy szamot :");
        byte b1 = sc.nextByte();
        System.out.print("kerek egy szamot :");
        byte b2 = sc.nextByte();

        if (b1 == b2) {
            System.out.println(b1 + " egyenlo " + b2);
        }
        else {
            if (b1 < b2) {
                System.out.println(b1 + " kisebb " + b2);
            } else {
                System.out.println(b1 + " nagyobb " + b2);
            }
        }


        System.out.println("Hello world!");
    }
}