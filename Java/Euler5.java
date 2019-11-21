import java.util.stream.IntStream;

//use latest version of java
public class Euler5 {
    private static final int[] DIVISORS = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    private static int lcm(){
        //returns answer if found or Integer.MAX_VALUE
        return IntStream.iterate(2520, i -> i + 2520).filter(Euler5::isLcm).findFirst().orElse(Integer.MIN_VALUE);
    }

    private static boolean isLcm(int value){
        //using reverse logic here
        return IntStream.of(DIVISORS).noneMatch(curValue -> value % curValue != 0);
    }

    public static void main(String[] args) {
        System.out.println(lcm());
    }
}
