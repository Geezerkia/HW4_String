import java.util.Scanner;

public class Task3 {

    // Створити метод stringReverse. Метод приймає як параметр - рядок.
    // Необхідно її розгорнути та повернути змінений варіант.
    // Наприклад:
    // Hello -> olleH

    static Scanner sc;
    static String str;
    static String strReversed;

    public static void main(String[] args) {
        stringReverse();
    }

    public static void stringReverse(){
        doInput();
        strReversed = new StringBuilder(str).reverse().toString();
        doOutput();
    }

    public static void doInput(){
        sc = new Scanner(System.in);
        System.out.println("This method reverses a String.");
        System.out.print("Please, enter a String to reverse: ");
        str = sc.nextLine();
        sc.close();
    }

    public static void doOutput(){
        System.out.println("The reversed String is: " + strReversed);
    }
}
