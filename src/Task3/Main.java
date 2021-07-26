package Task3;

public class Main {
    public static void main(String[] args) {
        Money money = new Money(60, (byte) 20);
        Money money1 = new Money(20, (byte) 62);

        System.out.println("Первая денежная сумма: " + money);
        System.out.println("Вторая денежная сумма: "+ money1);
        System.out.println("Сложение денежных сумм: " + money.add(money1));
        System.out.println("Вычитание денежных сумм: " + money.subtract(money1));
        System.out.println("Деление денежных сумм: " + money.divide(money1));
        System.out.println("Деление на дробное число: " + money.divide(money1, 4.2));
        System.out.println("Умножение на дробное число: " + money.multiply(money1, 4.2));
        System.out.println("Сравнение денежных сумм: " + money.compare(money1));
    }
}
