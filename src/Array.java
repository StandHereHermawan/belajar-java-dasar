public class Array {

    public static void main(String[] args) {

        /* Tipe Data Array
        *
        * Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama.
        * Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat.
        * */

        //Kode: Membuat Array
        String[] stringsArray;
        stringsArray = new String[3];

        stringsArray[0] = "Arief";
        stringsArray[1] = "Karditya";
        stringsArray[2] = "Hermawan";

        System.out.println(stringsArray[0]);
        System.out.println(stringsArray[1]);
        System.out.println(stringsArray[2]);
        System.out.println(" ");

        stringsArray[0] = "Hilmi";
        stringsArray[1] = "Akbar";
        stringsArray[2] = "Muharrom";

        System.out.println(stringsArray[0] + " " + stringsArray[1] + " " + stringsArray[2]);
        System.out.println(" ");



        //Kode: Array Initializer
        String[] namaNama = {
            "Arief", "Karditya", "Hermawan",
        };
        int[] arrayInt = new int[]{
                1,2,3,4,5,6,7,8,9,10
        };



        //Kode: Operasi di Array
        /*
        array[index] (mengambil data di array)
        array[index] = value (mengubah data di array)
        array.length (mengambil panjang array)
        * */

        long[] arrayLong = {
                10L,20L,30L
        };

        arrayLong[0] = 100L;

        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong.length);
        System.out.println(" ");
        //".length" adalah method untuk menunjukan panjang array.



        //Kode: Array di dalam Array
        String[][] members = {
                {"Arief","Karditya"},
                {"Hilmi", "AKbar"},
                {"Aryo","Kusumo"},
        };

        System.out.println(members[0][1] + " " + members[0][0]);
        System.out.println(members[1][0]);

    }

}
