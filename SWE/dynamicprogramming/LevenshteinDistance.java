package SWE.dynamicprogramming;

public class LevenshteinDistance {
    public static void main(String arg[]){
        LevenshteinDistance distance= new LevenshteinDistance();
        String s1="hello";
        String s2= "hail";
        System.out.println(distance.levenshteinDistance(s1,s2));
    }

    public int levenshteinDistance(String s1, String s2) {
        /*if(s1.length()==0)
            return s2.length();
        if(s2.length()==0)
            return s1.length();*/
        int[][] dp= new int[s1.length()+1][s2.length()+1];

        for(int i=0;i<=s1.length();i++){
            for(int j=0;j<=s2.length();j++){
                if(i==0)
                    dp[i][j]=j;
                else if(j==0)
                    dp[i][j]=i;
                else if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]= dp[i-1][j-1];
                else {
                    dp[i][j]= 1+min(dp[i-1][j],dp[i][j-1], dp[i-1][j-1]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
    private int min(int a,int b, int c){
        int l = Math.min(a, b);
        return Math.min(l, c);
    }
}
