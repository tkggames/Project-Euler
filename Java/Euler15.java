import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

//applied both Dynamic Programming
//and combination approach
// as always run latest version of java
public class Euler15 {
    private  static Map<BigInteger, BigInteger> cache = new HashMap<>();
    private static BigInteger fac(BigInteger n, Map<BigInteger, BigInteger> map){
        if(n.compareTo(BigInteger.ONE) == 0){
            map.put(n, BigInteger.ONE);
            map.put(BigInteger.ZERO, BigInteger.ONE);
        }
        if(map.containsKey(n))
            return map.get(n);
        else
            map.put(n, n.multiply(fac(n.subtract(BigInteger.ONE), map)));
        return map.get(n);
    }

    private static BigInteger binomialCoefficient(BigInteger n, BigInteger k){
        //  n! / k!(n-k)!
        var fn = fac(n, cache);
        var fk = cache.get(k);
        return fn.divide((fk.multiply(cache.get(n.subtract(k)))));
    }

    private static BigInteger latticePaths(final BigInteger ROUTES){
        return binomialCoefficient(ROUTES.multiply(BigInteger.TWO), ROUTES);
    }

    public static void main(String[] args) {
        System.out.println(latticePaths(new BigInteger("20")));
    }
}
