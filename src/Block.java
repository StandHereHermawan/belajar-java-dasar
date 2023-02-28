public class Block {
    public static void main(String[] args) {
/*
        Block
        Block adalah kumpulan statement yang terdiri dari nol atau lebih statement.
        Block diawali dan diakhiri dengan kurung kurawal {}
*/

        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");

        {
            System.out.println("Hello SuperUserDO 1");
            System.out.println("Hello SuperUserDO 2");
            System.out.println("Hello SuperUserDO 3");

            {
                System.out.println("Hai Admin 1");
                System.out.println("Hai Admin 2");
                System.out.println("Hai Admin 3");
            }
            /*

            {
                System.out.println("Hai Admin 1");
                System.out.println("Hai Admin 2");
                System.out.println("Hai Admin 3");
            }
                diatas adalah contoh block. sesuai dengan definisi diatas, block adalah kumpulan statement.

                {}
                diatas adalah contoh block juga. hanya saja tidak memiliki statement.

            */

        }

    }

}
