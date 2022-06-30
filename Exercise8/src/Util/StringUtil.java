package Util;

public class StringUtil {
    public static String findSubBrackets(String str)
    {
        int leftIdx = 0;
        int rightIdx = str.length() - 1;
        int leftBracketCounter = 0;
        int rightBracketCounter = 0;
        int rightBracketIdx = 0;
        int leftBracketIdx = 0;

        while (leftIdx != str.length() - 1 && rightIdx != 0) {
            Character cLeft = str.charAt(leftIdx);
            if(cLeft.equals('{'))
            {
                leftBracketCounter++;
                leftBracketIdx = leftIdx;
            }

            Character cRight = str.charAt(rightIdx);
            if(cRight.equals('}'))
            {
                rightBracketCounter++;
                rightBracketIdx = rightIdx;
            }

            leftIdx++;
            rightIdx--;
        }

        return leftBracketCounter == rightBracketCounter ? str.substring(leftBracketIdx + 1,rightBracketIdx) : "Wrong Input";
    }

    public static void printCharsByRows(String str)
    {
        for (int i = 0; i <= str.length(); ++i) {
            System.out.format("%s%n", str.substring(0,i));
        }
    }

    public static String putInBrackets(String str)
    {
        return "("+str.strip()+")";
    }

    public static String squeeze(String str1,String str2)
    {

        for (int i = 0; i <  str2.length(); i++) {
            Character c = str2.charAt(i);
            if (str1.contains(c.toString()))
            {
                str1 = str1.replaceAll(String.valueOf(c),"");
            }
        }
        return  str1;
    }

    public static String changeCase(String str)
    {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += String.valueOf(Character.isUpperCase(str.charAt(i)) ? Character.toLowerCase(str.charAt(i)) : Character.toUpperCase(str.charAt(i)));
        }
        return result;
    }

    public static boolean isIdentifier(String str)
    {
        return !Character.isDigit(str.charAt(0)) && !containsWhiteSpace(str) && !str.equals("") || (str.charAt(0) == '_' || str.charAt(0) == '$');
    }

    public static boolean containsWhiteSpace(String str)
    {

        for (int i = 0; i < str.length(); i++) {
            if(Character.isWhitespace(str.charAt(i)))
            {
                return true;
            }

        }
        return false;
    }
}
