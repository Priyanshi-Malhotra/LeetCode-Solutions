class Solution {
    public int minPathSum(int[][] grid) {
        int[][] t=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                t[i][j]=grid[i][j];
                if(i==0 && j!=0)
                    t[i][j]+=t[i][j-1];
                else if(i!=0 && j==0)
                    t[i][j]+=t[i-1][j];
                else if(i!=0 && j!=0)
                    t[i][j]+=Math.min(t[i-1][j],t[i][j-1]);
            }
        }
        return t[grid.length-1][grid[0].length-1];
    }
}
