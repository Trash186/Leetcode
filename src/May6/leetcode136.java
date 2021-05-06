package May6;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Baller_Xiao
 * @Description
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 * @create_time 2021-05-06 11:18
 * @return
 * @Version
 */
public class leetcode136
{
    //方法一:
    //使用hashset，如果重复，则移除，然后得到第一个元素
    public int singleNumber(int []nums)
    {
        Set<Integer> set=new HashSet();
        for(int i=0;i<nums.length;i++)
        {
            if(!set.add(nums[i]))
            {
                set.remove(nums[i]);
            }
        }
        return set.iterator().next();
    }


    //方法二：
    /**
     * 使用异或运算 ^
     * 任何数和0做异或运算都是本身
     * 任何数和自己做异或运算都是0
     * 异或运算满足交换律
     * 将数组的每一个元素做异或运算，最终得到的值就是唯一的元素
     *
     */

    public int singleNumber1(int nums[])
    {
        int single=0;
        for(int i=0;i<nums.length;i++)
        {
             single^=nums[i];
        }
        return single;
    }

}
