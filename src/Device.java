import java.time.LocalDate;

public class Device extends Product {
    private String brand;
    private String color;
    private LocalDate isNew;
    private int memory;

    public Device() {
    }

    public Device(String brand, String color, LocalDate isNew, int memory) {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getIsNew() {
        return isNew;
    }

    public void setIsNew(LocalDate isNew) {
        this.isNew = isNew;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
