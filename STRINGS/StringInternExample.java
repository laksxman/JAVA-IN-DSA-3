public class StringInternExample {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = "hello";

        String str3 = str1.intern();

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);

    }
}
