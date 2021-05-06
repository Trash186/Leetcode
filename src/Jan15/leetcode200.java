package Jan15;

/**
 * @author Baller_Xiao
 * @Description
 * @create_time 2021-01-15 22:50
 * @return
 * @Version
 * 岛屿数量问题，用一个dfs
 * 将1“沉没”为0，然后深度优先搜索，做同样操作
 */
public class leetcode200
{

    public int numIsLands(char[][] grid)
    {
        int count=0;
        for(int i=0;i< grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    callDFS(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void callDFS(char[][]grid,int i,int j)
    {
        if(i<0||i> grid.length||j<0||j> grid[0].length||grid[i][j]=='0')
        {
            return ;
        }
        grid[i][j]='0';
        callDFS(grid,i-1,j);
        callDFS(grid,i+1,j);
        callDFS(grid,i,j+1);
        callDFS(grid,i,j-1);

    }

}
