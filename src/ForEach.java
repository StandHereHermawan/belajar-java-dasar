public class ForEach {
    public static void main(String[] args) {

        String [] names = {
          "Pelajar ", "Java ", "Hari ini, ",
          "Arief ","Karditya ","Hermawan"
        };

        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }


        System.out.println(" ");
        System.out.println("FOR EACH");
        System.out.println(" ");

        for (var name: names){
            System.out.print(name);
        }
    }
}
