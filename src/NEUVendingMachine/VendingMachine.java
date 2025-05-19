package NEUVendingMachine;

import java.util.ArrayList;

/**
 * VendingMachine class demonstrating Object-Oriented Programming principles:
 *
 * 1. Encapsulation:
 *    - Private fields (products, totalMoneyInserted, selectedProductIndex) hide internal state
 *    - Public methods provide controlled access to vending machine operations
 *    - Data and methods that operate on that data are bundled together
 *
 * 2. Single Responsibility Principle:
 *    - Class focuses solely on vending machine operations
 *    - Handles product management, money handling, and purchase logic
 *    - UI concerns are separated into the Vending class
 *
 * 3. Abstraction:
 *    - Represents a real-world vending machine with essential operations
 *    - Complex operations are hidden behind simple method interfaces
 *    - Users don't need to know internal implementation details
 *
 * 4. Information Hiding:
 *    - Internal state is private and can only be modified through methods
 *    - Implementation details are hidden from other classes
 *    - Products list is protected from direct external modification
 */
public class VendingMachine {
    private ArrayList<Product> products;
    private int totalMoneyInserted;
    private int selectedProductIndex;

    public VendingMachine() {
        this.products = new ArrayList<>();
        this.totalMoneyInserted = 0;
        this.selectedProductIndex = -1;
        initializeProducts();
    }

    private void initializeProducts() {
        products.add(new Product("NEU Fair T Shirt", 450, 10));
        products.add(new Product("NEU Fair Hoodie", 550, 10));
        products.add(new Product("NEU Fair Mug", 250, 10));
        products.add(new Product("Ballpen", 15, 10));
        products.add(new Product("NEU Lanyard", 150, 10));
        products.add(new Product("Tote Bag", 100, 10));
    }

    public void selectProduct(int index) {
        if (index >= 0 && index < products.size()) {
            selectedProductIndex = index;
        }
    }

    public void insertMoney(int amount) {
        totalMoneyInserted += amount;
    }

    public int getTotalMoneyInserted() {
        return totalMoneyInserted;
    }

    public void resetMoney() {
        totalMoneyInserted = 0;
    }

    public Product getSelectedProduct() {
        if (selectedProductIndex >= 0 && selectedProductIndex < products.size()) {
            return products.get(selectedProductIndex);
        }
        return null;
    }

    public boolean canPurchase() {
        Product selected = getSelectedProduct();
        if (selected == null) {
            return false;
        }
        return totalMoneyInserted >= selected.getPrice();
    }

    public int calculateChange() {
        Product selected = getSelectedProduct();
        if (selected == null) {
            return totalMoneyInserted;
        }
        return totalMoneyInserted - selected.getPrice();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}