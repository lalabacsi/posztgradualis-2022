import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Írj egy programot ami addig kér be könyvtárneveket,
        // ameddig abban pont nem lesz (pl x, y, a.txt),
        //majd ez alapján létrehozza az aktuális könyvtárban az x/y/a.txt fájlt.

        Scanner sc = new Scanner(System.in);

        Path ujFolderUtja = Paths.get("_DataFiles");
        Files.createDirectories(ujFolderUtja);

        do {
            System.out.println("Adjon nevet a file-nak: ");
            String file = sc.nextLine();
            if (file.equals("*")) {
                break;
            }
            Path ujFajlUtja = Paths.get(ujFolderUtja.toString() ,file + ".txt"); //arg[0] helyett ujFolderUtja
            Files.createFile(ujFajlUtja);

        }
        while (true);

    }
}