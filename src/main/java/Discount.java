public class Discount { // Принцип открытости-закрытости
    private double price;

    protected double giveDiscount() {
        return this.price * 0.2;
    }
}
