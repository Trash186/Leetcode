package Feb3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Baller_Xiao
 * @Description约瑟夫环
 * 0, 1,···,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字（删除后从下一个数字开始计数）。求出这个圆圈里剩下的最后一个数字。
 *
 * 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
 *
\反推就行
总结一个公式：
(当前index + m) % 上一轮剩余数字的个数
 * @create_time 2021-02-03 21:38
 * @return
 * @Version
 */
public class LeetCode62
{
    public void lastRemaining(int m,int n)
    {
        int ans=0;//当前下标
        //最后一轮剩下2个人，所以从2开始反推
        for(int i=2;i<=n;i++)
        {
            ans=(ans)%i;
        }
    }

    public static void main(String[] args)
    {
        Map<Short, String> map = new HashMap<>();
        for(short i = 0; i <100; i++) {
            map.put(i, String.valueOf(i));
            map.remove(i-1);
        }
        System.out.println(map.size());
    }


}
