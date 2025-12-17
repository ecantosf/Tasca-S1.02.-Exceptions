package sale.sp1ta2le1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Demostració de l'excepció IndexOutOfBoundsException");
        try {
            ArrayList<String> otherList = new ArrayList<>();
            otherList.add("Element 1");
            otherList.add("Element 2");

            String element = otherList.get(5);
            System.out.println("Element obtingut: " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error d'accés a llista: " + e.getMessage());
            System.out.println("No es pot accedir a una posició que no existeix a la llista.");
        }

        System.out.println("\nÚs de la classe Sale:");

        Product product1 = new Product("Monitor", 199.9);
        Product product2 = new Product("Keyboard", 45.0);
        Product product3 = new Product("Headphones", 89.50);

        // Crear una venda
        Sale venda = new Sale();

        // Afegir productes a la venda
        venda.getProducts().add(product1);
        venda.getProducts().add(product2);
        venda.getProducts().add(product3);

        try {
            // Calcular el total
            double total = venda.calculateTotal();
            System.out.println("Total de la venda: " + total + " €");

            // Mostrar els productes de la venda
            System.out.println("\nProductes a la venda:");
            for (int i = 0; i < venda.getProducts().size(); i++) {
                Product p = venda.getProducts().get(i);
                System.out.println((i + 1) + ". " + p.getName() + ": " + p.getPrice() + " €");
            }
        } catch (EmptySaleException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nVenda buida (prova de l'excepció)");

        // Crear una venda buida
        Sale vendaBuida = new Sale();

        try {
            double total = vendaBuida.calculateTotal();
            System.out.println("Total: " + total + " €");
        } catch (EmptySaleException e) {
            System.out.println("Excepció capturada: " + e.getMessage());
        }

        System.out.println("\nFi del programa.");

    }
}
