package Jan18;

import java.util.LinkedList;

/**
 * @author Baller_Xiao
 * @Description
 * 回文数
 * 第一种解法，就是直接搞成字符串
 * 第二种解法，对半查找，在x>reverse_int的情况下从后往前搞掉数字，
 * 当x==reverse_int 或者x=reverse_int/10的情况下（12321），return true
 * @create_time 2021-01-18 14:18
 * @return
 * @Version
 */
public class leetcode9
{
    public static boolean isPalindrome(int x)
    {
        LinkedList<Integer> list1=new LinkedList<>();
        LinkedList<Integer> list2=new LinkedList<>();
        if(x<0)
        {
            return false;
        }
        if(x%10==0)
        {
            return false;
        }
        while(x!=0)
        {
            int temp=x%10;
            list1.add(temp);
            list2.addFirst(temp);
            x=x/10;
        }

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1.equals(list2));
        return list1==list2;
    }
    public boolean isPalindrome1(int x)
    {

        if(x==0)
        {
            return true;
        }
        if(x<0)
        {
            return false;
        }
        if(x%10==0)
        {
            return false;
        }
        int reverse_int=0;
        while(x>reverse_int)
        {
            int pop=x%10;
            x=x/10;
            reverse_int=(reverse_int*10)+pop;
        }

        if(x==reverse_int||x==reverse_int/10)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static void main(String[] args)
    {
        isPalindrome(1234);
    }


}
