package classes;

public class Main {
    public static void main(String[] args)
    {
        Calculator calculator  = new Calculator();

        double a=0; // введите число
        double b=0; // введите число

        System.out.println("метод сумма чисел = " + calculator.add(a,b));
        System.out.println("метод разность чисел = " + calculator.adb(a,b));
        calculator.adc(a,b);
        calculator.adl(a,b);

    }
}