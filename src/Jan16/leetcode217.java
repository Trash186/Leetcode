package Jan16;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Baller_Xiao
 * @Description
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 *
 * 两种方法：
 *1：hashset搞定
 * 2：用排序好的数组
 * @create_time 2021-01-16 14:30
 * @return
 * @Version
 *
 */
public class leetcode217
{
    public static void main(String[] args)
    {
        int nums[]={1,1,2,3};
        boolean b = containsDuplicate1(nums);
        System.out.println(b);
    }
    //方法一：使用一个set中的contains方法
    public static boolean containsDuplicate(int nums[])
    {
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0;i< nums.length-1;i++)
        {
            if(hashSet.contains(nums[i]))
            {
                return true;
            }
            hashSet.add(nums[i]);
        }
        return false;
    }
    public static boolean containsDuplicate1(int [] nums)
    {
        Arrays.sort(nums);
        for(int i=0;i< nums.length;i++)
        {
            if(nums[i]==nums[i+1])
            {
                return true;
            }
        }
        return false;
    }

}
