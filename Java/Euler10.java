import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Euler10 {
    //trial division, can be replace with miller rabin prime test
    private static boolean isPrime(long val) {
        return IntStream.iterate(3, t -> t <= (int) Math.sqrt(val) + 1, t -> t + 2).noneMatch(i -> val % i == 0);
    }

    //use parallel() to accommodate for slow prime check subroutine
    private static long sum(){
        return LongStream.iterate(3, i -> i < 2_000_000, i -> i + 2).filter(Euler10::isPrime).parallel().sum() + 2;
    }

    public static void main(String[] args) {
        System.out.println(sum());
    }
}
