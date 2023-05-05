public class Main {
    public static void main(String[] args) {
        task2();
        task3();
        task4();
    }

    public static void task2() {
        System.out.println("Задача1");
        String firstName = "Nikita";
        String middleName = "Alexandrovich";
        String lastName = "Batura";
        String fullName = "Batura Nikita Alexandrovich";
        if (fullName.length() > 20) {
            fullName = lastName +" " + firstName +" " + middleName;
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