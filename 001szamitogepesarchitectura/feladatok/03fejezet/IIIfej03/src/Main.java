import java.util.Scanner;
//Írj programot amiben a felhasnzálónak lehetősége van megadni, hogy egy kör sugarát vagy
//átmérőjét szeretné megadni. Ezek után kérd be a választott adatot, majd számold ki a kör területét
//és írd ki.
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valassza 1-est ha kor sugarat , 2-est ha kor atmerojet szeretne megadni : ");
        int i1 = sc.nextInt();
        if (i1 == 1) {
            System.out.print("A kor sugara : ");
            int ir = sc.nextInt();
            System.out.print("A kor terulete : " + (ir * ir * 3.14)) ;
        }
        if (i1 == 2) {
            System.out.print("A kor atmeroje : ");
            int ia = sc.nextInt();
            System.out.print("A kor terulete : " + ((ia / 2 * ia / 2) * 3.14)) ;
        }


    }
}