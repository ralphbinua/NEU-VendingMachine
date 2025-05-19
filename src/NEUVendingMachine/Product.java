/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NEUVendingMachine;

/**
 * Product class demonstrating Object-Oriented Programming principles:
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
 */
public class Product {
    private String name;
    private int price;
    private int stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public boolean isInStock() {
        return stock > 0;
    }

    public void decrementStock() {
        if (stock > 0) {
            stock--;
        }
    }

    public void incrementStock() {
        stock++;
    }

    @Override
    public String toString() {
        return name + " - ₱" + price + " (Stock: " + stock + ")";
    }
}
