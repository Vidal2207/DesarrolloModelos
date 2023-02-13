public abstract class Producto{
    String description = "Unknown Product";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
} 