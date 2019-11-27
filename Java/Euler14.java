import java.util.HashMap;
//compiler with latest java version
//this should help with understanding caching done here
//https://www.youtube.com/watch?v=K0yMyUn--0s&t=355s
public class Euler14 {
    private static HashMap<Long, Integer> cache = new HashMap<>();
    private static int sequence(long n){
        var cp = n;
        var cn = 1;
        while (n > 1){
            n = (n & 1) == 0 ? n >> 1 : 3 * n + 1;
            if(cache.containsKey(n)){
                cache.put(cp, cn + cache.get(n));
                return cache.get(cp);
            }
            cn++;
        }
        cache.put(cp, cn);
        return cn;
    }

    private static long collatz(){
        var maxChain = 0;
        var chainValue = 0L;
        for(var value = 13L; value < 1_000_000; ++value){
            var curChain = sequence(value);
            if(curChain > maxChain){
                maxChain = curChain;
                chainValue = value;
            }
        }
        return chainValue;
    }

    public static void main(String[] args) {
        System.out.println(collatz());
    }
}
