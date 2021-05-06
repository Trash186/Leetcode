package Jan23;

/**
 * @author Baller_Xiao
 * @Description
 * 合并有序数组
 * 双指针 归并排序的思路
 * @create_time 2021-01-23 21:25
 * @return
 * @Version
 */
public class leetcode88
{
    public void merge(int []nums1,int m,int[]nums2,int n)
    {
        int i1=m-1;
        int i2=n-1;
        int i=m+n-1;
        while(i1>0&&i2>0)
        {
            if(nums1[i1]>nums2[i2])
            {
                nums1[i]=nums1[i1];
                i1--;
                i--;
            }
            else
            {
                nums1[i]=nums1[i2];
                i2--;
                i--;
            }
        }
        while(i2>=0)
        {
            nums1[i]=nums2[i2];
            i--;
            i2--;
        }

    }
}
