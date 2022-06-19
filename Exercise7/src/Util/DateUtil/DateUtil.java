package Util.DateUtil;

public class DateUtil {
    public static boolean isLeapYear(int year)
    {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static boolean isValidDate(int day, int month, int year)
    {
        return 1 <= day && day <= 31 && 1 <= month && month <= 12 && day <= getDays(month, year);
    }

    public static int getDays(int month, int year)
    {
        int days = 31;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                if (isLeapYear(year))
                    ++days;
        }

        return days;
    }
}
