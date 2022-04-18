public class Main {
    public static void main(String[] args)
    {
        NumberUtilTester.run();
    }
}

class NumberUtilTester {
    public static void run()
    {
        NumberUtil.printUltimatePrime();
        System.out.println("----------------------------------------------------------------");
        System.out.format("%b%n ", NumberUtil.isPrimeX(113));
        System.out.println("----------------------------------------------------------------");
        System.out.format("%d%n ", NumberUtil.calculateDigitalRoot(36987));
        System.out.println("----------------------------------------------------------------");
        NumberUtil.isSuperPrime(18);
        System.out.println("----------------------------------------------------------------");

    }
}

class NumberUtil {
    public static void printHardyRamanjuan(int number)
    {
        //...
    }

    public static boolean isSuperPrime(int number)
    {
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (isPrime(i))
                count++;

            if (isPrime(count) && isPrime(i)) {
                System.out.format("%d --> %d%n", count, i);
            }
        }
        return true;
    }

    public static int calculateDigitalRoot(int number)
    {
        while (true) {
            number = sumDigits(number);
            if (number < 10)
                return number;
        }
    }

    public static boolean isPrimeX(int number)
    {
        for (; ; ) {
            if (isPrime(number)) {
                number = calculateDigitalRoot(number);
                if (number < 10 && isPrime(number))
                    return true;
            } else {
                return false;
            }
        }
    }

    public static void printUltimatePrime()
    {
        for (int i = 100; i <= 999; i++) {
            if (isUltimatePrime(i))
                System.out.format("%d ", i);
        }
        System.out.println("");
    }

    public static boolean isUltimatePrime(int number)
    {
        boolean isReverseBigger = reversed(number) > number;
        boolean is3digitsPrime = isPrime(number) && isPrime(reversed(number));
        boolean is2digitsPrime = isPrime(findAbDigit(number)) && isPrime(findBaDigit(number)) && isPrime(findBcDigit(number)) && isPrime(findCbDigit(number));
        return isReverseBigger && is3digitsPrime && is2digitsPrime;
    }

    public static int reversed(int val)
    {
        int reversedVal = 0;
        while (val != 0) {
            reversedVal = reversedVal * 10 + val % 10;
            val /= 10;
        }
        return reversedVal;
    }

    public static int sumDigits(int val)
    {
        int sum = 0;
        while (val != 0) {
            sum += val % 10;
            val /= 10;
        }
        return sum;
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

    public static int factoriel(int number)
    {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public static int findBcDigit(int val)
    {
        return val % 100;
    }

    public static int findBaDigit(int val)
    {
        return reversed(val) % 100;
    }

    public static int findAbDigit(int val)
    {
        val /= 10;
        return val % 100;
    }

    public static int findCbDigit(int val)
    {
        val = reversed(val);
        val /= 10;
        return val % 100;
    }

}




