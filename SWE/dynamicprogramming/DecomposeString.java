package SWE.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class DecomposeString {
    public static void main(String arg[]){
        DecomposeString decomposeString= new DecomposeString();
        String s = "apple";
        List<String> dictionary = new ArrayList<>();
        dictionary.add("ap"); dictionary.add("pl") ;dictionary.add("ppp" ); dictionary.add("pple");
        System.out.println(decomposeString.canDecompose(dictionary,s));
    }
    public boolean canDecompose(List<String> dictionary, String s) {
        if(s.length()==0 || dictionary.size()==0)
            return  false;
        int maxLen=0;
        for(String word: dictionary){
            maxLen= Math.max(maxLen,word.length());
        }
        boolean[] dp= new boolean[s.length()+1];
        dp[0]=true;

        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(i-j>maxLen)
                    continue;;
                if(dp[j] && dictionary.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }

            }
        }

        return dp[s.length()];
    }
}
