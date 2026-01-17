package com.mycompany.app;

package com.example.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

// Java Record (introduced in Java 16) for concise data carriers
// Automatically provides equals(), hashCode(), toString(), and getters
public record Product(
    String productId,
    String productName,
    BigDecimal unitPrice, // Changed to BigDecimal for precise monetary calculations
    int stockQuantity,
    LocalDate manufacturingDate,
    String category // New field added
) {

    // You can add constructors, methods, and validations in records
    // Compact constructor for validation (no explicit parameters)
    public Product {
        Objects.requireNonNull(productId, "Product ID cannot be null");
        Objects.requireNonNull(productName, "Product name cannot be null");
        Objects.requireNonNull(unitPrice, "Unit price cannot be null");
        Objects.requireNonNull(manufacturingDate, "Manufacturing date cannot be null");
        Objects.requireNonNull(category, "Category cannot be null");

        if (stockQuantity < 0) {
            throw new IllegalArgumentException("Stock quantity cannot be negative");
        }
        if (unitPrice.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Unit price cannot be negative");
        }
    }

    // Example of a custom method in a record
    public boolean isInStock() {
        return this.stockQuantity > 0;
    }

    // Example of a derived field (not stored, computed) - for demonstration
    public int daysSinceManufacture() {
        return (int) java.time.temporal.ChronoUnit.DAYS.between(manufacturingDate, LocalDate.now());
    }
}
