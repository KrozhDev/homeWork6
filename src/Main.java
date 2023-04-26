public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task2");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task3");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("Task4");
        for (int i = 10; i >= -10; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task5");
        int year1 = 1904;
        int year2 = 2096;

        for (int year = year1; year <= year2; year++) {
            if ((year % 400 == 0) | ((year % 4 ==0) && (year % 100 != 0))) {
                System.out.println(year + " год является високосным");
            }
        }

        System.out.println("Task6");

//        7 14 21 28 35 42 49 56 63 70 77 84 91 98

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task7");

        for (int i = 0; i<=9; i++) {
            System.out.print( (int) Math.pow(2,i) + " ");
        }

        System.out.println("Task8");

        int monthSavings = 29000;

        for (int month = 1; month <= 12; month++) {
            System.out.println("Месяц " + month + ". Сумма накоплений равна " + month*monthSavings + " рублей");
        }

        System.out.println("Task9");

        monthSavings = 29000;
        double percent = 1.01;
        int totalSavings = (int) (monthSavings * percent);
        for (int month = 1; month <= 12; month++) {
            System.out.println("Месяц " + month + ". Сумма накоплений равна " + totalSavings + " рублей");
            totalSavings = (int) ((monthSavings + totalSavings) * percent);
        }


        System.out.println("Task10");
        for (int i = 1; i <= 10; i++){
            System.out.println("2 * " + i + " = " + 2*i);
        }
    }
}