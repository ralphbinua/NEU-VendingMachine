package NEUVendingMachine;

import java.util.ArrayList;

/**
 * VendingMachine class demonstrating Object-Oriented Programming principles:
 *
 * 1. Encapsulation:
 *    - Private fields (products, totalMoneyInserted, selectedProductIndex) hide internal data
 *    - Public methods provide controlled access to data
 *    - Data and methods that operate on that data are bundled together
 *
 * 2. Abstraction:
 *    - Represents a real-world vending machine with essential operations
 *    - Provides a simple interface to interact with the machine
 *    - Hides complex implementation details
 */
public class VendingMachine {
    // Encapsulation: Private fields to hide internal state
    private ArrayList<Product> products;
    private int totalMoneyInserted;
    private int selectedProductIndex;

    /**
     * Constructor initializes the vending machine with default values
     * Abstraction: Hides the initialization complexity behind a simple constructor
     */
    public VendingMachine() {
        this.products = new ArrayList<>();
        this.totalMoneyInserted = 0;
        this.selectedProductIndex = -1;  // -1 indicates no product is selected
        initializeProducts();
    }

    /**
     * Private method to initialize products
     * Encapsulation: Internal implementation detail hidden from external classes
     */
    private void initializeProducts() {
        products.add(new Product("NEU Fair T Shirt", 450, 10));
        products.add(new Product("NEU Fair Hoodie", 550, 10));
        products.add(new Product("NEU Fair Mug", 250, 10));
        products.add(new Product("Ballpen", 15, 10));
        products.add(new Product("NEU Lanyard", 150, 10));
        products.add(new Product("Tote Bag", 100, 10));
    }

    /**
     * Selects a product by index
     * Encapsulation: Controls how product selection is handled
     * Abstraction: Provides a simple interface for product selection
     */
    public void selectProduct(int index) {
        if (index >= 0 && index < products.size()) {
            selectedProductIndex = index;
        }
    }

    /**
     * Inserts money into the vending machine
     * Encapsulation: Controls how money is added to the machine
     */
    public void insertMoney(int amount) {
        totalMoneyInserted += amount;
    }

    /**
     * Gets the total money inserted
     * Encapsulation: Provides controlled access to private field
     */
    public int getTotalMoneyInserted() {
        return totalMoneyInserted;
    }

    /**
     * Resets the money counter
     * Encapsulation: Controls how money state is modified
     */
    public void resetMoney() {
        totalMoneyInserted = 0;
    }

    /**
     * Gets the currently selected product
     * Encapsulation: Provides controlled access to product data
     * Abstraction: Hides the complexity of product retrieval
     */
    public Product getSelectedProduct() {
        if (selectedProductIndex >= 0 && selectedProductIndex < products.size()) {
            return products.get(selectedProductIndex);
        }
        return null;
    }

    /**
     * Checks if the selected product can be purchased
     * Abstraction: Provides a simple way to check purchase possibility
     */
    public boolean canPurchase() {
        Product selected = getSelectedProduct();
        if (selected == null) {
            return false;
        }
        return totalMoneyInserted >= selected.getPrice();
    }

    /**
     * Calculates the change to be returned
     * Abstraction: Simplifies the change calculation process
     */
    public int calculateChange() {
        Product selected = getSelectedProduct();
        if (selected == null) {
            return totalMoneyInserted;
        }
        return totalMoneyInserted - selected.getPrice();
    }

    /**
     * Gets the list of available products
     * Encapsulation: Provides controlled access to products list
     */
    public ArrayList<Product> getProducts() {
        return products;
    }
}