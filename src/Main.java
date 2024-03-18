import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1.");
        int year = 2021;
        checkLeapYear(year);

        System.out.println("Задача 2.");
        int clientYear = 2020;
        int clientOs = 0;
        downloadAppVersion(clientYear, clientOs);

        System.out.println("Задача 3.");
        int deliveryDistance = 95;
        int daysForDelivery = checkDelivery(deliveryDistance);
        if (daysForDelivery > 0) {
            System.out.println("Потребуется дней: " + daysForDelivery);
        } else {
            System.out.println("Доставка невоможна");
        }
    }

    // Метод для Задачи 1.
    public static void checkLeapYear(int leapYear) {
        if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
            System.out.println(leapYear + " год — високосный год");
        } else {
            System.out.println(leapYear + "  год — невисокосный год");
        }
    }

    // Метод для Задачи 2.
    public static void downloadAppVersion(int year, int os) {
        if (year == LocalDate.now().getYear() && os == 0) {
            System.out.println("Установите обычную версию приложения для IOS по ссылке");
        } else if (year < LocalDate.now().getYear() && os == 0) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (year == LocalDate.now().getYear() && os == 1) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else if (year < LocalDate.now().getYear() && os == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Вы ввели некорректные данные");
        }
    }

    // Метод для Задачи 3.
    public static int checkDelivery(int distance) {
        if (distance < 20 && distance >= 0) {
            return 1;
        } else if (distance >= 20 && distance <= 60) {
            return 2;
        } else if (distance > 60 && distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}