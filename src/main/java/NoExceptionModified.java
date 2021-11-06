import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

/**
 * Project name(项目名称)：异常处理
 * Package(包名): PACKAGE_NAME
 * Class(类名): NoExceptionModified
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/6
 * Time(创建时间)： 13:27
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class NoExceptionModified
{
    public static void main(String[] args) throws IOException
    {
        String numBoxesIn;
        int numBoxes;
        double boxPrice = 3.25;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("有多少个盒子：");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        numBoxesIn = in.readLine();
        try
        {
            numBoxes = Integer.parseInt(numBoxesIn);
            System.out.println("盒子的总价值是：");
            System.out.println(currency.format(numBoxes * boxPrice));
        }
        catch (NumberFormatException e)
        {
            System.out.println("输入的不是一个整数。");
        }
    }
}
