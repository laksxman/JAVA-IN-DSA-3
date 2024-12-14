public class FactorialOf_N_Number {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fac(n));

    }

    public static int fac(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fac(n-1);
        int fn = n * fac(n-1);
        return fn;
    }
}
