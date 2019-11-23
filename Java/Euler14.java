import java.util.HashMap;
//compiler with latest java version
//this should help with understanding caching done here
//https://www.youtube.com/watch?v=K0yMyUn--0s&t=355s
public class Euler14 {
    private static HashMap<Long, Integer> cache = new HashMap<>();
    private static int sequence(long root){
        if(cache.containsKey(root)) //let presume its already there
            return cache.get(root);
        
        var counter = 1;
        var copy = root;
        while (root > 1){
            if((root & 1) == 0){
                root >>= 1;
                ++counter;
            } else{
                root = 3 * root + 1;
                ++counter;
            }
            if(cache.containsKey(root)){ //exist a computer sub part
                cache.put(copy, counter + cache.get(root)); //cache new computation for root
                return cache.get(copy);
            }
        }
        cache.put(copy, counter); //cache
        return counter;
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
