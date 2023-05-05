public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("задача 1");
        String phone = "+960-415-75-37";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("успех");
        } else {
            System.out.println("неудача");
        }
    }
    public static void task2() {
        System.out.println("Задача1");
        String firstName = "Nikita";
        String middleName = "Alexandrovich";
        String lastName = "Batura";
        String fullName = "Batura Nikita Alexandrovich";
        if (fullName.length() > 20) {
            fullName = lastName + firstName + middleName;
            System.out.println("ФИО сотрудника " + fullName);
        } else {
            System.out.println("Неверное имя");
        }
        }
    public static void task3() {
        System.out.println("Задача 2");
        String fullName = "Batura Nikita Alexandrovich";
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }
    public static void task4() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);
    }
}