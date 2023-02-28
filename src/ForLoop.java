public class ForLoop {
    public static void main(String[] args) {
        //Kode: Perulangan dengan Kondisi
        var counter = 1;

        for(; counter <= 10 ;){
            System.out.println("Perulangan" + counter);

            counter++;
        }
        System.out.println(" ");




        //Kode: Perulangan dengan Init Statement
        for(var counter1 = 1; counter1 <= 10 ;){
            System.out.println("Perulangan" + counter1);

            counter1++;
        }
        System.out.println(" ");




        //Kode: Perulangan dengan Post Statement
        for(var counter2 = 1; counter2 <= 10 ; counter2++) {
            System.out.println("Perulangan" + counter2);
        }
    }
}
