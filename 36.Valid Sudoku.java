class Solution {
    public boolean isValid(char[][] arr,int ii,int jj)
    {
        for(int i=0;i<9;i++)
            if(i!=ii && arr[i][jj]==arr[ii][jj])
                return false;
        for(int j=0;j<9;j++)
            if(j!=jj && arr[ii][j]==arr[ii][jj])
                return false;
        int i=0,j=0,end_i=0,end_j=0,start_i=0,start_j=0;
        if(ii>=0 && ii<3)
            i=0;
        else if(ii>=3 && ii<6)
            i=3;
        else
            i=6;
        if(jj>=0 && jj<3)
            j=0;
        else if(jj>=3 && jj<6)
            j=3;
        else
            j=6;
        end_i=i+3;
        end_j=j+3;
        start_i=i;
        start_j=j;
        for(i=start_i;i<end_i;i++)
            for(j=start_j;j<end_j;j++)
                if(i!=ii && j!=jj && arr[i][j]==arr[ii][jj])
                    return false;
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
                if(board[i][j]!='.' && !(isValid(board,i,j)))
                   return false;
        return true;
    }
}
