package Feb26;

/**
 * @author Baller_Xiao
 * @Description
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0
 * ～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 *1 暴力法
 * 2 二分法
 * @create_time 2021-02-26 17:03
 * @return
 * @Version
 */
public class Jianzhi53
{
    public int search(int nums[])
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i)
            {
                return i;
            }
        }
        return nums.length;//遍历完后仍然没有发现缺失元素，那就是最后那个
    }
    //二分法
    //如果nums[mid]==mid 说明左边没有，缩小范围
    public int search1(int nums[])
    {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==mid)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return start;
    }

}
