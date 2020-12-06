public class Fish extends Product { // Принцип подстановки Лисков

    FatContent fatContent;

    public Fish(String name, double weight, double price, double rating, TypeProducts typeProducts, FatContent fatContent) {
        super(name, weight, price, rating, typeProducts);
    }

   protected Fish fish = new Fish("Лосось", 2, 500, 4.5, TypeProducts.FISH, FatContent.FATTY);
}
