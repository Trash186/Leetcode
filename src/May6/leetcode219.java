package May6;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Baller_Xiao
 * @Description
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: nums = [1,2,3,1], k = 3
 * 输出: true
 * 示例 2:
 *
 * 输入: nums = [1,0,1,1], k = 1

 * @create_time 2021-05-06 11:37
 * @return
 * @Version
 */
public class leetcode219
{
    /**
     * 方法一：
     * 暴力法
     */
    public boolean contains(int nums[],int k)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j]&&j-k<=3)
                {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 方法二:
     * 使用hashmap
     * 与leetcode第一题类似，使用哈希表，存入（nums[i],i）
     * 如果后面有元素相同，则使用index-i
     */

    public boolean contains1(int nums[],int k)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            Integer index = map.get(nums[i]);
            if (index == null)
            {
                map.put(nums[i], i);
            }
            else if (i - index <= k)
            {
                return true;
            }
            else
            {
                map.put(nums[i], i);
            }

        }
        return false;
    }

    public static void main(String[] args)
    {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,2);
        map.put(1,4);
        map.put(1,6);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }


    }
}
