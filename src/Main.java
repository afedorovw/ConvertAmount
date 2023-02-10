import java.util.Scanner;

public class Main {
    static final double ROUBLES_PER_DOLLAR = 72.12;

    public static void main(String[] args) {

        int[] dollarsArray;
        double[] roublesArray;
        int n, i;

        Scanner input = new Scanner(System.in);

        instruct();

        do {
            System.out.print("Введите количество конвертаций: ");
            n = input.nextInt();
        } while (n <= 0);

        System.out.print("Введите " + n + " сумму денег в долларах США через пробел: ");
        dollarsArray = new int[n];
        for (i = 0; i < n; i++) dollarsArray[i] = input.nextInt();

        roublesArray = find_roubles(dollarsArray, n);

        System.out.println("\n Сумма, Р  Сумма, $");
        for (i = 0; i < n; i++) System.out.println("\t" + dollarsArray[i] + "\t\t" + (int)(roublesArray[i] * 100) / 100);
    }

    /** Отображает инструкцию */
    public static void instruct() {
        System.out.println("Эта программа конвертирует сумму денег из американсих" +
                " долларов в российские рубли.");
        System.out.println("Курс покупки равен: " + ROUBLES_PER_DOLLAR + " рубля.\n");
    }

    /** Конвертирует n сумм денег из американских долларов в российские рубли */
    private static double[] find_roubles(int[] dollarsArray, int n) {
        double[] roublesArray = new double[n];
        int i;

        for (i = 0; i < n; ++i) roublesArray[i] = ROUBLES_PER_DOLLAR * dollarsArray[i];

        return roublesArray;
    }
}
