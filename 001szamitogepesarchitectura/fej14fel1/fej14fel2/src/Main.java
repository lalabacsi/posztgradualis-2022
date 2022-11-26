public class Main {
    //2. Írjon ki a képernyőre n darab csillagot. Oldja meg kétféleképpen is. Iteratív módon és rekurzíó
    //felhasználásával.
    public static void main(String[] args) {

//        System.out.println("Kerek egy szamot : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String csillag = ("");

        nszercsillagkiir(5);
        

    }

    private static void nszercsillagkiir(int n) {
        // ha mar kis feladat kerdes, azt oldjuk meg
        if (n <= 0) return;

        // visszavezetes kisebb feladatokra
        nszercsillagkiir(n - 1);

        System.out.println("*");
    }
}