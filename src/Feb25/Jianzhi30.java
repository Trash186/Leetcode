package Feb25;

/**
 * @author Baller_Xiao
 * @Description输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数
 * 组成一个子数组。求所有子数组的和的最大值。要求时间复杂度为 O(n).
 *
 * 1、暴力法 三层循环求和
 * 2、动态规划
 *
 * @create_time 2021-02-25 17:18
 * @return
 * @Version
 */
public class Jianzhi30
{
    public int FindGreatestSumOfSubArray1(int []array)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++)
        {
            for(int j=i;j<array.length;j++)
            {
                int tempSum=0;
                for(int k=i;k<=j;k++)
                {
                    tempSum+=array[k];
                }
                max=Math.max(max,tempSum);
            }
        }
        return max;
    }

    public int FindGreatestSumOfSubArray(int []array)
    {
        int dp[]=new int [array.length];
        int res=array[0];
         dp[0]=array[0];

        for (int i = 1; i <array.length ; i++)
        {
            //dp[i]=dp[i-1]+array[i]
            //如果dp[i-1]>0 那就相加
            //dp[i-1]<0 直接加0

            dp[i]=Math.max(dp[i-1],0)+array[i];
            res=Math.max(dp[i],res);
        }

        return res;
    }
}
