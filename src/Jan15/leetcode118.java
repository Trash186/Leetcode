package Jan15;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Baller_Xiao
 * @Description
 * @create_time 2021-01-16 1:30
 * @return
 * @Version
 * 杨辉三角
 */
public class leetcode118
{
    public static void main(String[] args)
    {
        List<List<Integer>> generate = generate(5);
        System.out.println(generate);
    }
    public static List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> triangle=new ArrayList<>();
        List<Integer> firstRow=new ArrayList<>();

        if(numRows==0)
        {
            return triangle;
        }
        firstRow.add(1);
        triangle.add(firstRow);
        for(int i=1;i<numRows;i++)//从第2行开始，所以索引从1开始
        {
            List<Integer> preRow=triangle.get(i-1);
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++)//每行第一个已经加为1了，所以索引从1开始，两两相加i-1次
            {
                row.add(preRow.get(j)+preRow.get(j-1));

            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
