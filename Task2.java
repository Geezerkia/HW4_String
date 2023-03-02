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

    public static void main(String[] args) {

        System.out.println("The index of the 1st element of the target in the source is: " +
        findWordPosition("pollo", "Apollo"));
    }

    public static int findWordPosition(String target, String source){

        if(!source.contains(target)) {
            return -1;
        } else return source.indexOf(target);
    }
}
