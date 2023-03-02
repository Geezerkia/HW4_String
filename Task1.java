public class Task1 {

    //Створити метод findSymbolOccurrence.
    //Метод приймає як параметр рядок і символ.
    //Необхідно обчислити, скільки разів символ зустрічається в
    //переданому рядку і повернути це числове значення


    public static void main(String[] args) {

        System.out.println("Number of occurrences is: " + findSymbolOccurrence("Apple", 'p'));
   }

    public static int findSymbolOccurrence(String str, char symbol) {
        int counter = 0;
        char[] results = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
                if (results[i] == symbol) {
                    counter++;
                }
            }
        return counter;
    }
}
