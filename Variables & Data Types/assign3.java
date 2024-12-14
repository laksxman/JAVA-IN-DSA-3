import java.util.Scanner;

public class assign3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = (pencil+pen+eraser);
        double GST = (total*18)/100;
        System.out.println(total+GST);

    }
}
