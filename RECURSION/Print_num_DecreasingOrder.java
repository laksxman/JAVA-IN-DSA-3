public  class Print_num_DecreasingOrder{
    public static void main(String[] args) {
        int n=10;
        PrintNum(n);
    }

    public static void PrintNum(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        PrintNum(n-1);
    }
}

