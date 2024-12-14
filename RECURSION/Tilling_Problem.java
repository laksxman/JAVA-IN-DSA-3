public class Tilling_Problem {

    public static int TillingProblem(int n){
        if(n==0 || n ==1){
            return 1;
        }
        // verticle 
        // int fnm1 = TillingProblem(n-1);

        // // Horizontal
        // int fnm2 = TillingProblem(n-2);

        // int TotalWays = fnm1 + fnm2;
        // return TotalWays;


        // or
        return TillingProblem(n-1) + TillingProblem(n-2);
    } 
    public static void main(String[] args) {
        System.out.println(TillingProblem(3));
    }
}
