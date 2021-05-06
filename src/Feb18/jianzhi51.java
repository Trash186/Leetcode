package Feb18;

/**
 * @author Baller_Xiao
 * @Description在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。
 * 使用归并排序思想，很快解决
 * 注意一点，count=leftLength-i
 * mid是绝对中值
 * @create_time 2021-02-18 22:31
 * @return
 * @Version
 */
public class jianzhi51
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
        for(i=0,j=0,k=start;i<leftLength && j<rightLength ;k++)//合并左右数组
        {
            if(L[i]<=R[j])
            {
                nums[k]=L[i++];
            }
            else
            {

                count += leftLength-i;
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
