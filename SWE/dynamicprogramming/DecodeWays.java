package SWE.dynamicprogramming;

public class DecodeWays {
    public static void main(String arg[]){
        DecodeWays decodeWays= new DecodeWays();
        String s="123";
        System.out.println(decodeWays.decodeWays(s));
    }
    public int decodeWays(String s) {
        if(s.length()==0)
            return 0;
        int dp[]= new int[s.length()];

        dp[0]= s.charAt(0)=='0' ? 0:1;

        for(int i = 1; i < s.length(); i++) {
            int first = Integer.valueOf(s.substring(i, i+1));
            int second = Integer.valueOf(s.substring(i-1, i+1));
            if(first >= 1 && first <= 9) {
                dp[i] += dp[i-1];
            }
            if(second >= 10 && second <= 26) {
                dp[i] += i >=2 ? dp[i-2] : 1;
            }
        }

        return dp[s.length()-1];
    }

}
