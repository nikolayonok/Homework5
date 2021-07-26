package Task3;

public class Money {
    private long hryvnia;
    private byte cent;

    public Money(long hryvnia, byte cent) {
        this.hryvnia = hryvnia;
        this.cent = cent;
    }

    public long getHryvnia() {
        return hryvnia;
    }

    public void setHryvnia(long hryvnia) {
        this.hryvnia = hryvnia;
    }

    public byte getCent() {
        return cent;
    }

    public void setCent(byte cent) {
        this.cent = cent;
    }

    @Override
    public String toString() {
        return String.format("%d,%02d", hryvnia, cent);
    }

    public Money add(Money money) {
        long hryvnia = getHryvnia() + money.getHryvnia();
        byte a = getCent();
        byte b = money.getCent();
        byte cent = (byte) (getCent() + money.getCent());
        if ((cent > 99) || (cent < 0)) {
            hryvnia++;
            cent -= 100;
        }
        return new Money(hryvnia, cent);
    }

    public Money subtract(Money money) {
        long hryvnia = getHryvnia() - money.getHryvnia();
        byte cent = (byte) (getCent() - money.getCent());
        if ((cent > 99) || (cent < 0)) {
            hryvnia--;
            cent += 100;
        }
        return new Money(hryvnia, cent);
    }

    public double divide(Money money) {
        double result = (getHryvnia() * 100 + getCent()) / (double) (money.getHryvnia() * 100 + money.getCent());
        return result;
    }

    public Money divide(Money money, double number) {
        double result = (money.getHryvnia() * 100 + money.getCent()) / number;
        return new Money((long) result / 100, (byte) (result % 100));
    }

    public Money multiply(Money money, double number) {
        double result = (money.getHryvnia() * 100 + money.getCent()) * number;
        return new Money((long) result / 100, (byte) (result % 100));
    }

    public boolean compare(Money money) {
        return (getHryvnia() == money.getHryvnia() && getCent() == money.getCent());
    }
}
