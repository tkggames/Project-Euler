public class Euler3 {
    private static int maxPrimeFactor(){
        var value = 600851475143L;
        var maxPrimeFac = 0;
        for(var num = 2; num <= value / num; ++num){
            while (value % num == 0){
                maxPrimeFac = num;
                value /= num;
            }
        }
        return value > 1 && value > maxPrimeFac ? (int) value : maxPrimeFac;
    }

    public static void main(String[] args) {
        System.out.println(maxPrimeFactor());
    }
}
