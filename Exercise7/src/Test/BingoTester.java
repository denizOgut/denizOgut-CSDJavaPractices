package Test;

import Entity.Bingo;

public class BingoTester {
    public static void run(int tourCount)
    {
        double p = Bingo.play() / (double)tourCount;
        System.out.format("Probability --> %f%n",p);
    }
}
