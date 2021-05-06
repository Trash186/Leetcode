import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author zhangyu
 * @Description: 利用双倍均值法进行随机计算；
 * 公平版
 * 用money/number *2
 * 每个人都在这个区间内
 * @date 2019/1/7 15:28
 **/
public class GeneratePacketsByDoubleMean
{
    public static List qianghongbao(double money,int number)
    {
        List<Double> result = new ArrayList<Double>();
        if(money<0&&number<1)
            return null;
        double amount,sum=0;
        int remainingNumber=number;
        int i=1;
        while(remainingNumber>1){
            //nextDouble只有无参？
          amount= nextDouble(0.01,2*(money/remainingNumber));
          Random random=new Random();

            sum+=amount;
            System.out.println("第"+i+"个人领取的红包金额为："+format(amount));
            money -= amount;
            remainingNumber--;
            result.add(amount);
            i++;
        }
        result.add(money);
        System.out.println("第"+i+"个人领取的红包金额为："+format(money));
        sum+=money;
        System.out.println("验证发出的红包总金额为："+format(sum));

        return result;
    }

    public static double nextDouble(final double min, final double max) {
        return min + ((max - min) * new Random().nextDouble());
    }

    public static String format(double value) {

        return new java.text.DecimalFormat("0.00").format(value); // 保留两位小数
    }

    public static void main(String[] args)
    {
       qianghongbao(100, 3);
    }
}