import java.util.Objects;

public class Product implements Comparable<Product> {
    String name;
    double weight;
    double price;
    TypeProducts typeProducts;
    double rating;

    public Product(String name, double weight, double price, double rating, TypeProducts typeProducts) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.typeProducts = typeProducts;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public TypeProducts getTypeProducts() {
        return typeProducts;
    }

    public double getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTypeProducts(TypeProducts typeProducts) {
        typeProducts = typeProducts;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product products = (Product) o;
        return Double.compare(products.weight, weight) == 0 &&
                Double.compare(products.price, price) == 0 &&
                Double.compare(products.rating, rating) == 0 &&
                Objects.equals(name, products.name) &&
                Objects.equals(typeProducts, products.typeProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, price, typeProducts, rating);
    }

    @Override
    public String toString() {
        return name + '\t' + '\t' +
                " вес(шт) - " + weight + "," + '\t' +
                " цена - " + price + " руб," + '\t' +
                " рейтинг - " + rating + "," + '\t' +
                " тип - " + typeProducts;
    }

    public int compareTo(Product p) {
        return name.compareTo(p.getName());
    }

}
