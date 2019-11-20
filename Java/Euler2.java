public class Euler2 {
    //requires java 8 and beyond
    private static int fib() {
        final var limit = 4_000_000;
        var m = 1;
        var n = 2;
        var z = n + m;
        var s = n;

        while (z <= limit) {
            if((z & 1) == 0)
                s += z;
            m = z;
            z = n + m;
            n = m;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(fib());
    }
}
