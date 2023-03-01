import java.util.Scanner;

public class Task4 {

    //Створити метод isPalindrome. Метод приймає як параметр - рядок.
    // Необхідно Перевірити, чи є переданий рядок паліндромом.
    // Якщо так, тоді повернуть true, інакше false.
    //
    // Приклад 1:
    // ERE -> true
    //
    // Приклад 2:
    // Allo -> false

    static Scanner sc;
    static String str;
    static String strReversed;
    static boolean result;


    public static void main(String[] args) {
        isPalindrome();
    }

    public static void isPalindrome(){
        doInput();
        strReversed = new StringBuilder(str).reverse().toString();
        result = str.equals(strReversed);
        doOutput();
    }
    public static void doInput(){
        sc = new Scanner(System.in);
        System.out.println("This method checks if a String is Palindrome.");
        System.out.print("Please, enter a String to check: ");
        str = sc.nextLine();
        sc.close();
    }

    public static void doOutput(){
         if (result){
             System.out.println("Yes, this String is Palindrome.");
         } else {
             System.out.println("No, the String is not Palindrome.");
         }
    }
}
