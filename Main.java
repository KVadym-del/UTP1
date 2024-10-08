public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Adder adder = new Adder();
        System.out.println(adder.add(1, 2));
        Subtractor subtractor = new Subtractor();
        System.out.println(subtractor.subtract(6, 3));

    }
}
