
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
         task1And2();
         task3();
         task4();
         task5();
    }
// Задание №1 и №2.
    public static void task1And2() throws IOException, ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какая у вас операционная система? iOS - введите 0, Android - введите 1:");
        int clientOS = scanner.nextInt();

        Calendar calendar = new GregorianCalendar(2015, Calendar.JANUARY, 1);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите год изготовления мобильного устройства в формате дд.мм.гггг.:");
        Date date = sdf.parse(br.readLine());

        while (true) {
            if (clientOS == 0) {
                if (date.before(calendar.getTime()))
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                if (date.after(calendar.getTime()))
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;

            } else if (clientOS == 1) {
                if (date.before(calendar.getTime()))
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                if (date.after(calendar.getTime()))
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                }
            }
                scanner.close();
                br.close();
        }

        // Задание №3
   /* Чтобы определить, является ли год високосным, выполните следующие действия:

   1. Если год делится на 4 без остатка, перейдите на шаг 2. В противном случае перейдите к выполнению действия 5.
   2. Если год делится на 100 без остатка, перейдите на шаг 3. В противном случае перейдите к выполнению действия 4.
   3. Если год делится на 400 без остатка, перейдите на шаг 4. В противном случае перейдите к выполнению действия 5.
   4. Год високосный (366 дней).
   5. Год не високосный год (365 дней).*/
    public static void task3() throws IOException {

                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String date = reader.readLine();
                int year = Integer.parseInt(date);

                if (year %100==0 && year %400 ==0 && year % 4 == 0)
                    System.out.println(year + " год является високосным");

                else if (year % 4 == 0)
                    System.out.println(year + " год является високосным");

                else if (year % 100 == 0 && year % 4 == 0)
                    System.out.println(year + " год не является високосным");

                else
                    System.out.println(year + " год не является високосным");

                reader.close();

            }

            // Задача №4
    public static void task4() {
        int deliveryDistance = 95;

        if (deliveryDistance <= 20) {
            int days = 1;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            int days = 2;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            int days = 3;
            System.out.println("Потребуется дней: " + days);
        }
    }

    // Задача №5

    public static void task5() {
        int monthNumber = 12;
        String x;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                x = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                x = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                x = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                x = "Осень";
                break;
            default:
                x = "Нет такого месяца!";
        }
        System.out.println(x);
    }
}
