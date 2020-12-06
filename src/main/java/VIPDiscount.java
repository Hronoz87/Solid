public class VIPDiscount extends Discount{
    @Override
    protected double giveDiscount() {
        return super.giveDiscount() * 3;
    }
}
