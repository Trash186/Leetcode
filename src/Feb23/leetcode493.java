package Feb23;

/**
 * @author Baller_Xiao
 * @Description
 * 493 给定一个数组 nums ，如果 i < j 且 nums[i] > 2*nums[j] 我们就将 (i, j) 称作一个重要翻转对。
 *
 * 你需要返回给定数组中的重要翻转对的数量。
 *
 * 

 * @create_time 2021-02-23 1:01
 * @return
 * @Version
 */
public class leetcode493
{
    private  int count;//计数
    public int reversePairs(int[] nums)
    {
        count = 0;
        mergeSort(nums,0,nums.length-1);
        return count;
    }

    //归并排序
    public void mergeSort(int []nums,int start,int end)
    {
        if(start>=end)
        {
            return ;
        }
        int mid=(start+end) / 2;;
        mergeSort(nums,start,mid);
        mergeSort(nums,mid+1,end);
        Merge(nums,start,mid,end);
    }


    public void Merge(int nums[],int start,int mid,int end)
    {
        //把原数组分割成一左一右

        int leftLength=mid-start+1;//定义左数组长度
        int rightLength=end-mid;//定义右数组长度

        int L[]=new int[leftLength];
        int R[]=new int[rightLength];
        int i,k,j;
        for(i=0,k=start;i<leftLength;i++,k++)
        {
            L[i]=nums[k];//分到左数组
        }
        for(j=0;j<rightLength;j++,k++)
        {
            R[j]=nums[k];//分到右数组
        }
        for(i=0,j=0;i<leftLength&&j<rightLength;)
        {
            if(L[i]>2*(long)R[j])
            {
                count+=(leftLength-i);
                j++;
            }
            else
            {
                i++;
            }
        }
        for(i=0,j=0,k=start;i<leftLength && j<rightLength ;k++)//合并左右数组
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
        if(j<rightLength)
        {
            for(;j<rightLength;j++,k++)
            {
                nums[k]=R[j];
            }
        }
        if(i<leftLength)
        {
            for(;i<leftLength;i++,k++)
            {
                nums[k]=L[i];
            }
        }

    }
}
