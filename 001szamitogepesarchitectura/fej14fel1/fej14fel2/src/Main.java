public class Main {
    //2. Írjon ki a képernyőre n darab csillagot. Oldja meg kétféleképpen is. Iteratív módon és rekurzíó
    //felhasználásával.
    //4. Egy 𝑛 egész szám esetén 𝑛! jelöli 1-től 𝑛-ig a számok szorzatát. 5! = 1 ⋅ 2 ⋅ 3 ⋅ 4 ⋅ 5.
    // Írjon rekurzív algoritmust amely kiszámolja 𝑛! értékét
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