public class Euler4 {
    private static boolean isPalindrome(int value) {
        var copy = value;
        var res = 0;
        while (value != 0) {
            var rmd = value % 10;
            res = res * 10 + rmd;
            value /= 10;
        }
        return res == copy;
    }

    private static int largestPalindromeProduct() {
        var largestPalindrome = 0;
        for (var i = 999; i > 99; --i) {
            for (int j = 999; j > 99; --j) {
                var prod = j * i;
                if (isPalindrome(prod) && prod > largestPalindrome) {
                    largestPalindrome = prod;
                }
            }
        }
        return largestPalindrome;
    }

    public static void main(String[] args) {
        System.out.println(largestPalindromeProduct());
    }
}
