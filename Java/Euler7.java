import java.util.stream.IntStream;

public class Euler7 {
    private static boolean isPrime(int val) {
        return IntStream.iterate(3, t -> t <= (int) Math.sqrt(val) + 1, t -> t + 2).noneMatch(i -> val % i == 0);
    }

    private static int primeFound() {
        final var LIM = 10_001;
        var initValue = 3;
        var initCount = 1;
        while (initCount < LIM) {
            if (isPrime(initValue))
                ++initCount;
            initValue += 2;
        }
        return initValue + ~2 + 1;
    }

    public static void main(String[] args) {
        System.out.println(primeFound());
    }
}
