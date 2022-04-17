public class Main {
    public static void main(String[] args)
    {
        NumberUtilTester.run();
    }
}

class NumberUtilTester {

    public static void run()
    {
        NumberUtil.printDiamondPattern(6);
        NumberUtil.displayDuration(9000);
        NumberUtil.findPrimeFactors(1092);
        NumberUtil.printGoldBach(16);
        NumberUtil.printDesign(8,2);
    }

}

class NumberUtil {

    public static void printDiamondPattern(int number)
    {
        printDiamond(number);
        printReverseDiamond(number);
    }

    public static void printDiamond(int number)
    {
        int gap = number - 1;
        for (int i = 1; i <= number; i++) {
            for (int k = 1; k <= gap; k++) {
                System.out.print(" ");
            }
            gap--;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void printReverseDiamond(int number)
    {
        int gap = 1;
        for (int i = 1; i <= number - 1; i++) {
            for (int k = 1; k <= gap; k++) {
                System.out.print(" ");
            }

            gap++;
            for (int j = 1; j <= 2 * (number - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void displayDuration(long second)
    {
        int hours = (int) second / 3600;
        int minutes = (int) ((second / 60) % 60);
        int seconds = (int) second % 60;
        displayTimeByCondition(hours, minutes, seconds);
        System.out.println("");

    }

    public static void displayTimeByCondition(int hours, int minutes, int seconds)
    {
        if (hours == 0) {
            if (minutes == 0) {
                System.out.format("%d sec", seconds);
            } else if (seconds == 0) {
                System.out.format("%d min", minutes);
            } else {
                System.out.format("%d min %d sec", minutes, seconds);
            }

        } else if (minutes == 0) {
            if (hours == 0) {
                System.out.format("%d sec", seconds);
            } else if (seconds == 0) {
                System.out.format("%d hour", hours);
            } else {
                System.out.format("%d hour %d sec", hours, seconds);
            }

        } else if (seconds == 0) {
            if (hours == 0) {
                System.out.format("%d min", minutes);
            } else if (minutes == 0) {
                System.out.format("%d hours", hours);
            } else {
                System.out.format("%d hour %d min", hours, minutes);
            }

        } else {
            System.out.format("%d hour %d min  %d sec: ", hours, minutes, seconds);
        }
    }

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

        for (int i = 11; i * i <= a; i += 2)
            if (a % i == 0)
                return false;

        return true;
    }

    public static void findPrimeFactors(int number)
    {
        for (int i = 2; i <= number; i++) {
            if (isPrime(i) && number % i == 0) {
                number = number / i;
                System.out.format("%d ", i);
                i--;
            }

        }
        System.out.println("");

    }

    public static boolean isEven(int number)
    {
        return number % 2 == 0;
    }

    public static void printGoldBach(int number)
    {

        for (int i = 2; i <= number; i++) {
            for (int j = number; j >= i; j--) {
                boolean isPrime = isPrime(j) && isPrime(i);
                if (isEven(number) && isPrime && i + j == number) {
                    System.out.format("%d + %d = %d ", i, j, number);
                }
            }
        }
        System.out.println(" ");
    }

    public static void printDesign(int height,int width)
    {
        int temp = width;
        int gap = 1;
        for (int i = 0; i < height; i++)
        {
            System.out.format("%s %"+gap+"s %"+temp+"s","|","*","|");
            System.out.println("");
            if(gap == width) {
               while(gap != 1) {
                   gap--;
               }
            } else {
                gap++;
            }

            temp--;
            if (temp == 0)
                temp = width;
        }
    }
}
