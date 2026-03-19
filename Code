class Solution {
    public int climbStairs(int n) {
        //This is fibonanci number problem. But build it from the round since recursion takes too long.
        if(n<=2){
            return n;
        }
        int x = 1;
        int y = 2;
        for (int i=3; i <=n; ++i){
            int temp = x+y;
            x = y;
            y = temp;
        }
        return y;
        
    }
}
