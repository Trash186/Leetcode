package Jan23;

/**
 * @author Baller_Xiao
 * @Description
 * @create_time 2021-01-23 18:55
 * @return
 * @Version
 */
public class niuke_jinzhizhuanhuan
{
    public String solve(int M,int n)
    {
        String res="";
        String s="0123456789ABCDEF";
        boolean flag=false;

        if(M<0)
        {
            flag=true;
            M=-M;
        }
        while(M!=0)
        {
            res+=s.charAt(M%n);
            M/=n;
        }
        if(flag==true)
        {
            res+="-";
        }
        StringBuffer sb=new StringBuffer(res);
        return sb.reverse().toString();
    }

}
