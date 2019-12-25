public class Euler14 {
    private static final int LIMIT = 2 << 26;
    private static int[] cache = new int[LIMIT];
    private static int compute(long n){
        int cnt = 1;
        long cp = n;
        while (n > 1){
            n = (n & 1) == 0 ? n >> 1 : 3 * n + 1;
            if(n < LIMIT){
                if(cache[c(n)] > 0){
                    if(cp < LIMIT){
                        cache[c(cp)] = cnt + cache[c(n)];
                        return cache[c(cp)];
                    }
                }
            }
            if(cp < LIMIT)
                cache[c(cp)] = cnt;
            ++cnt;
        }
        return cnt;
    }

    private static int c(long n){
        return (int) n;
    }
    private static int chain(){
        final int LIM = 1000_000;
        int maxValue = 0, maxChain = 0;
        for(long n = 13; n < LIM; ++n){
            int cur = compute(n);
            if(cur > maxChain){
                maxChain = cur;
                maxValue = c(n);
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println(chain());
    }
}
