public class Euler12 {
    // formula  T = (n)(n + 1) / 2
    private static int triangular(final int n){
        return n * (n + 1) / 2;
    }
    private static int divisors(int triangular){
        var divCount = 2; //account for 1 and triangular number
        final var bound = Math.sqrt(triangular);
        for(var i = 2; i <= bound; ++i){
            if(triangular % i == 0){
                ++divCount;
                if(((triangular / i) ^ i) != 0) //remove duplicate divisors
                    ++divCount;
            }
        }
        return divCount;
    }

    private static int FiveHundredPlus(){
        var i = 10;
        var maxT = 28;
        var maxJ = divisors(maxT);

        while (maxJ <= 500){
            maxT = triangular(i++);
            maxJ = divisors(maxT);
        }
        return maxT;
    }

    public static void main(String[] args) {
        System.out.println(FiveHundredPlus());
    }
}
