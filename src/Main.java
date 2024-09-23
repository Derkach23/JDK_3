public class Main {
    public static void main(String[] args) {
        // Calculator
        System.out.println("Calculator пример:");
        System.out.println("Сумма: " + Calculator.sum(5, 3.2));
        System.out.println("Умножение: " + Calculator.multiply(5, 3.2));
        System.out.println("Деление: " + Calculator.divide(10, 2.5));
        System.out.println("Вычетание: " + Calculator.subtract(9, 2));

        // compareArrays
        System.out.println("\ncompareArrays пример:");
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {1, 2, 3};
        System.out.println("Массивы равны: " + Utils.compareArrays(arr1, arr2));

        String[] arr3 = {"a", "b"};
        String[] arr4 = {"a", "c"};
        System.out.println("Массивы равны: " + Utils.compareArrays(arr3, arr4));

        // Pair
        System.out.println("\nPair пример:");
        Pair<Integer, String> pair = new Pair<>(1, "Привет");
        System.out.println("Первая: " + pair.getFirst());
        System.out.println("Вторая: " + pair.getSecond());
        System.out.println(pair);
    }
}