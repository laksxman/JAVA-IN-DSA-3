import java.util.Scanner;

public class typeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float number = 99.99f;
        // float number = sc.nextFloat();
        int number2 = (int) number;
        System.out.println(number2);
    }
}
