import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

interface VendingMachine {
    void initProducts(List<Product> products);
    Product getProduct(String name, int volume, int temperature);
}

class Product {
    private String name;
    private double price;
    private LocalDate releaseDate;

    public Product(String name, double price, LocalDate releaseDate) {
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }
}

class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, double price, LocalDate releaseDate, int temperature) {
        super(name, price, releaseDate);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}

class HotDrinkMachine implements VendingMachine {
    private List<Product> products;

    @Override
    public void initProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public Product getProduct(String name, int volume, int temperature) {
        for (Product product : products) {
            if (product instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.getName().equals(name) && hotDrink.getPrice() == volume && hotDrink.getTemperature() == temperature) {
                    return hotDrink;
                }
            }
        }
        return null;
    }
}

public class HomeWork {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new HotDrink("Tea", 100, LocalDate.now(), 80));
        products.add(new HotDrink("Coffee", 120, LocalDate.now(), 90));
        products.add(new HotDrink("Chocolate", 150, LocalDate.now(), 85));

        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine();
        hotDrinkMachine.initProducts(products);

        Product product = hotDrinkMachine.getProduct("Tea", 100, 80);
        if (product != null) {
            System.out.println("Product found: " + product.getName());
        } else {
            System.out.println("Product not found");
        }
    }
}