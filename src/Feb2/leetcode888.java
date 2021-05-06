package Feb2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Baller_Xiao
 * @Description
 * 爱丽丝和鲍勃有不同大小的糖果棒：A[i] 是爱丽丝拥有的第 i 根糖果棒的大小，B[j] 是鲍勃拥有的第 j 根糖果棒的大小。
 *
 * 因为他们是朋友，所以他们想交换一根糖果棒，这样交换后，他们都有相同的糖果总量。（一个人拥有的糖果总量是他们拥有的糖果棒大小的总和。）
 *
 * 返回一个整数数组 ans，其中 ans[0] 是爱丽丝必须交换的糖果棒的大小，ans[1] 是 Bob 必须交换的糖果棒的大小。
 *
 * 如果有多个答案，你可以返回其中任何一个。保证答案存在。
 *
 * 简单来说，就是两两彼此交换，合相等
 * 使用哈希表，先sumA-x+y=sumB-y+x
 * x=y+(sumA-sumB)/2
 *
 * @create_time 2021-02-02 22:51
 * @return
 * @Version
 */
public class leetcode888
{
    public int[] fairCandySwap(int[] A, int[] B)
    {
        int sumA= Arrays.stream(A).sum();
        int sumB=Arrays.stream(B).sum();


        int[] res=new int [2];
        int delta=(sumA-sumB)/2;

        Set<Integer> set=new HashSet<>();
        for(int nums:A)
        {
            set.add(nums);
        }
        for(int y:B)
        {
            int x=y+delta;
            if(set.contains(x))
            {
                res[0]=x;
                res[1]=y;
                break;
            }
        }
        return res;
    }
}
