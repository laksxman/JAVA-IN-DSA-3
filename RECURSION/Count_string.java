public class Count_string {

    public static int countSubs(String str, int si, int ei){
        if(si>ei){
            return 0;
        }

        int firstCharRemoved = countSubs(str, si+1, ei);
        int lastCharRemoved = countSubs(str, si, ei-1);
        int firstLastCharRemoved = countSubs(str, si+1, ei-1);

        int ans = firstCharRemoved + lastCharRemoved + firstLastCharRemoved;
        // int ans = firstCharRemoved + lastCharRemoved - firstLastCharRemoved;

        if(str.charAt(si) == str.charAt(ei)){
            ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "absab";
        int n = str.length();
        int ans = countSubs(str, 0, n-1);

        System.out.println(ans);
    }
}
