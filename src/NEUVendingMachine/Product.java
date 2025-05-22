/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NEUVendingMachine;

/**
 * 
 * 1. Encapsulation:
 *    - Private fields (name, price, stock) hide internal data
 *    - Public methods provide controlled access to data
 *    - Data and methods that operate on that data are bundled together
 *
 * 2. Information Hiding:
 *    - Internal state is private and can only be modified through methods
 *    - Implementation details are hidden from other classes
 *
 * 3. Abstraction:
 *    - Represents a real-world product with essential attributes
 *    - Provides a simple interface to interact with product data
 *
 * 4. Polymorphism:
 *    - Overrides toString() method from Object class
 *    - Demonstrates runtime polymorphism
 */
public class Product {
    // Encapsulation: Private fields to hide internal state
    private String name;
    private int price;
    private int stock;

    /*
     * Abstraction: Provides a simple way to initialize a product
     */
    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    /**
     * Gets the product name
     * Encapsulation: Provides controlled access to private field
     *
     * @return The name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the product price
     * Encapsulation: Provides controlled access to private field
     *
     * @return The price of the product
     */
    public int getPrice() {
        return price;
    }

    /**
     * Gets the current stock level
     * Encapsulation: Provides controlled access to private field
     *
     * @return The current stock quantity
     */
    public int getStock() {
        return stock;
    }

    /*
     * Abstraction: Provides a simple way to check stock availability
     */
    public boolean isInStock() {
        return stock > 0;
    }

    /**
     * Decreases the stock by 1 if available
     * Encapsulation: Controls how stock is modified
     *
     * @return true if stock was decreased, false if out of stock
     */
    public void decrementStock() {
        if (stock > 0) {
            stock--;
        }
    }

    /**
     * Increases the stock by 1
     * Encapsulation: Controls how stock is modified
     */
    public void incrementStock() {
        stock++;
    }

    /**
     * Overrides the toString method from Object class
     * Polymorphism: Demonstrates runtime polymorphism
     *
     * @return A string representation of the product
     */
    @Override
    public String toString() {
        return name + " - ₱" + price + " (Stock: " + stock + ")";
    }
}
