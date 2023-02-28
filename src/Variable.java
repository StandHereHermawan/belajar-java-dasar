public class Variable {

    public static void main(String[] args) {
        // Variable
        // Variable adalah tempat untuk menyimpan data.
        // Java adalah bahasa pemprograman static type. sehingga sebuah variable hanya bisa digunakan untuk menyimpan tipe data yang sama. tidak bisa diubah-ubah seperti di bahasa pemprograman PHP atau Javascript.
        // Untuk membuat variable di Java kita bisa munggunakan nama tipe data lalu diikuti dengan nama variable-nya.
        // Nama variable tidak boleh mengandung whitespace (spasi, enter, tab).
        // Nama variable tidak boleh seluruhnya angka.
        // Nama variable tidak boleh dimulai dari angka.
        // Value dari Variable bisa lebih dari satu secara default.

        String name; //"name" adalah variable.
        name = "Arief Karditya Hermawan";//"Arief Karditya Hermawan" adalah Value dari Variable "name".

        System.out.println(name);

        int age = 20; //"age" adalah variable
        String address = "Indonesia"; //"adress adalah variable"

        System.out.println(age);
        System.out.println(address);

        name = "Hilmi Akbar Muharrom";//"Hilmi Akbar Muharrom" adalah value dari Variable "name"
        // Java akan otomatis membedakan Value suatu Variable sesuai urutan baca Java dari atas ke bawah.
        System.out.println(name);





        //Kata Kunci Var

        //Sejak Java versi 10, Java mendukung pembulatan variable dengan kata kunci var. sehingga kita tidak perlu menyebutkan datanya.
        //Perlu diingat, saat kita menggunakan kata kunci var untuk membuat variable, kita harus menginisiasi value dari variable tersebut secara langsung.
        //contoh:

        /*var name1;.
        name1 = "Arief Karditya Hermawan";*/

        //penggunaan var diatas salah karena value dari variable tidak diinisiasi dengan langsung

        var name2 = "Hilmi AKbar Muharrom"; //penggunaan var yang benar
        var age2 = 30;
        var address2 = "Indonesia";

        System.out.println(name2);
        System.out.println(age2);
        System.out.println(address2);



        //Kata Kunci Final

        //Jika kita ingin membuat sebuah variable yang value-nya tidak bisa diubah, kita bisa menggunakan kata kunci final.
        //istilah variable seperti ini, banyak juga disebut konstan.
        //contoh:
        final var application = "Belajar Java";
        System.out.println(application);
        //"Value" dari variable "application" disamping tidak bisa diubah lagi.
        //"Belajar Java" adalah value konstan dari variable "application" berkat kata kunci  final;
    }

}
