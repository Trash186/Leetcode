package Feb18;

import java.util.Arrays;

/**
 * @author Baller_Xiao
 * @Description数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *
 *
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 *中间的值是出现次数最多的
 * @create_time 2021-02-20 0:33
 * @return
 * @Version
 */
public class Jianzhi39
{
    public int majorityElement(int[] nums)
    {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
