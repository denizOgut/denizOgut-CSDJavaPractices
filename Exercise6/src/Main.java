public class Main {
    public static void main(String[] args)
    {
        CrapsSimulator.run(100_000,CrapsSimulator.craps());
    }
}

class CrapsSimulator{


    public static void run(int tourCount, int winningCount)
    {
        double p = winningCount / (double)tourCount;
        System.out.format("Probability --> %f%n",p);
    }

    public static int craps ()
    {

        int result = 0;
        int winningCounter = 0;
        int loosingCounter = 0;
        for(int i = 1; i <= 100_000; i++) {

            while(true) {
                Dice d1 = new Dice();
                Dice d2 = new Dice();
                result = d1.value + d2.value;
                if (winningCondition(d1,d2))
                {
                    winningCounter++;
                    //System.out.format("Sum --> %d || winningCounter --> %d%n ",result,winningCounter);
                    break;
                } else if(loosingCondition(d1,d2)) {
                    loosingCounter++;
                    //System.out.format("Sum --> %d || loosingCounter --> %d%n ",result,loosingCounter);
                    break;
                } else {
                    //System.out.format("RESULT: %d%n",result);
                    while(true) {
                        int tempResult = d1.value + d2.value;
                        if (tempResult == 7 ) {

                            loosingCounter++;
                            //System.out.format("tempResult --> %d || loosingCounter --> %d%n ",tempResult,loosingCounter);
                            break;
                        }

                        if (tempResult == result)
                            winningCounter++;
                            //System.out.format("tempResult --> %d || winningCounter --> %d%n ",tempResult,loosingCounter);
                            break;
                    }
                }
            }
        }

            return winningCounter;
    }

    public static boolean winningCondition(Dice d1, Dice d2)
    {
        return d1.value + d2.value == 7 || d1.value + d2.value == 11;
    }

    public static boolean loosingCondition(Dice d1, Dice d2)
    {
        return d1.value + d2.value == 2 || d1.value + d2.value == 3 || d1.value + d2.value == 12 ;
    }
}

class Dice {

    public int value;

    public Dice()
    {
        java.util.Random r = new java.util.Random();
        this.value = r.nextInt(6);
    }
}
