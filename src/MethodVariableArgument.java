public class MethodVariableArgument {
    public static void main(String[] args) {

        int[] values = {80,81,83,80,82};
        sayCongrats("Hilmi", values);

        sayCongrats("Arief", 79,80,81,78,84);
    }

    static void sayCongrats(String name, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name + " , Anda lulus.");
        }else  {
            System.out.println("Maaf " + name + " , Anda tidak lulus.");
        }
    }
}
