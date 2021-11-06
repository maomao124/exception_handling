import java.io.IOException;

/**
 * Project name(项目名称)：异常处理
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/6
 * Time(创建时间)： 13:19
 * Version(版本): 1.0
 * Description(描述)： 异常（exception）是在运行程序时产生的一种异常情况
 * 在 Java 中一个异常的产生，主要有如下三种原因：
 * Java 内部错误发生异常，Java 虚拟机产生的异常。
 * 编写的程序代码中的错误所产生的异常，例如空指针异常、数组越界异常等。
 * 通过 throw 语句手动生成的异常，一般用来告知该方法的调用者一些必要信息。
 * Java 通过面向对象的方法来处理异常。在一个方法的运行过程中，如果发生了异常，则这个方法会产生代表该异常的一个对象，并把它交给运行时的系统，
 * 运行时系统寻找相应的代码来处理这一异常。
 * 我们把生成异常对象，并把它提交给运行时系统的过程称为拋出（throw）异常。运行时系统在方法的调用栈中查找，
 * 直到找到能够处理该类型异常的对象，这一个过程称为捕获（catch）异常。
 * Java中常见运行时异常
 * 异常类型	说明
 * ArithmeticException	算术错误异常，如以零做除数
 * ArraylndexOutOfBoundException	数组索引越界
 * ArrayStoreException	向类型不兼容的数组元素赋值
 * ClassCastException	类型转换异常
 * IllegalArgumentException	使用非法实参调用方法
 * lIIegalStateException	环境或应用程序处于不正确的状态
 * lIIegalThreadStateException	被请求的操作与当前线程状态不兼容
 * IndexOutOfBoundsException	某种类型的索引越界
 * NullPointerException	尝试访问 null 对象成员，空指针异常
 * NegativeArraySizeException	再负数范围内创建的数组
 * NumberFormatException	数字转化格式异常，比如字符串到 float 型数字的转换无效
 * TypeNotPresentException	类型未找到
 * Java常见非运行时异常
 * 异常类型	           说明
 * ClassNotFoundException	没有找到类
 * IllegalAccessException	访问类被拒绝
 * InstantiationException	试图创建抽象类或接口的对象
 * InterruptedException	线程被另一个线程中断
 * NoSuchFieldException	请求的域不存在
 * NoSuchMethodException	请求的方法不存在
 * ReflectiveOperationException	与反射有关的异常的超类
 * <p>
 * 常见的 Error 和 Exception：
 * 1）运行时异常（RuntimeException）：
 * NullPropagation：空指针异常；
 * ClassCastException：类型强制转换异常
 * IllegalArgumentException：传递非法参数异常
 * IndexOutOfBoundsException：下标越界异常
 * NumberFormatException：数字格式异常
 * 2）非运行时异常：
 * ClassNotFoundException：找不到指定 class 的异常
 * IOException：IO 操作异常
 * 3）错误（Error）：
 * NoClassDefFoundError：找不到 class 定义异常
 * StackOverflowError：深递归导致栈被耗尽而抛出的异常
 * OutOfMemoryError：内存溢出异常
 */

public class test
{
    /*
    public static void a(int i)
    {
        if (i == 0)
        {
            return;
        }
        else
        {
            a(i++);
        }
    }

    public static void main(String[] args)
    {
        test.a(5);
    }
     */
    public static void main(String[] args)
    {
        try
        {
            NoExceptionModified.main(null);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            NoException.main(null);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
