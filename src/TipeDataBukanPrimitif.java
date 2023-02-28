public class TipeDataBukanPrimitif {

    public static void main(String[] args) {

        /*Tipe Data Primitif

        Tipe data primitif adalah tipe data bawaan didalam bahasa pmprograman. tipe data primitif tidak bisa diubah lagi.
        Tipe data primitif selalu memiliki default value.
        Di java, semua tipe data primitif memiliki representasi tipe data bukan primitif-nya.

        contoh tipe data primitif sebagai berikut:
        -Tipe data Number (byte,int,short,long,float,double)
        -Tipe data boolean
        -Tipe data char
        * */

        /*Tipe Data Bukan Primitif

        Tipe data bukan primitif tidak memiliki default value.
        Tipw data bukan primitif bisa bernilai null.
        Tipe data bukan primitif bisa memiliki method/function.

        contoh tipe data bukan primitif:
        -tipe data "String",
        -Byte (Representasi dari tipe data primitif "byte"),
        -Short (Representasi dari tipe data primitif "short"),
        -Integer (Representasi dari tipe data primitif "int"),
        -Long (Representasi dari tipe data primitif "long"),
        -Float (Representasi dari tipe data primitif "float"),
        -Double (Representasi dari tipe data primitif "double"),
        -Character (Representasi dari tipe data primitif "char"),
        -Boolean (Representasi dari tipe data primitif "boolean").

        Contoh:
        * */

        Integer iniInteger = 100;//"Integer" adalah tipe data bukan primitif.
        Long iniLong = 10000L;//"Long" adalah tipe data bukan primitif.

        Byte iniByte = null;//"Byte" adalah tipe data bukan primitif.

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);
        System.out.println("");




        //konversi dari tipe primitif ke tipe bukan primitif dengan tipe data yang sama (int->Integer).
        int iniInt = 100;//tipe data primitif.
        Integer iniObject = iniInt;//tipe data bukan primitif.
        //"Integer" adalah tipe data bukan primitif,
        //"iniObject" adalah variable dari "Integer",
        //"iniInt" adalah value dari "iniObject".


        //konversi dari tipe bukan primitif ke tipe primitif dengan tipe data yang sama (Integer->int).
        int iniIntAgain = iniObject;
        //"int" adalah tipe data primitif,
        //"iniIntAgain" adalah variable dari "int",
        //"iniObject" adalah value dari "iniIntAgain".




        //konversi dari tipe bukan primitif ke tipe primitif dengan tipe data berbeda menggunakan method/function.
        short iniShort = iniObject.shortValue();//konversi dari Integer ke short
        //".shortValue()" pada "iniObject.shortValue" adalah nama method untuk konversi.
        long iniLong2 = iniObject.longValue();//konversi dari Integer ke long
        float iniFloat = iniObject.floatValue(); //konversi dari Integer ke float

        Long amount = 1000000L;
        short iniShort2 = amount.shortValue();

        System.out.println(iniObject);//tipe data bukan primitif ("Integer").
        System.out.println(iniIntAgain);//tipe data primitif ("int").
        System.out.println(amount);//tipe data bukan primitif ("Long")
        System.out.println(iniShort2);//tipe data primitif ("short"). terjadi Number Overflow karena value "Long" melampaui kapasitas angka "short".

    }

}
