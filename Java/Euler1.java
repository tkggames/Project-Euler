import java.util.stream.IntStream;

public class Euler1 {
    //requires java 8 and beyond
    private static int multiple(){
        return IntStream.range(3, 1000).parallel().
                filter(curValue -> curValue % 3 == 0 || curValue % 5 == 0).
                reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(multiple());
    }
}
