public class Fibonacci_number {

    public static int fin(int n){
        if(n== 0 || n==1){
            return n;
        }
        int finNM1 = fin(n-1);
        int finNM2 = fin(n-2);
        int fn = finNM1+finNM2;
        return fn;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(fin(n));
    }
}
