package Feb18;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author Baller_Xiao
 * @Description归并排序
 * @create_time 2021-02-18 17:33
 * @return
 * @Version
 */
public class leetcode912
{
    public static void mergeSort(int []nums,int start,int end)
    {
        if(start>=end)
        {
            return ;
        }
        int mid=(start+end)/2;
        mergeSort(nums,start,mid);
        mergeSort(nums,mid+1,end);
        merge(nums,start,mid,end);
    }
    public static void merge(int []nums,int start,int mid,int end)
    {
        int leftLength=mid-start+1;
        int rightLength=end-mid;
        int []L=new int[leftLength];
        int []R=new int[rightLength];

        int i,k,j;
        for(i=0,k=start;i<leftLength;i++,k++)
        {
            L[i]=nums[k];
        }
        for(j=0;j<rightLength;j++,k++)
        {
            R[j]=nums[k];
        }
        for(i=0,j=0,k=start;i<leftLength&&j<rightLength;k++)
        {
            if(L[i]<R[j])
            {
                nums[k]=L[i++];
            }
            else
            {
                nums[k]=R[j++];
            }

        }
        if(i<leftLength)
        {
            for(;i<leftLength;i++,k++)
            {
                nums[k]=L[i];
            }
        }
        if(j<rightLength)
        {
            for(;j<rightLength;j++,k++)
            {
                nums[k]=R[j];
            }
        }
    }

    public static void main(String[] args)
    {
        int nums[]={2,30,23,-1,-23};
        sortArray(nums);
    }
    public static void sortArray(int[] nums)
    {
        mergeSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
