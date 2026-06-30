package product;

import java.util.Arrays;
import java.util.Comparator;

public class ECommerceSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, String name) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int cmp = products[mid].productName.compareToIgnoreCase(name);

            if (cmp == 0) return products[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {

        // Step 1: Create product array
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Phone", "Electronics"),
            new Product(4, "Watch", "Accessories"),
            new Product(5, "Bag", "Fashion")
        };

        // Step 2: Linear Search
        System.out.println("Linear Search Result:");
        Product result1 = linearSearch(products, "Phone");
        System.out.println(result1);

        // Step 3: Sort array for binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // Step 4: Binary Search
        System.out.println("\nBinary Search Result:");
        Product result2 = binarySearch(products, "Phone");
        System.out.println(result2);
    }
}