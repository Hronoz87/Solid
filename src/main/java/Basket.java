import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Basket implements Filter{

    protected Map<Product, Integer> baskets;

    public Basket(Map<Product, Integer> baskets) {
        this.baskets = baskets;
    }

    public Basket() {

    }

    public void getBaskets() {
        baskets = new HashMap<>();

        baskets.put(new Product("Свинина  ", 1.0, 250, 4.5, TypeProducts.MEET), 2);
        baskets.put(new Product("Говядина ", 1.0, 400, 4.3, TypeProducts.MEET), 3);
        baskets.put(new Product("Лосось   ", 1.0, 540, 4.3, TypeProducts.FISH), 1);
        baskets.put(new Product("Семга    ", 1.0, 350, 3.2, TypeProducts.FISH), 4);
        baskets.put(new Product("Колбаса  ", 1.0, 300, 4.5, TypeProducts.FOOD), 2);
        baskets.put(new Product("Хлеб     ", 1.0, 60, 4.6, TypeProducts.FOOD), 2);
        baskets.put(new Product("Сосиски  ", 1.0, 300, 4.6, TypeProducts.FOOD), 1);
        baskets.put(new Product("Молоко   ", 1.0, 90, 4.6, TypeProducts.FOOD), 1);
        baskets.put(new Product("Кофе     ", 1.0, 600, 4.6, TypeProducts.FOOD), 2);
        baskets.put(new Product("Чай      ", 1.0, 312, 4.6, TypeProducts.FOOD), 2);
        baskets.put(new Product("Яблоки   ", 1.0, 250, 4.6, TypeProducts.FOOD), 3);
        baskets.put(new Product("Апельсины", 1.0, 285, 4.6, TypeProducts.MEET), 3);
        baskets.put(new Product("Тарелки  ", 1.0, 50, 4.6, TypeProducts.HOUSEHOLD_GOODS), 4);
        baskets.put(new Product("Губка    ", 1.0, 110, 4.6, TypeProducts.HOUSEHOLD_GOODS), 4);

        if (!baskets.isEmpty()) {

           for (Map.Entry<Product, Integer> entry: baskets.entrySet()) {
               System.out.println(entry.getKey() + " " + " Количество " +  " - " + entry.getValue());
           }

        }
    }

    public void setBaskets(Map<Product, Integer> baskets) {
        this.baskets = baskets;
    }

    @Override
    public void filter() {
    }
}
