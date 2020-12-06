import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProductList productList = new ProductList();
        Basket baskets = new Basket();
        int choice;

        System.out.println("Добро пожаловать в магазин!");
        while (true) {
            System.out.println("""

                    Выберите действие:
                    1. Вывод доступных для покупки товаров
                    2. Фильтр товаров по цене
                    3. Вывод корзины на экран
                    0. Выход""");
            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        choice = 1;
                        productList.getProductList();
                        break;
                    case 2:
                        choice = 2;
                        productList.filter();
                        break;
                    case 3:
                        choice = 3;
                        baskets.getBaskets();
                        break;
                }
                if (choice == 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка!\n" +
                        "Вы ввели не число, попробуйте ещё раз\n");
            }
        }

    }
}
