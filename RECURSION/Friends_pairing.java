public class Friends_pairing {

    public static int friendsPairing(int n){
        if(n==1 || n ==2){
            return n;
        }
        // int fnm1 = friendsPairing(n-1);

        // int fnm2 = friendsPairing(n-2);
        // int pairWays = (n-1)*fnm2;

        // int total_ways = fnm1+pairWays;
        // return total_ways;

        // or
        return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
    }
    

    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
