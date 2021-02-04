class Solution {
    public int climbStairs(int n) {
        /*int[][] t=new int[n+1][n+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<n+1;j++)
            {
                if(j==0)
                    t[i][j]=1;
                else if(i==0)
                    t[i][j]=0;
                else if(i<=j)
                    t[i][j]=t[i-1][j]+t[i][j-1];
                else
                    t[i][j]=t[i-1][j];
                
            }
        }
        return t[n][n];*/
        int[] t=new int[n+1];
        t[1]=1;
        if(t.length>2)
        t[2]=2;
        for(int i=3;i<n+1;i++)
            t[i]=t[i-1]+t[i-2];
        return t[n];
    }
}
