
public class LatticePathsEuler15{
    private static long binomialCoefficient(long n, long k){
        var solution = 1L;
        if(n == k)
            k = n - k;
        
        for(var i = 0; i < k; i++){
            solution = solution * (n - i);
            solution = solution / (i + 1);
        }
        return solution;
    }

    private static long latticePaths(final int grid){
         return binomialCoefficient(grid * 2, grid);
    }

    public static void main(String... args){
        var grid = 20;
        System.out.println(latticePaths(grid));
    }
}