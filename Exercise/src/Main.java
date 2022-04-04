public class Main {
    public static void main(String[] args)
    {
        NumberUtilTester.run();

    }

    class NumberUtilTester {
        public static void run()
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);
            System.out.print("Birinci sayıyı giriniz:");
            int a = Integer.parseInt(kb.nextLine());
            System.out.print("İkinci sayıyı giriniz:");
            int b = Integer.parseInt(kb.nextLine());
            System.out.print("üçüncü sayıyı giriniz:");
            int c = Integer.parseInt(kb.nextLine());
            NumberUtil.printOrderNumber(a, b, c);
            System.out.println(" ");
            System.out.format("mid: %d ",NumberUtil.mid(a,b,c));
            System.out.println(" ");
            System.out.print("Bir sayıyı giriniz:");
            int number = Integer.parseInt(kb.nextLine());
            System.out.format("%d ",NumberUtil.signum(number));

        }
    }

    class NumberUtil {

        public static void printOrderNumber(int a, int b, int c)
        {
            if (isInputsEqual(a, b, c)) {
                printOrderForEqual(a, b, c);
            } else {
                printOrderNotEqual(a, b, c);
            }
        }

        public static void printOrderNotEqual(int a, int b, int c)
        {
            if (a < b && a < c && b < c) {
                System.out.format("%d < %d < %d", a, b, c);
            } else if (b < a && b < c && a < c) {
                System.out.format("%d < %d < %d", b, a, c);
            } else if (c < a && c < b && a < b) {
                System.out.format("%d < %d < %d", c, a, b);
            } else if (c < a && c < b && b < a) {
                System.out.format("%d < %d < %d", c, b,a);
            } else if (b < a && c < a && b < c) {
                System.out.format("%d < %d < %d", b, c,a);
            } else {
                System.out.format("%d < %d < %d", a, c, b);
            }
        }

        public static void printOrderForEqual(int a, int b, int c)
        {
            if (a == b && b == c) {
                System.out.format("%d = %d = %d", a, b, c);
            } else if (a == b && b < c) {
                System.out.format("%d = %d < %d", a, b, c);
            } else if (a == c && a < b) {
                System.out.format("%d = %d < %d", a, c, b);
            } else if (b == c && b < a) {
                System.out.format("%d = %d < %d", b, c, a);
            } else if (a == c && b < a) {
                System.out.format("%d < %d = %d", b, c, a);
            }  else if (a == b && c < b) {
                System.out.format("%d < %d = %d",c, b, a);
            }else {
                System.out.format("%d < %d = %d", a, b, c);
            }
        }

        public static boolean isInputsEqual(int a, int b, int c)
        {
            return a == b || b == c || a == c;
        }

        public static int mid(int a, int b, int c){
            if (isInputsEqual(a,b,c))
            {
             return findMidForEqual(a,b,c);
            } else {
             return findMidForNotEqual(a,b,c);
            }
        }

        public static int findMidForNotEqual(int a, int b, int c)
        {
          if( a > b && a > c && b > c)
          {
              return b;
          } else if(b > a && b > c && a > c) {
              return a;
          } else if (c > a && c > b && b > a) {
              return b;
          } else if (a > b && a > c && c > b) {
              return c;
          } else if (c > a && c > b && a > b) {
            return a;
        } else {
              return c;
          }
        }

        public static int findMidForEqual(int a, int b, int c)
        {
            if(a == b && b == c)
            {
                return a;
            } else if(a == c && b < a) {
                return a;
            } else if(a == b && b < c) {
                return b;
            } else  {
                return c;
            }
        }

        public static int signum(int number)
        {
            if (number == 0) {
                return 0;
            } else if (number < 0) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
