package Feb18;

/**
 * @author Baller_Xiao
 * @Description
 * 将字符串转换成数字
 * 写一个函数 StrToInt，实现把字符串转换成整数这个功能。不能使用 atoi 或者其他类似的库函数。
 * res=res*10+x
 * 考虑边界条件
 * 1、res>binary
 * 2、res=binary切x>7
 *
 * 2^31=2 147 483 648
 * -2^31----2^31-1
 * 2^31-1=2 147 483 647
 * binary=2 147 483 64
 * @create_time 2021-02-23 18:04
 * @return
 * @Version
 */
public class jianzhi67
{
    public int strToInt(String str)
    {
        char []ch=str.trim().toCharArray();
        if(ch.length==0)
        {
            return 0;
        }
        int sign=1,i=1;
        int res=0;
        int binary=Integer.MAX_VALUE/10;
        if(ch[0]=='-')
        {
            sign=-1;
        }
        else if(ch[0]!='+')
        {

            i=0;
        }
        for(int j=i;j<ch.length;j++)
        {
            if(ch[j]<'0'||ch[j]>'9')
            {
                break;
            }
            if(res>binary||res==binary&&ch[j]>'7')
            {
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            res=res*10+(ch[j]-'0');
        }
        return res*sign;
    }
}
