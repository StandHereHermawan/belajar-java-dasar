public class TipeDataString {

    public static void main(String[] args) {
        // Tipe Data String
        // Tipe data String adalah tipe data yang berisikan data kumpulan karakter-
        // -atau sederhananya tipe data berisikan teks.
        // Di Java, tipe data String direpresentasikan dengan kata kunci String.
        // Untuk membuat String di Java, kita menggunakan karakter ' (petik dua)-
        // -sebelum dan sesudah teks.
        // Default value String adalah Null

        String firstName = "Arief";
        String lasttName = "Hermawan";

        System.out.println(firstName);
        System.out.println(lasttName);



        //menggabungkan String
        String fullName = (firstName + " " + lasttName);// menghasilkan output di konsol firstName + (spasi) + lastname
        System.out.println(fullName);

    }

}
