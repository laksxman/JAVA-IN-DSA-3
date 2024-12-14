public class typePromotion {
    public static void main(String[] args) {
        // char a = 'a';
        // char b = 'b';
        // System.out.println((int)(b));
        // System.out.println((int)(a));
        // System.out.println(b-a);


        //byte b = 5;
        //byte a = b*2;          // Not Possible because here b is converted into integer
        //System.out.println(a); // Error

        byte b = 5; 
        byte a = (byte)(b*2);
        System.out.println(a); // output is 10







    }
}
