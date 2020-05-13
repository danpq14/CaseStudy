package Methods;

import Product.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckInventory {
    public static void checkInventory(ArrayList<Product> products){
        Scanner sc = new Scanner(System.in);
        int index = Search.search(products);
        if (index != -1) {
            int number = products.get(index).getInventoryNumber();
            System.out.println("Số lượng tồn kho của sản phẩm : " + number);
        }
        else {
            System.out.println("Ko tìm thấy sản phẩm");
        }
    }
}
