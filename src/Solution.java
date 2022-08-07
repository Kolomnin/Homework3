
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
//         task1And2();
//         task3();
//         task4();
//         task5();
 //        task6();
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
        int monthNumber = 13;
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


//    Задача 6
//    И снова дела банковские, уже сложнее.
//    В нашем банке можно, кроме дебетовых, получать еще и кредитные карты. У таких карт есть допустимый лимит средств,
//    который рассчитывается исходя из возраста клиента и его зарплаты.
//    Правила расчета следующие:
//    Людям старше (или равно) 23 лет мы предоставляем лимит в размере 3 зарплат.
//    Людям младше 23 лет мы предоставляем лимит в размере 2 зарплат.
//    Если заработная плата клиента выше (или равно) 50 тысяч, мы увеличиваем лимит в 1.2 раза.
//    Если заработная плата выше (или равно) 80 тысяч, мы увеличиваем лимит в 1.5 раза.
//    Наша задача: написать программу, которая показывает, какую сумму на кредитке может получить клиент.
//    Вводные данные: переменная age = 19 для обозначения возраста клиента, salary = 58_000 для обозначения зарплаты клиента.
//    Увеличения не могут быть применены одновременно. Необходимо вывести максимальный лимит в консоль в формате:
//    «Мы готовы выдать вам кредитную карту с лимитом *** рублей».
//    Критерии оценки
//    При изменении значения переменной age результат вывода в консоль изменяется согласно условиям задачи
//    При изменении значения переменной salary результат вывода в консоль изменяется согласно условиям задачи
//    Написанный код отрабатывает условия задачи и изменение значений переменных, выводит в консоль корректный результат
//    Правила синтаксиса и пунктуации соблюдены.

    public static void task6() {

        int age = 19;
        double salary = 58_000;

        double highLim12 = 1.2;
        double highLim15 = 1.5;

        double lim2xCredit = salary * 2;
        double lim3xCredit = salary * 3;

        if (age >= 23 && salary >= 50_000 && salary < 80_000) salary = lim2xCredit * highLim12;

        else if (age >= 23 && salary >= 80_000) salary = lim3xCredit * highLim15;

        if (age < 23 && salary >= 50_000 && salary < 80_000) salary = lim2xCredit * highLim12;

        else if (age < 23 && salary >= 80_000) salary = lim3xCredit * highLim15;

        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");

    }
//    Задача 7
//    Расширим задачу с кредитованием. Прежде чем выдавать кредиты наш банк проводит аудит и оценивает клиентов
//    и их возможность выплачивать кредит. Для того, чтобы вывести предварительное решение,
//    нам необходимо использовать данные о возрасте, зарплате и желаемой сумме.
//    Правила следующие:
//    Базовая ставка для клиента — 10% годовых. Срок кредитования — 12 месяцев. Максимальный ежемесячный платеж — 50% от ЗП.
//    Если возраст меньше 23, то добавляем 1% к ставке.Если возраст меньше 30, то добавляем 0.5% к ставке.
//    Если зарплата больше 80_000, уменьшаем ставку на 0.7%.
//    Нам нужно написать программу для предварительного одобрения/отказа заявки по кредиту.
//    Вводные данные: используйте переменные age = 25 для обозначения возраста,salary = 60_000 для
//    обозначения зарплаты,wantedSum = 330_000 для обозначения желаемой суммы кредита.
//    Подсчитайте и выведите ответ, одобрен кредит или нет. На основании зарплаты подсчитайте максимальный
//    допустимый платеж. Если максимальный допустимый платеж по ЗП больше стандартного платежа по кредиту
//    согласно процентной ставке, то кредит одобрен, если меньше — отказан.
//    Пример ответа в консоль: «Максимальный платеж при ЗП *** равен *** рублей. Платеж по кредиту *** рублей. Одобрено/отказано».
//    Критерии оценки
//    При изменении значения переменной age результат вывода в консоль изменяется согласно условиям задачи
//    При изменении значения переменной salary результат вывода в консоль изменяется согласно условиям задачи
//    Написанный код отрабатывает условия задачи и изменение значений переменных, выводит в консоль корректный результат
//    Нет вложенности в коде.

    public static void task7() {

        public static void task7() {
            int age = 25;
            int salary = 60_000;
            int wantedSum = 330_000;
            int maxPayment = salary / 2;
            int creditTerm = 12;
            float interestRate = 10;
            if (age < 23) {
                interestRate++;
            } else if (age < 30) {
                interestRate += 0.5;
            }
            if (salary > 80_000) {
                interestRate -= 0.7;
            }
            float creditSum = wantedSum * (1 + (interestRate / 100));
            float payment = creditSum / creditTerm;
            System.out.println("Ваш максимальный платеж: " + maxPayment + ". Платеж по кредиту: " + payment);
            if (payment > maxPayment) {
                System.out.println("Отказано.");
            } else {
                System.out.println("Одобрено.");
            }
        }
    }
}
