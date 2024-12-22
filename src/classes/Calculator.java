package classes;

public class Calculator {
//===================================

    // метод суммы
    public static double add(double a, double b) {
        return a + b;
    }

    // метод разности
    public static double adb(double a, double b) {
        return a - b;
    }

    // метод произведения
    public static void adc(double a, double b) {
        if ((a != 0) || (b != 0)) {
            System.out.println("метод произведения числа = " + (a * b));
        } else {
            System.out.println("умножение на 0 не возможн");
        }
    }

    // метод частного
    public static void adl(double a, double b) {
        if ((a != 0) || (b != 0)) {
            System.out.println("метод частного числа = " + (a / b));
        } else {
            System.out.println("деленее на 0 не возможн");
        }
    }
}