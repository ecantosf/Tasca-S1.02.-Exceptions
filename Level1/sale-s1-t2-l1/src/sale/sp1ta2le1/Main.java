package sale.sp1ta2le1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Prova 1. Demostració de l'excepció IndexOutOfBoundsException:");
        try {
            ArrayList<String> otherList = new ArrayList<>();
            otherList.add("Item 1");
            otherList.add("Item 2");

            String element = otherList.get(4);
            System.out.println("Element obtingut: " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error d'accés a llista: " + e.getMessage());
            System.out.println("No es pot accedir a una posició que no existeix a la llista.");
        }

        System.out.println("\nProva 2. Ús de la classe Sale:");

        Product product1 = new Product("Monitor", 199.9);
        Product product2 = new Product("Keyboard", 45.0);
        Product product3 = new Product("Headphones", 89.50);

        // Crear una venda
        Sale sales = new Sale();

        // Afegir productes a la venda
        sales.getProducts().add(product1);
        sales.getProducts().add(product2);
        sales.getProducts().add(product3);

        try {
            // Calcular el total
            double totalSales = sales.calculateTotal();
            System.out.println("Total de la venda: " + totalSales + " €");

            // Mostrar els productes de la venda
            System.out.println("\nProductes a la venda:");
            for (int i = 0; i < sales.getProducts().size(); i++) {
                Product p = sales.getProducts().get(i);
                System.out.println((i + 1) + ". " + p.getName() + ": " + p.getPrice() + " €");
            }
        } catch (EmptySaleException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProva 3. Venda buida (prova de l'excepció):");

        // Crear una venda buida
        Sale emptySale = new Sale();

        try {
            double total = emptySale.calculateTotal();
            System.out.println("Total: " + total + " €");
        } catch (EmptySaleException e) {
            System.out.println("Excepció capturada: " + e.getMessage());
        }

        System.out.println("\nFi del programa.");

    }
}
