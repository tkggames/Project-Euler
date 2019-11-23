
//compile using latest version of java
public class Euler9 {
    private static int specialTriplet(){
        final var TARGET = 1_000;
        for(var c = TARGET / 3; c < TARGET; ++c){
            var sqrt = c * c - TARGET * TARGET + 2 * TARGET * c;
            var ab = (int)Math.sqrt(sqrt);
            if(ab * ab == sqrt){
                var b = (TARGET - c + ab) / 2;
                var a = (TARGET - b - c);
                return a * b * c;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(specialTriplet());
    }
}
