public class OperasiMatematika {

    public static void main(String[] args) {
        //Kode: Operasi Matematika
        int a = 100;
        int b = 10;

        System.out.println(a + b);//Penjumlahan
        System.out.println(a - b);//Pengurangan
        System.out.println(a * b);//Perkalian
        System.out.println(a / b);//Pembagian
        System.out.println(a % b);//Sisa Bagi (Modulo)
        System.out.println(" ");

        //Kode: Augmented Assignment
        /*
        a += 10 (a + 10)
        a -= 10 (a - 10)
        a *= 10 (a * 10)
        a /= 10 (a / 10)
        a %= 10 (a % 10)
        * */
        int c = 100;

        c += 10;
        System.out.println(c);//di konsol value c akan menjadi 110

        c -= 10;
        System.out.println(c);//di konsol value c akan menjadi 100

        c *= 10;
        System.out.println(c);//di konsol value c akan menjadi 1000

        c /= 10;
        System.out.println(c);//di konsol value c akan menjadi 100

        c %= 10;
        System.out.println(c);//di konsol value c akan menjadi 0

        c += 10;
        System.out.println(c);//di konsol value c akan menjadi 10
        System.out.println(" ");

        //Kode: Unary Operator
        /*
        ++ = a + 1
        -- = a - 1
        - = bilangan negatif
        + = bilangan positif
        ! = Boolean berkebalikan
                */
        int d = 100;

        d++;
        System.out.println(d);//nilai d menjadi 101

        d--;
        System.out.println(d);//nilai d menjadi 100

    }

}
