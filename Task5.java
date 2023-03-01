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
    static String[] products;
    static String[] poundArray;
    static int randomIndex;
    static String computerProduct;
    static String userProduct;

    public static void main(String[] args) {

        initValues();
        matchComputerAndUserProducts();
    }

    //Initialization of the product array, pound(#) array,
    //computer product (random fixed choice), user product (initial input).
        public static void initValues(){

        products = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leek", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};

        poundArray = new String[]{"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"};

        computerProductInput();
        userProductInput();
    }

    //Random fixed choice of a product by the computer
    public static void computerProductInput(){
        Random random = new Random();
        randomIndex = random.nextInt(products.length);
        computerProduct = products[randomIndex];
    }

    //Initial input of a product by the user
    public static void userProductInput(){
        sc = new Scanner(System.in);
        System.out.println("Hi! Let's play a guessing game!\n" +
                "I have a list of " + products.length +" products:" );
        displayProducts();
        System.out.println("\nI chose one product from the list.\n" +
                           "(Computer chose '" + computerProduct + "', but don't tell it to the user:))\n"+
                           "Try to guess which one. Enter here:");
        userProduct = sc.nextLine();
    }

    //Symbol by symbol matching of the computer product with the user product.
    //If the matching fails, the user has attempts to input another product
    //as many times as needed to guess the computer product.
    public static void matchComputerAndUserProducts(){
        while (true){
            try {
                for (int i = 0; i < computerProduct.length(); i++){
                    if (computerProduct.charAt(i) == userProduct.charAt(i)){
                        poundArray[i] = String.valueOf(computerProduct.charAt(i));
                    }
                }
            } catch (StringIndexOutOfBoundsException ignored) {}

            if(computerProduct.equals(userProduct)){
                System.out.println("Congratulations! You won! " + "'" + computerProduct + "'"
                        + " is the right product:)");
                sc.close();
                break;
            } else {
                userAnotherTry();
            }
        }
    }

    //Display of the product array
    public static void displayProducts(){
        for (String s : products) {
            System.out.print(s + ", ");
        }
    }
    //Display of the pound(#) array
    public static void displayPoundArray (){
        for (String s : poundArray) {
            System.out.print(s);
        }
    }

    //Another input of a product by the user,
    //reinitialization of the pound(#) array.
    public static void userAnotherTry(){
        displayPoundArray();
        poundArray = new String[]{"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"};
        System.out.println("\nHave another try: ");
        userProduct = sc.nextLine();
    }
}
