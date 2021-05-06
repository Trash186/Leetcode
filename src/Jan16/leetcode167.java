package Jan16;

import java.util.Arrays;

/**
 * @author Baller_Xiao
 * @Description
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 *
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 *
 * 使用双指针
 *
 * @create_time 2021-01-16 20:06
 * @return
 * @Version
 */
public class leetcode167
{
    public static int[] twoSum(int []numbers,int target)
    {
        for(int i=0,j= numbers.length-1;i<j;)
        {
            int sum=numbers[i]+numbers[j];
            if(sum>target)
            {
                j--;
            }
            else if(sum<target)
            {
                i++;
            }
            else
            {
                return new int[]{i+1,j+1};
            }
        }
        return null;
    }

    public static void main(String[] args)
    {
        int []array={2,7,11,15};
        int[] ints = twoSum(array, 9);
        System.out.println(Arrays.toString(ints));
    }
}
