package Entity;

import Util.NumberUtil.NumberUtil;


public class Bingo {
    public Stamp stamp;

    public Bingo(Stamp stamp)
    {
        this.stamp = stamp;
    }

    public static int play()
    {
        Stamp s1 , s2 , s3;
        int winCounter = 0;

        s1 = new Stamp();
        s2 = new Stamp();
        s3 = new Stamp();

        if(isDuplicate(s1,s2))
        {
            s2 = new Stamp();
        }

        if(isDuplicate(s1,s2,s3))
        {
            s3 = new Stamp();
        }

        if(isGameWon(s1,s2,s3))
        {
            System.out.println("Game is won");// Sonucu gormek ıcın !
            winCounter++;
        }
        return winCounter;
    }

    public static boolean isGameWon(Stamp s1, Stamp s2, Stamp s3)
    {
     return winConditionFirst(s1,s2,s3) || winConditionSecond(s1,s2,s3) || winConditionThird(s1,s2,s3);
    }

    public static boolean winConditionFirst(Stamp s1, Stamp s2, Stamp s3)
    {
        return NumberUtil.sum(s1.val,s2.val,s3.val) < 150;
    }

    public static boolean winConditionSecond(Stamp s1, Stamp s2, Stamp s3)
    {
        return NumberUtil.isPrime(NumberUtil.sum(s1.val,s2.val,s3.val));
    }

    public static boolean winConditionThird(Stamp s1, Stamp s2, Stamp s3 )
    {
        return Math.max(Math.max(s1.val, s2.val), s3.val)  - Math.min(Math.min(s1.val, s2.val), s3.val) > NumberUtil.findMeanOfTree(s1.val,s2.val,s3.val);
    }

    public static boolean isDuplicate(Stamp s1, Stamp s2)
    {
        return  s2.val == s1.val;
    }

    public static boolean isDuplicate(Stamp s1, Stamp s2, Stamp s3)
    {
        return  s3.val == s1.val || s3.val == s2.val;
    }
}