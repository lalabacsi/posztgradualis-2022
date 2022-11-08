import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kerek egy szamot 1-10 ig : ");
        int i1 = sc.nextInt();
        if (i1 >1 && i1<10) {
            for (int i = 0; i < i1; i++) {
                System.out.println("hello ");
            }
        }
        else
            System.out.println("Ejnyebejnye");
    }
}