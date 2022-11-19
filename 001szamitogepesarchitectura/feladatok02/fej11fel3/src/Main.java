import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Írjunk egy programot ami az aktuális könyvtárban létrehoz egy _DataFiles könyvtárat, majd a
        //consoleról *-ig beolvasott nevű fájlokat hoz létre ebben a könyvtárban.
        //(Próbáld ki, hogy mi történik, ha olyan fájlneveket adsz meg, amik nem kanonikus utak. Mit
        //gondolsz, miért lehet ebből baj?)

        //String fileName = "/home/janbodnar/docs/memos";
        //        Path path = Paths.get(fileName);
        //        Files.createDirectories(path);
        Scanner sc = new Scanner(System.in);

        Path ujFolderUtja = Paths.get("_DataFiles");
        Files.createDirectories(ujFolderUtja);

        do {
            System.out.println("Adjon nevet a file-nak: ");
            String file = sc.nextLine();
            if (file.equals("*")) {
                break;
            }
            Path ujFajlUtja = Paths.get(ujFolderUtja.toString(), file); //arg[0] helyett ujFolderUtja
            Files.createFile(ujFajlUtja);

        }
        while (true);

    }
}