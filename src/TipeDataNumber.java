public class TipeDataNumber {

    public static void main(String[] args) {



        //Integer Number

            //Adalah jenis data bilangan bulat yang berarti tidak memiliki pecahan.

            //ada 4 tipe integer Number, yaitu:
            // -byte,
            // -short,
            // -int (singkatan dari Integer), dan
            // -long.

            //yang membedakan jenis masing data salah satunya adalah kapasitas angka dan size.
            //berikut penjelasannya:

        byte iniByte = -100;
            //nilai minimal byte adalah -128.
            //nilai maksimal byte adalah 127.
            //tidak bisa menambahkan nilai dibawah -128.
            //tidak bisa menambahkan nilai diatas 127.
            //size-nya 1 byte

        short iniShort = 1000;
            //nilai minimal short adalah -32,768.
            //nilai maksimal short adalah 32,767.
            //size-nya 2 bytes

        int iniInt = 1000000;
            //nilai minimal int adalah -2,147,483,648
            //nilai maksimal int adalah 2,147,483,647
            //size-nya 4 bytes

        long iniLong = 1000000000;
        long iniLong2 = 1000000000L;
            //nilai minimal long adalah -9,223,372,036,854,775,808
            //nilai maksimal long adalah 9,223,372,036,854,775,807
            //size-nya 8 bytes

            //default value semua integer number apabila tidak mencantumkan angka adalah "0".



        //Floating Point Number

            //Adalah tipe data bilangan desimal atau memiliki pecahan.
            //ada 2 tipe Floating Point Number, yaitu double dan float
            //yang membedakan jenis masing data salah satunya adalah kapasitas angka dan size.
            //berikut penjelasannya:

        float iniFloat = 10.10F;
            //nilai minimal float adalah 3.4e-038
            //nilai maksimal float adalah 3.4e+038
            //size-nya 4 bytes

        double inidouble = 10.10;
            //nilai minimal double adalah 1.7e-308
            //nilai maksimal double adalah 1.7e+308
            //size-nya 8 bytes

            //default value semua floating point number apabila tidak mencantumkan angka adalah "0.0".





            //Kode: Literals

        int decimalInt = 34;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecimal = 0b10101010;





            //Kode: Underscore

        long balance = 1_000_000_000_000L;
        int sum = 60_000_000;



        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInt);
        System.out.println(iniLong);
        System.out.println(iniLong2);
        System.out.println("");
        System.out.println(inidouble);
        System.out.println(iniFloat);
        System.out.println("");
        System.out.println(decimalInt);
        System.out.println(hexaDecimal);
        System.out.println(binaryDecimal);
        System.out.println("");
        System.out.println(balance);
        System.out.println(sum);

    }

}
