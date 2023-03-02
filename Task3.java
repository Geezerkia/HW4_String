public class Task3 {

    // Створити метод stringReverse. Метод приймає як параметр - рядок.
    // Необхідно її розгорнути та повернути змінений варіант.
    // Наприклад:
    // Hello -> olleH


    public static void main(String[] args) {

        System.out.println("The original string is: " + "Apple" +
                "\nThe reversed String is: " + stringReverse("Apple"));
    }

    public static String stringReverse(String str) {

        return new StringBuilder(str).reverse().toString();
    }
}
