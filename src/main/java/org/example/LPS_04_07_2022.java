package org.example;
/* Given a string return the length of the longest contiguos palindromic substring.
*
* Input - "aabccbd"
* output - 4
* Explanation - longest contiguos palindromic substring is "bccb" its length is 4. */
public class LPS_04_07_2022 {
    static int longPalinSub(String s,int n){
        int i,j,g;
        boolean[][] dp = new boolean[n][n];
        int len = 0;
        for(g=0;g<n;g++){
            for(i=0,j=g;j<n;i++,j++){
                //base case
                if(g==0){
                    dp[i][j] = true;
                }
                //base case
                else if (g==1) {
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = false;
                    }
                }else{
                    if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]==true){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }
                if(dp[i][j]){
                    len = g+1;
                }
            }

        }
        return len;
    }

    public static void main(String[] args) {
        String str = "aabccbd";
        System.out.println(longPalinSub(str,str.length()));
    }
}
