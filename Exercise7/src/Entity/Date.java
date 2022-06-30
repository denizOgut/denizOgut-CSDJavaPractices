package Entity;

import Util.DateUtil.DateUtil;
import Util.NumberUtil.NumberUtil;

import java.util.Random;

public class Date {
  public  int day, month, year;

    public Date()
    {
        Random r = new Random();
        day = r.nextInt(1,32);
        month = r.nextInt(1,13);
        year = r.nextInt(1900,2101);
        if( day == 28 && DateUtil.isLeapYear(year) && month == 2)
        {
            ++day;
        }
    }


    public  String printDate()
    {


        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
