public class x_power {

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x*xnm1;
        // return xn;

        // or

        return x*power(x, n-1);
    }
    public static void main(String[] args) {
        int x = 10;
        int n = 2;
        System.out.println(power(x, n));
    }
}
