package sale.sp1ta2le1;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //Es prodira introduir millora de set bàsic per assegurar que s'entrana nom:
        //if (name == null || name.trim().isEmpty()) {
        //    throw new IllegalArgumentException("Product name cannot be null or empty");
        //}
    }

    public double getPrice() {
        return price;
        // Millora: Validació de preu
        //if (price < 0) {
        //    throw new IllegalArgumentException("Price cannot be negative");
        //}
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
