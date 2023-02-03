public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String a, b;
        a = "01100";
        b = "01111";

        System.out.println(a + " + " + b + " = " + bins
                .sum(a, b));

        System.out.println(a + " * " + b + " = " + bins
                .mult(a, b));

    }
}
