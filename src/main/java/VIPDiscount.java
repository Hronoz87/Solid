public class VIPDiscount extends Discount{ // Принцип открытости-закрытости (Изменение функционала не трогая основной класс)
    @Override
    protected double giveDiscount() {
        return super.giveDiscount() * 3;
    }
}
