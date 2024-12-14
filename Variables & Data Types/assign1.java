import java.util.Scanner;

public class assign1 {
    public static void main(String[] args) {
        // @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int avg = (a+b+c)/3;
        System.out.println("Average is: " + avg);
    }
}
