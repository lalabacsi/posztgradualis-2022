public class Main {
    //Irja meg ismert palindrom rekurziv teszteleset
    //a rekurizo burkolo fuggvenye egy karakterlancot var parmeterken es egy igaz/hamis
    //erteket ad vissza , miszerint a kapott karakterlanc palindrim vagy nem
    public static void main(String[] args) {
        String palindrom = "dsfdsfrwfsfsd";

        if (palVnem(palindrom)) {
            System.out.println("ez a szo pal : ");
        } else {
            System.out.println("ez a szo nem pal : ");
        }
    }

    public static boolean palVnem(String palindrom) {

        if (palindrom.equalsIgnoreCase(osszehasonlitoRek(palindrom)))
            return true;
        return false;
    }
    public static String osszehasonlitoRek(String palindrom) {
        if (palindrom.charAt(0) == palindrom.charAt(palindrom.length()-1)) {
            return palindrom;

            for (int i = palindrom.length(); i >=0 ; i--) {

                
            }

        }

    }
}
//import java.io.*;
//
//class GFG {
//    public static boolean isPalindrome(String str)
//    {
//        // Initializing an empty string to store the reverse
//        // of the original str
//        String rev = "";
//
//        // Initializing a new boolean variable for the
//        // answer
//        boolean ans = false;
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//        }
//
//        // Checking if both the strings are equal
//        if (str.equals(rev)) {
//            ans = true;
//        }
//        return ans;
//    }
//    public static void main(String[] args)
//    {
//        // Input string
//        String str = "geeks";
//
//        // Convert the string to lowercase
//        str = str.toLowerCase();
//        boolean A = isPalindrome(str);
//        System.out.println(A);
//    }
//}