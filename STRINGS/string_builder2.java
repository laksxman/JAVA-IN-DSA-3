public class string_builder2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Lakshman");

        System.out.println(sb.hashCode());
        sb.append("D");
        System.out.println(sb.hashCode());


        String str1 = new String("Lakshman");
        String str2 = "Lakshman";

        str1 = str1.intern();
        System.out.println(str1==str2);
    }
}
