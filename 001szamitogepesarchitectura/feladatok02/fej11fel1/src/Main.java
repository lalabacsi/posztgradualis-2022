import java.awt.*;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args)
    //1. Írja ki a program aktuális könyvtárában lévő összes könyvtár és fájl nevét.
    // Egyszer a könyvtrárakat,
    //utána a fájlokat.
    {
        Path currentFolderPath = Paths.get("").toAbsolutePath();
        File currentFolderInfo = currentFolderPath.toFile();

        File[] filerendszer = currentFolderInfo.listFiles();

        for (int i = 0; i < filerendszer.length; i++) {
            if (!filerendszer[i].isFile())
                System.out.println("Konyvtar : " + filerendszer[i]);

        }
        for (int i = 0; i < filerendszer.length; i++) {
            if (filerendszer[i].isFile())
                System.out.println("File : " + filerendszer[i]);
        }
    }
}