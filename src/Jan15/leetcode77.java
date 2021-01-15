package Jan15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Baller_Xiao
 * @Description
 * @create_time 2021-01-15 19:18
 * @return
 * @Version
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 */

public class leetcode77
{

    public static void main(String[] args)
    {
        leetcode77 leetcode77 = new leetcode77();
        List<List<Integer>> combine = leetcode77.combine(4, 2);
        System.out.println(combine);
    }
    public List<List<Integer>> combine(int n, int k)
    {
        List<List<Integer>> res=new ArrayList<>();//由题意，先造一个嵌套列表来存放结果
        List<Integer> temp=new ArrayList<>();//造一个链表来存放每一次的结果
        backtracking(n,k,res,temp,1);//调用回溯函数
        return res;//返回结果
    }
    public void backtracking(int n, int k, List<List<Integer>> res, List<Integer> temp, int index)
    {
        //画一个分叉图,如果临时的列表大小和给定的大小相等，那么则把列表放入res中
        if(temp.size()==k)
        {
            res.add(new ArrayList<>(temp));
            return ;
        }
        if(index>n)//如果超过索引，直接退出
        {
            return ;
        }
        for(int i=index;i<=n;i++)
        {
            temp.add(i);
            backtracking(n,k,res,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
