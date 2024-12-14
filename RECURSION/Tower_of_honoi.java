public class Tower_of_honoi {

    public static void toh(int n, int A, int B, int C){
        if(n==0){
            return;
        }
        toh(n-1, A, B, C);
        System.out.println("Moving " + n + "th disk from "+ A + " to "+ C);
        toh(n-1, B, C, A);
    }
    public static void main(String[] args) {
        toh(3, 10, 30, 20);
    }
}
