package Jan18;

/**
 * @author Baller_Xiao
 * @Description
 * 翻转整数
 * @create_time 2021-01-18 16:23
 * @return
 * @Version
 */
public class leetcode7
{
    public static int reverse(int x)
    {

        if(x==0)
        {
            return 0;
        }
        int reverseInt=0;
        while(x!=0)
        {
            int pop=x%10;
            x=x/10;
            reverseInt=reverseInt*10+pop;
        }
      return  reverseInt;
    }

    public static void main(String[] args)
    {
        int reverse = reverse(120);
        System.out.println(reverse);
    }

}
