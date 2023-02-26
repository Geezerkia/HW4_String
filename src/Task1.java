import java.util.Scanner;

public class Task1 {

    //Створити метод findSymbolOccurrence.
    //Метод приймає як параметр рядок і символ.
    //Необхідно обчислити, скільки разів символ зустрічається в
    //переданому рядку і повернути це числове значення

    static Scanner sc;
    static String str;
    static char symbol;
    static char[] results;
    static int counter;


    public static void main(String[] args) {
        findSymbolOccurrence();
   }

    public static void findSymbolOccurrence(){
        doInput();
        calculateOccurrences();
        doOutput();
    }

    public static void doInput() {
        sc = new Scanner(System.in);
        System.out.println("This method calculates number of occurrences of a Symbol in a String.");
        System.out.print("Please, enter a String: ");
        str = sc.nextLine();
        System.out.print("Please, enter a Symbol: ");
        symbol = sc.next().charAt(0);
        sc.close();
    }

public static void calculateOccurrences(){
        results = str.toCharArray();
    for (int i = 0; i < str.length(); i++) {
        if (results[i] == symbol) {
            counter++;}
        }
    }

    public static void doOutput(){
        if (counter == 0){
            System.out.println("Number of symbol occurrences: " + 0);
        } else {
            System.out.println("Number of symbol occurrences: " + counter);
        }
    }
}
