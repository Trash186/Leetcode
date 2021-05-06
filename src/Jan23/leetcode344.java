package Jan23;

import java.util.Arrays;

/**
 * @author Baller_Xiao
 * @Description翻转字符串
 * 方法一：开启一个新空间，倒序遍历，把值放进去
 * 方法二：双指针，做交换
 * @create_time 2021-01-23 19:17
 * @return
 * @Version
 */
public class leetcode344
{
    public String solve(String str)
    {

        StringBuffer sb=new StringBuffer();
        for(int i=str.length()-1;i>=0;i--)
        {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
