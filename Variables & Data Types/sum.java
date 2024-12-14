import java.util.*;


public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a+b;
        System.out.println(sum);

        int mul = a*b;
        System.out.println(mul);

        float rad = input.nextFloat();
        float area = 3.14f*rad*rad;
        // double area = 3.14*rad*rad;
        System.out.println(area);

    }
}
