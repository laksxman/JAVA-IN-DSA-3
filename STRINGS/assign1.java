import java.util.Scanner;

public class assign1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str = sc.nextLine();

        int voweCount = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch =='a' || ch =='e' || ch=='i'|| ch=='o'||ch=='u'){
                voweCount++;
            }
        }

        System.out.println("The number of lowercase vowels in the string is: " + voweCount);

    }
}
