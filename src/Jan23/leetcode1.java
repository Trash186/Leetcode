package Jan23;

import java.util.HashMap;

/**
 * @author Baller_Xiao
 * @Description
 * 两数相加
 * 1、暴力法
 * 2、哈希表
 * @create_time 2021-01-23 2:07
 * @return
 * @Version
 */
public class leetcode1
{
    public int[] twoSum (int[] numbers, int target)
    {
        // write code here
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i]+numbers[j]==target)
                {
                    return new int[]{i+1,j+1};
                }
            }
        }
        return null;
    }

    public int[] twoSum1(int[] numbers, int target)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        // write code here
        for(int i=0;i<numbers.length;i++)
        {

            if(map.containsKey(target-numbers[i]))
            {
                return new int[]{map.get(target-numbers[i])+1,i+1};
            }
            map.put(numbers[i],i);
        }
        return null;
    }
}
