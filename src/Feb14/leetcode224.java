package Feb14;

/**
 * @author Baller_Xiao
 * @Description计算n之内的质数
 * @create_time 2021-02-13 1:30
 * @return
 * @Version
 */
public class leetcode224
{
//    public int countPrimes(int n)
//    {
//        int count=0;
//        if(n==1||n==0)
//        {
//            return 0;
//        }
//        for(int i=2;i<Math.sqrt(n);i++)
//        {
//            if(n%i!=0)
//            {
//                count++;
//            }
//
//        }
//        return count;
//    }错误写法，只能判断一个数是否为质数

    //正确写法
    class Solution {
        public int countPrimes(int n) {
            int cnt = 0;
            for (int i = 2; i < n; i++) {
                if (isPrime(i)) {
                    cnt++;
                }
            }
            return cnt;
        }

        private boolean isPrime(int num) {
            int max = (int)Math.sqrt(num);
            for (int i = 2; i <= max; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


}
