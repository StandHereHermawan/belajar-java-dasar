public class KonversiNumber {
    public static void main(String[] args) {

        //Konversi Tipe Data Number




        //Widening Casting

        //(Otomatis terjadi)
        //Konversi Tipe Data dari tipe data yang lebih kecil ke tipe data yang lebih besar.
        //byte->short->int->long->float->double
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;//hasilnya tetap 10 karena hanya tipe datanya saja yang berubah



        //Narrowing Casting

        //(Manual Konversi)
        //Konversi Tipe Data dari tipe data yang lebih besar ke tipe data yang lebih kecil.
        //double->float->long->int->short->byte
        int iniInt2 = 1000;//hasilnya jadi -24 karena terjadi Number Overflow
        byte iniByte2 = (byte) iniInt2;
        //apabila konversi narrowing dari integer ke byte
        //memiliki angka diatas atau dibawah batas yang bisa ditampung oleh byte,
        //maka terjadi Number Overflow.
        //butuh referensi catatan Number Overflow



    System.out.println(iniInt);
    System.out.println(iniByte2);

    }

}
