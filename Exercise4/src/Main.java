public class Main {
    public static void main(String[] args)
    {
        Util.calculate();
    }
}

class Util {
    public static boolean checkUserInput(int number)
    {
        return number <= 100 && number >= 0;
    }

    public static int askUserChoice()
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Yeni bir değer girmek istiyor musunuz? [Evet için 1(bir) Hayır için 0(sıfır) değerlerinden birini giriniz]:");
        return scanner.nextInt();
    }

    public static int askUserValue()
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Bir tamsayı giriniz: ");
        return scanner.nextInt();
    }

    public static void calculate ()
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double average = 0.0;
        int userChoice;
        int userValue;
        int inputCounter = 0;
        int sum = 0;
        while (true) {
            userChoice = Util.askUserChoice();
            if (userChoice == 1) {
                userValue = Util.askUserValue();
                if (Util.checkUserInput(userValue)) {
                    inputCounter++;
                    min = Math.min(min, userValue); // min < userValue ? min : userValue
                    max = Math.max(max, userValue); // max > userValue ? max : userValue
                    sum += userValue;
                    average = sum / inputCounter;
                } else {
                    while (!Util.checkUserInput(userValue)) {
                        System.out.println("Geçersiz bir değer girdiniz!...");
                        userValue = Util.askUserValue();
                    }
                    inputCounter++;
                    min = Math.min(min, userValue); // min < userValue ? min : userValue
                    max = Math.max(max, userValue); // max > userValue ? max : userValue
                    sum += userValue;
                    average = sum / inputCounter;
                }
            } else {
                System.out.format("Toplam %d deger girildi \n Max = %d%n Min = %d%n Ortalama = %.3f", inputCounter, max, min, average);
                break;
            }

        }
    }

}
