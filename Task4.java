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

    public static void main(String[] args) {
        System.out.println("The string " + "'kayak'" + " is Palindrome: " + isPalindrome("kayak"));
    }
    public static boolean isPalindrome(String str){
        strValidator(str);
        String strReversed = new StringBuilder(str).reverse().toString();
        return str.equals(strReversed);
    }
    static void strValidator(String strVal) {
        if (strVal == null) {
            System.out.println("You entered a Null String, please, correct.");
            System.exit(0);
        }
    }
}
