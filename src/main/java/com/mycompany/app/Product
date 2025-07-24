package com.mycompany.app;

import java.time.LocalDate;
import java.util.Objects;

public class Product {

    private String id;
    private String name;
    private double price;
    private int quantity;
    private LocalDate manufacturingDate;

    public Product() {
    }

    public Product(String id, String name, double price, int quantity, LocalDate manufacturingDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufacturingDate = manufacturingDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 &&
               quantity == product.quantity &&
               Objects.equals(id, product.id) &&
               Objects.equals(name, product.name) &&
               Objects.equals(manufacturingDate, product.manufacturingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, quantity, manufacturingDate);
    }

    @Override
    public String toString() {
        return "Product{" +
               "id='" + id + '\'' +
               ", name='" + name + '\'' +
               ", price=" + price +
               ", quantity=" + quantity +
               ", manufacturingDate=" + manufacturingDate +
               '}';
    }
}
