class Solution {
    public boolean divisorGame(int n) {
        boolean dp[] = new boolean[n+1];

      // by intution we can do it by even and odd
      // even always true 
      // odd always false
      // so chech if n%--20
      
        dp[0] = false;
        if(n >= 1) dp[1] = false;

        for(int i=2;i<=n; i++){
            for(int x=1; x<i; x++){
                if( i%x ==0){
                   if (!dp[i - x]) {
                        dp[i] = true;
                        break;
                    }
                }
            }
        }
        return dp[n];
    }
}
