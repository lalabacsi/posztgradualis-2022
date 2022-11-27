public class Main {
    //4. Egy 𝑛 egész szám esetén 𝑛! jelöli 1-től 𝑛-ig a számok szorzatát. 5! = 1 ⋅ 2 ⋅ 3 ⋅ 4 ⋅ 5.
    // Írjon rekurzív algoritmust amely kiszámolja 𝑛! értékét
    public static void main(String[] args) {
        int n = 6;

        int nFact = nfakt(n);

    }

    public static int nfakt(int n) {
        // 3! = 1 ⋅ 2 ⋅ 3
        // 4! = 1 ⋅ 2 ⋅ 3 ⋅ 4
        // 5! = 1 ⋅ 2 ⋅ 3 ⋅ 4 ⋅ 5 =
        // n! = (n-1)! * n
        if (n == 1)
            return 1;

        int n_1Faktor = nfakt(n-1);

        int eredmeny = n_1Faktor * n;

        return eredmeny;
    }
}

