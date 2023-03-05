import java.util.Random;
import java.util.Scanner;

public class Task5 {

    // Створити масив зі слів String[] words = {"apple", "orange", "lemon", "banana", "apricot",
    // "avocado" , "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
    // "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple",
    // "pumpkin", "potato"};
    // При запуску програми комп'ютер загадує слово, запитує відповідь у користувача,
    // порівнює його із загаданим словом та повідомляє чи правильно відповів користувач.
    // Якщо слово не вгадано, комп'ютер показує літери, які стоять на своїх місцях.
    // apple – загадане
    // apricot - відповідь гравця
    // ap############# (15 символів, щоб користувач не міг дізнатися довжину слова)
    // Для порівняння двох слів посимвольно, можна скористатися:
    // String str = "apple";
    // str.charAt(0); - метод, поверне char, який стоїть у слові str на першій позиції
    // Граємо до тих пір, поки гравець не відгадає слово
    // Використовуємо лише маленькі літери

    static Scanner sc;
    static String poundStr;
    static String computerProduct;
    static String userProduct;
    final static String[] PRODUCTS = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
            "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leek", "kiwi",
            "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
            "pineapple", "pumpkin", "potato"};
    public static void main(String[] args) {
        initValues();
        matchComputerAndUserProducts();
    }
    public static void initValues() {
        poundStr = "###############";
        computerProductInput();
        userProductInput();
    }
    //Fixed random choice of a product by the computer
    public static void computerProductInput() {
        var random = new Random();
        computerProduct = PRODUCTS[random.nextInt(PRODUCTS.length)];
    }
    //Manual initial input of a product by the user
    public static void userProductInput() {
        sc = new Scanner(System.in);
        System.out.println("Hi! Let's play a guessing game!\n" +
                "I have a list of " + PRODUCTS.length + " PRODUCTS:");
        displayProducts();
        System.out.println("\nI chose one product from the list.\n" +
                "(Computer chose '" + computerProduct + "', but don't tell it to the user:))\n" +
                "Try to guess which one. Enter here:");
        userProduct = sc.nextLine();
    }
    //Display of the product array
    public static void displayProducts() {
        for (String s : PRODUCTS) {
            System.out.print(s + ", ");
        }
    }
    public static void matchComputerAndUserProducts() {
        while (true) {
            if (computerProduct.equals(userProduct)) {
                System.out.println("Congratulations! You won! " + "'" + computerProduct + "'"
                        + " is the right product:)");
                sc.close();
                break;
            } else {
                try {
                    for (var i = 0; i < computerProduct.length(); i++) {
                        if (computerProduct.charAt(i) == userProduct.charAt(i)) {
                            poundStr = poundStr.substring(0, i) + computerProduct.charAt(i)
                                    + poundStr.substring(i + 1);
                        }
                    }
                } catch (StringIndexOutOfBoundsException ignored) {
                }
            }
            userAnotherTry();
        }
    }
    public static void userAnotherTry() {
        System.out.println(poundStr + "\nHave another try: ");
        poundStr = "###############";
        userProduct = sc.nextLine();
    }
}
