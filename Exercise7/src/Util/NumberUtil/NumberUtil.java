package Util.NumberUtil;

public class NumberUtil {
    public static boolean isPrime(int a)
    {
        if (a <= 1)
            return false;

        if (a % 2 == 0)
            return a == 2;

        if (a % 3 == 0)
            return a == 3;

        if (a % 5 == 0)
            return a == 5;

        if (a % 7 == 0)
            return a == 7;

        for (long i = 11; i * i <= a; i += 2)
            if (a % i == 0)
                return false;

        return true;
    }

    public static int sum(int a, int b, int c)
    {
        return  a + b + c;
    }

    public static int  findMeanOfTree(int a, int b, int c) //...varargs ile yapılabilir.
    {
        return (a + b + c) / 3;
    }



}
