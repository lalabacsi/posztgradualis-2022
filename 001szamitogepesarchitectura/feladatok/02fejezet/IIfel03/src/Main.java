        public class Main {
            public static void main(String[] args) {
                //3. Írj egy programot, ami beolvas egy egész számot, binárisan összekizáróvagyolja (XOR-olja) 512-
                //vel, majd az eredményt kíjra.
                //Ennek a programnak a segítségével adj meg olyan számokat ami:
                //a. Kisebb mint 512 és a program kimenete 578.
                //b. Nagyobb mint 512 és a program kimenete 1030.
                //c. Nagyobb mint 512 és a program kimenete 1534.
//a
                int a1 = 66;
                int a2 = 510;
                int a3 = 511;
                int b = 512;
                int a1esb = a1 ^ b;
                int a2esb = a2 ^ b;
                int a3esb = a3 ^ b;

                System.out.println("a:) " + a1 + " es " + b + " = " + a1esb);
                System.out.println("    " + a2 + " es " + b + " = " + a2esb);
                System.out.println("    " + a3 + " es " + b + " = " + a3esb);
//b

                int b1 = 1542;
                int b2 = 514;
                int b3 = 515;
                int b1esb = b1 ^ b;
                int b2esb = b2 ^ b;
                int b3esb = b3 ^ b;

                System.out.println("b:) " + b1 + " es " + b + " = " + b1esb);
                System.out.println("    " + b2 + " es " + b + " = " + b2esb);
                System.out.println("    " + b3 + " es " + b + " = " + b3esb);
//c
                int c1 = 2046;
                int c2 = 2048;
                int c3 = 4096;

                int c1esb = c1 ^ b;
                int c2esb = c2 ^ b;
                int c3esb = c3 ^ b;

                System.out.println("c:) " + c1 + " es " + b + " = " + c1esb);
                System.out.println("    " + c2 + " es " + b + " = " + c2esb);
                System.out.println("    " + c3 + " es " + b + " = " + c3esb);

            }
        }
