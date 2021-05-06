package April28;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *

 * @author Baller_Xiao
 * @Description
 * @create_time 2021-04-28 18:27
 * @return
 * @Version
 */
public class leetcode1
{
    //方法1：暴力法
//    public int[] twoSum(int[] nums, int target)
//    {
//        for(int i=0;i<nums.length;i++)
//        {
//            for(int j=i+1;j<nums.length;j++)
//            {
//                if(nums[i]+nums[j]==target)
//                {
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return null;
//    }
    //方法2：哈希表

    /**
     * 先判断哈希表中是否键（target-nums[i]）
     * 若没有，则把key-value放入哈希表中，key为值，value为索引值
     * 若有，则返回target-nums【i】的value值和nums【i】的索引值
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int []nums,int target)
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return null;

    }
}
