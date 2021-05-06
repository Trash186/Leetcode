package Feb5;

/**
 * @author Baller_Xiao
 * @Description
 * 三总硬币 2元、5元、7元，买一本书需要27元，如何用最少的硬笔组合付清
 * 动态规划通常需要开一个数组 就像数学中的X，Y，Z
 * 确定状态需要两个意识：
 * 1、最后一步  最后一枚硬币 ak,前面的27-ak
 * 我们不关心前面的k-1枚硬币是怎么拼出的27-ak的，可能有1种，可能有100种，但是我我们呢确定前面
 * 的硬币拼出了27-ak
 * 拼出27-ak的硬币数一定要最少，否则就不是最优策略
 * 2、子问题 最少用多少枚硬币可以拼出27-ak
 *
 * 设状态f(x)=最少用多少枚硬币拼出x
 * ak代表最后一枚硬币
 * 如果ak=2，则f(27)应该是f(27-2)+1
 * 如果ak=5，则f(27)应该是f(27-5)+1
 * 如果ak=7，则f(27)应该是f(27-7)+1
 * f(27)=min{f(27-2)+1,f(27-5)+1,f(27-7)+1}
 *
 * 初始条件 f[0]=0
 * @create_time 2021-02-05 23:27
 * @return
 * @Version
 */
public class lintCode669
{
    public int coinChange(int []A,int M)
    {
        int [] f=new int[M+1];//0...n [n+1]
        //0...n-1  [n]
        int n=A.length;

        f[0]=0;//初始化
        for(int i=1;i<=M;i++)
        {
         f[i]=Integer.MAX_VALUE;
         //f[i]=min{f[i-A[0]]+1,.....,f[i-A[n-1]]+1}
            for(int j=0;j<n;j++)
            {
                if(i>=A[j]&&f[i-A[j]]!=Integer.MAX_VALUE)//如果怎么都拼不出27元
                {
                    f[i]=Math.min(f[i-A[j]]+1,f[i]);
                }

            }
        }
        if(f[M]==Integer.MAX_VALUE)
        {
            f[M]=-1;
        }
        return f[M];
    }

}
