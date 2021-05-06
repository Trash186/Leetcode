package Feb2;

/**
 * @author Baller_Xiao
 * @Description股票最大利润
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 *

 * @create_time 2021-02-02 22:01
 * @return
 * @Version
 */
public class offer62
{
    public int maxProfit(int[] prices)
    {
        if(prices==null||prices.length<=1)
        {
            return 0;
        }
        int res=0;
        int minPrice=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<minPrice)
            {
                minPrice=prices[i];
            }
            else
            {
                res=Math.max(res,prices[i]-minPrice);
            }
        }
        return res;
    }
}
