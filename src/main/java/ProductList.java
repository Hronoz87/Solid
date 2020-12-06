import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Принцип единой ответственности (Вынес метод создания списка продуктов в отдельный класс)

public class ProductList implements Filter{
    protected List<Product> productList;

    public ProductList(List<Product> productList) {
        this.productList = productList;
    } //Принцип инверсии зависимостей

    public ProductList() {

    }

    public void getProductList() {

        productList = new ArrayList<>();
        productList.add(new Product("Свинина  ", 1.0, 250, 4.5, TypeProducts.MEET));
        productList.add(new Product("Говядина ", 1.0, 400, 4.3, TypeProducts.MEET));
        productList.add(new Product("Лосось   ", 1.0, 540, 4.3, TypeProducts.FISH));
        productList.add(new Product("Семга    ", 1.0, 350, 3.2, TypeProducts.FISH));
        productList.add(new Product("Колбаса  ", 1.0, 300, 4.5, TypeProducts.FOOD));
        productList.add(new Product("Хлеб     ", 1.0, 60, 4.6, TypeProducts.FOOD));
        productList.add(new Product("Сосиски  ", 1.0, 300, 4.6, TypeProducts.FOOD));
        productList.add(new Product("Молоко   ", 1.0, 90, 4.6, TypeProducts.FOOD));
        productList.add(new Product("Кофе     ", 1.0, 600, 4.6, TypeProducts.FOOD));
        productList.add(new Product("Чай      ", 1.0, 312, 4.6, TypeProducts.FOOD));
        productList.add(new Product("Яблоки   ", 1.0, 250, 4.6, TypeProducts.FOOD));
        productList.add(new Product("Апельсины", 1.0, 285, 4.6, TypeProducts.MEET));
        productList.add(new Product("Тарелки  ", 1.0, 50, 4.6, TypeProducts.HOUSEHOLD_GOODS));
        productList.add(new Product("Губка    ", 1.0, 110, 4.6, TypeProducts.HOUSEHOLD_GOODS));
        productList.add(new Product("Сок      ", 1.0, 130, 4.6, TypeProducts.FOOD));
        productList.add(new Product("Полотенцо", 1.0, 330, 4.6, TypeProducts.HOUSEHOLD_GOODS));
        productList.add(new Product("Сыр      ", 1.0, 250, 4.6, TypeProducts.FOOD));
        productList.add(new Product("Мыло     ", 1.0, 33, 4.6, TypeProducts.HOUSEHOLD_GOODS));
        productList.add(new Product("Шампунь  ", 1.0, 250, 4.6, TypeProducts.HOUSEHOLD_GOODS));
        productList.add(new Product("Курица   ", 1.0, 299, 4.6, TypeProducts.MEET));

        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void filter() {
        productList.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .forEach(System.out::println);
    }
}




