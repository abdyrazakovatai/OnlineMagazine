import java.math.BigDecimal;
import java.time.LocalDate;

public class Product {
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDate createdAt;

    public Product() {
    }

    public Product(String name, String description, BigDecimal price, LocalDate createdAt) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

}
