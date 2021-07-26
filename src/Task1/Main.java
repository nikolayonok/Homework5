package Task1;


public class Main {
    public static void main(String[] args) {
        Range range = new Range();
        System.out.println("Введите от 3 до 10 диапазонов через пробел с разделение через запятую пример: 3 9,-2 4,11 15");
        String[] array = range.readRange();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
