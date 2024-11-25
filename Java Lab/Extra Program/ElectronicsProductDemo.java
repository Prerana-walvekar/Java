class ElectronicsProduct {
    private int productID;
    private String name;
    private double price;

    public ElectronicsProduct(int productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }

    public double getPrice() {
        return price;
    }

    public void displayProduct() {
        System.out.println("Product ID: " + productID + ", Name: " + name + ", Price: " + price);
    }
}

class WashingMachine extends ElectronicsProduct {
    private int warrantyPeriod;

    public WashingMachine(int productID, String name, double price, int warrantyPeriod) {
        super(productID, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public void extendWarranty(int extraYears) {
        warrantyPeriod += extraYears;
        System.out.println("Warranty extended. New warranty period: " + warrantyPeriod + " years.");
    }
}

public class ElectronicsProductDemo {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine(101, "Samsung Washer", 30000, 2);

        wm.displayProduct();
        wm.applyDiscount(10);
        System.out.println("Price after discount: " + wm.getPrice());
        wm.extendWarranty(1);
    }
}
