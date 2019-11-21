
import java.util.stream.IntStream;
import java.util.stream.LongStream;

//use latest version of java
public class Euler6 {
    private static long sumDifference(){
        var sum = LongStream.range(1, 101).map(i -> (long) Math.pow(i, 2)).reduce(0L, Long::sum);
        var dif = (long) Math.pow(IntStream.range(1, 101).reduce(0, Integer::sum), 2);
        return dif + ~sum + 1;
    }

    public static void main(String[] args) {
        System.out.println(sumDifference());
    }
}
