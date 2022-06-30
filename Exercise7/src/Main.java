import Entity.Bingo;
import Entity.Date;
import Test.BingoTester;

public class Main {
    public static void main(String[] args)
    {
        BingoTester.run(30_000);
        Date d = new Date();
        System.out.println(d.printDate());
    }
}
