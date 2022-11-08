import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kerek egy karaktert : ");
        char karakter = sc.next().charAt(0);

        if (((int)karakter)>64&&((int)karakter)<91){
            System.out.println("Karakter nagy betu");
        }
        if (((int)karakter)>96&&((int)karakter)<1231) {
            System.out.println("Karakter kis betu");
        }
        if (((int)karakter)>48&&((int)karakter)<58) {
            System.out.println("Karakter szam ");
        }

    }
}