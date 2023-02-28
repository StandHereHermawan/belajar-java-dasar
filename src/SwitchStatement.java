public class SwitchStatement {
    public static void main(String[] args) {
        //Switch Statement

        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Wow, Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }




        //Switch Lambda
        switch (nilai) {
            case "A" -> System.out.println("Wow, Anda lulus dengan baik");
            case "B", "C" -> System.out.println("Nilai Anda cukup baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda sakag jurusan");
            }
        }




        //Switch Tanpa Yield
        String ucapan;

        switch (nilai) {
            case "A" -> ucapan = "Wow, Anda lulus dengan baik";
            case "B", "C" -> ucapan ="Nilai Anda cukup baik";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> ucapan = "Mungkin Anda sakag jurusan";
        }
        System.out.println(ucapan);




        //Switch Yield
        ucapan = switch (nilai) {
            case "A" :
                yield "Wow, Anda lulus dengan baik";
            case "B", "C" :
                yield "Nilai Anda cukup baik";
            case "D" :
                yield "Anda Tidak Lulus";
            default :
                yield "Mungkin Anda salah jurusan";
        };
        System.out.println(ucapan);
    }
}