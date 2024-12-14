public class comparison {
    public static void main(String[] args) {
        String s1 = "Lakshman";
        String s2 = "Lakshman";
        String s3 = new String("Lakshman");

        if(s1==s2){
            System.out.println("both are equal");
        }else{
            System.out.println("Both are not equal");
        }

        if(s1==s3){
            System.out.println("both are equal");
        }else{
            System.out.println("Both are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("both are equal");
        }else{
            System.out.println("Both are not equal");
        }
    }
}
