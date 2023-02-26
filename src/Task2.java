import java.util.Scanner;

public class Task2 {

//    Створити метод findWordPosition. Метод приймає як параметри два рядки (source, target).
//    Необхідно з'ясувати, чи є target (підрядок) частиною рядка source.
//    Якщо так, тоді повернути номер позиції (індекс) першого елемента підрядка у рядку,
//    інакше повернути -1.
//
//    Приклад 1:
//    Source: Apollo
//    Target: pollo
//    Result: 1
//
//    Приклад 2:
//    Source: Apple
//    Target: Plant
//    Result: -1

    static Scanner sc;
    static String source;
    static String target;
    static int value;

    public static void main(String[] args) {
        findWordPosition();
    }

    public static void findWordPosition(){
        doInput();
        value = source.indexOf(target);
        doOutput();
    }

    public static void doInput() {
        sc = new Scanner(System.in);
        System.out.println("This method finds index of the first element of a substring (Target) " +
                "in a string (Source).");
        System.out.print("Please, enter a Target: ");
        target = sc.nextLine();
        System.out.print("Please, enter a Source: ");
        source = sc.nextLine();
        sc.close();
    }

    public static void doOutput(){
        if (value == -1){
            System.out.println("The index is: " + value + ", which means " +
                    "no Target was found in the String");
        } else {
            System.out.println("The index is: " + value);
        }
    }
}
