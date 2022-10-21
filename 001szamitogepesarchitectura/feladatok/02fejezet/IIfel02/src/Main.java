public class Main {
    public static void main(String[] args) {

                //Írj egy programot, ami beolvas egy egész számot, binárisan összevagyolja 512-vel, majd az
                //eredményt kíjra.
                //Ennek a programnak a segítségével adj meg 1-1 olyan különböző számot ami:
                //a. Kisebb mint 512 és a program kimenete 548.
                //b. Nagyobb mint 512 és a program kimenete 1536.
                //(próbáljuk okosan kitalálni, hogy mivel érdemes próbálkozni)
//a
                int a1 = 36;
                int a2 = 510;
                int a3 = 511;
                int b = 512;
                int a1esb = a1 | b;
                int a2esb = a2 | b;
                int a3esb = a3 | b;

                System.out.println("a:) " + a1 + " vagy " + b + " = " + a1esb);
                System.out.println("    " + a2 + " vagy " + b + " = " + a2esb);
                System.out.println("    " + a3 + " vagy " + b + " = " + a3esb);
//b

                int b1 = 513;
                int b2 = 514;
                int b3 = 515;
                int b1esb = b1 | b;
                int b2esb = b2 | b;
                int b3esb = b3 | b;

                System.out.println("b:) " + b1 + " vagy " + b + " = " + b1esb);
                System.out.println("    " + b2 + " vagy " + b + " = " + b2esb);
                System.out.println("    " + b3 + " vagy " + b + " = " + b3esb);
//c
                int c1 = 1024;
                int c2 = 2048;
                int c3 = 4096;

                int c1esb = c1 | b;
                int c2esb = c2 | b;
                int c3esb = c3 | b;

                System.out.println("c:) " + c1 + " vagy " + b + " = " + c1esb);
                System.out.println("    " + c2 + " vagy " + b + " = " + c2esb);
                System.out.println("    " + c3 + " vagy " + b + " = " + c3esb);

    }
}