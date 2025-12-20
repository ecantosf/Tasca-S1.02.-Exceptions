package sale.sp1ta2le1;

import java.util.ArrayList;

public class Sale {

    private ArrayList<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double calculateTotal() throws EmptySaleException {
        if (products.isEmpty()) {
            throw new EmptySaleException();
        }

        double calculatedTotal = 0.0;
        for (Product product : products) {
            calculatedTotal += product.getPrice();
        }
        this.totalPrice = calculatedTotal;
        return calculatedTotal;
    }

}
