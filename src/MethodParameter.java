public class MethodParameter {
    public static void main(String[] args) {

        sayHello("Arief","Karditya");
        sayHello("Hilmi","Akbar");
        sayHello("Aryo","Kusumo");

    }
    static void sayHello (String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
