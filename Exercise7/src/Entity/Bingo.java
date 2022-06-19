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
        for(int i = 0; i < 30_000; i++) {
            s1 = new Stamp();
            s2 = new Stamp();
            s3 = new Stamp();

            if (isDuplicate(s1, s2)) {
                while (s2 != s1)
                    s2 = new Stamp();
            }

            if (isDuplicate(s1, s2, s3)) {
                while (s3 != s2 && s3 != s1) {
                    s3 = new Stamp();
                }

            }

            if (isGameWon(s1, s2, s3)) {
                winCounter++;
            }

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
        return Math.max(Math.max(s1.val, s2.val), s3.val)  - Math.min(Math.min(s1.val, s2.val), s3.val) > NumberUtil.findMid(s1.val,s2.val,s3.val);
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
