import java.util.*;

public class input {

    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
    }
    public static void main(String[] args) {
        // char arr[] = {'a', 'b','c','d'};
        // String str = "absd";
        // String str2 = new String("xyz");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // System.out.println("Enter string: ");
        // name = sc.nextLine();
        // System.out.println(name);

        // String fulName = "Tony Stark";
        // System.out.println(fulName.length());

        //concatenation
        String firstName = "Lakshman";
        String lastName = "yadav";

        String fullName = firstName+ " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.charAt(0));

        printLetters(fullName);
    }
}