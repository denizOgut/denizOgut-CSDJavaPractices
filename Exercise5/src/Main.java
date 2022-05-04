public class Main {
    public static void main(String[] args)
    {
        System.out.println(NumberUtil.sumFactors(18));
        System.out.println("********************************************");
        System.out.println(NumberUtil.areFriends(220,284));
        System.out.println("********************************************");
        System.out.println(NumberUtil.isPerfect(28));
        System.out.println("********************************************");
        NumberUtil.findPerfectNumber();
        System.out.println("********************************************");
        NumberUtil.findFriendsNumber();
    }

}

class NumberUtil {

    public static int sumFactors(int number)
    {
        int sum = 0;
        for(int i = 1; i < number; i++) {
            if(number % i == 0)
            {
                sum += i;
            }

        }
        return sum;
    }

    public static boolean areFriends(int x , int y)
    {
        return sumFactors(x) == y && sumFactors(y) == x;
    }

    public static boolean isPerfect(int number)
    {
        return sumFactors(number) == number;
    }

    public static void findPerfectNumber()
    {
        for(int i = 1000; i < 10_000; i++) {
            if (sumFactors(i) == i)
                System.out.format("%d%n",i);
        }
    }

    public static  void  findFriendsNumber()
    {
        for (int i = 1000; i <= 9999; i++) {
            for (int j = i; j <= 9999; j++) {
                if(areFriends(i,j))
                {
                    System.out.format("%d , %d ",i,j);
                }
            }
        }
    }

}
