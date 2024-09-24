interface Product {
    double getDiscount();
}

class FoodProduct implements Product {
    @Override
    public double getDiscount() {
        return 0.10;
    }
}

class ElectronicsProduct implements Product {
    @Override
    public double getDiscount() {
        return 0.20;
    }
}

class ClothingProduct implements Product {
    @Override
    public double getDiscount() {
        return 0.15;
    }
}

class DiscountCalculator {
    public double calculateDiscount(Product product, double price) {
        return price - (price * product.getDiscount());
    }
}

class Main {
    public static void main(String[] args) {
        Product food = new FoodProduct();
        Product electronics = new ElectronicsProduct();
        Product clothing = new ClothingProduct();

        DiscountCalculator discountCalculator = new DiscountCalculator();

        double foodPrice = 100.0;
        double electronicsPrice = 500.0;
        double clothingPrice = 200.0;

        System.out.println("Food product discounted price: " + discountCalculator.calculateDiscount(food, foodPrice));
        System.out.println("Electronics product discounted price: " + discountCalculator.calculateDiscount(electronics, electronicsPrice));
        System.out.println("Clothing product discounted price: " + discountCalculator.calculateDiscount(clothing, clothingPrice));
    }
}
