// Define the abstract class Product
abstract class Product {
    protected double price;

    public Product(double price) {
        this.price = price;
    }

    // Abstract method to be implemented by subclasses
    public abstract double getDiscount();
}

// FoodProduct class implementing the getDiscount method
class FoodProduct extends Product {
    public FoodProduct(double price) {
        super(price);
    }

    @Override
    public double getDiscount() {
        return price * 0.1;  // 10% discount for food products
    }
}

// ElectronicsProduct class implementing the getDiscount method
class ElectronicsProduct extends Product {
    public ElectronicsProduct(double price) {
        super(price);
    }

    @Override
    public double getDiscount() {
        return price * 0.05;  // 5% discount for electronics
    }
}

// New ClothingProduct class implementing the getDiscount method
class ClothingProduct extends Product {
    public ClothingProduct(double price) {
        super(price);
    }

    @Override
    public double getDiscount() {
        return price * 0.2;  // 20% discount for clothing products
    }
}

// DiscountCalculator class that now works for any product
class DiscountCalculator {
    public double calculateDiscount(Product product) {
        return product.getDiscount();  // Call the product's own discount logic
    }
}

// Testing the refactored code
public class Main {
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();

        Product food = new FoodProduct(100);
        Product electronics = new ElectronicsProduct(200);
        Product clothing = new ClothingProduct(150);

        System.out.println("Food Discount: " + discountCalculator.calculateDiscount(food)); // 10.0
        System.out.println("Electronics Discount: " + discountCalculator.calculateDiscount(electronics)); // 10.0
        System.out.println("Clothing Discount: " + discountCalculator.calculateDiscount(clothing)); // 30.0
    }
}
