package Jan19;

/**
 * @author Baller_Xiao
 * @Description
 * 将数组向右移动k个位置（翻转数组）
 * 法一：再造一个临时数组，然后将数组的值和原先数组的值一致
 * 然后在将原先数组的索引对应值重新赋值
 *
 * 法二：
 * 本题是右旋转，其实就是反转的顺序改动一下，优先反转整个字符串，步骤如下：
 * 反转整个字符串
 * 反转区间为前k的子串
 * 反转区间为k到末尾的子串
 * @create_time 2021-01-19 22:53
 * @return
 * @Version
 */
public class leetcode189
{
    public void rotate(int []nums,int k)
    {
        int []temp=new int[nums.length];
        for(int i=0;i< nums.length;i++)
        {
            temp[i]=nums[i];
        }
        for(int i=0;i< nums.length;i++)
        {
            nums[(k+i)% nums.length]=temp[i];
        }
    }
    public void rotate1(int []nums,int k)
    {
        int length=nums.length;
        k=k%length;
        reverse(nums,0,length-1);
        reverse(nums,0,k-1);
        reverse(nums,length,length-1);
    }
    public  static void reverse(int []nums,int start,int end)
    {
        for(int i=start,j=end;i<j;i++,j--)
        {
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
        }
    }

}
