package Methods;

import Product.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {
    public static int search(ArrayList<Product> products) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên hoặc mã sản phẩm :");
        String word = sc.nextLine().toLowerCase();
        for (int i = 0; i < products.size(); i++) {
            String name = products.get(i).getName().toLowerCase();
            String id = products.get(i).getId().toLowerCase();
            if (name.contains(word) || id.contains(word)) {
                System.out.println(products.get(i).toString());
                return i;
            }
        }
        return -1;
    }
}
