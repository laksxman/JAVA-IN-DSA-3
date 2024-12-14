public class optimizedPower {

    public static int optimiPower(int a, int n){
        if(n==0){
            return 1;
        }
        int halfPowerSq = optimiPower(a, n/2)*optimiPower(a, n/2);

        // n is odd
        if(n%2 !=0){
            halfPowerSq = a* halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int a = 2;
        int n = 9;
        System.out.println(optimiPower(a, n));
    }
}
