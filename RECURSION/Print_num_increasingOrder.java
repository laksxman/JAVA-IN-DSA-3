public class Print_num_increasingOrder {

    public static void PrintNum(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        PrintNum(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 10;
        PrintNum(n);
    }
}
