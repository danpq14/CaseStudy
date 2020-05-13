package Methods;

import Product.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveProduct {
    public static void remove(ArrayList<Product> products) {
        Scanner sc = new Scanner(System.in);
        int index = Search.search(products);
        if (index != -1) {
            if  (products.get(index).getInventoryNumber() > 0) {
                System.out.println("Sản phẩm này vẫn còn tồn kho, bạn ko thể xóa !!");
            }
            else {
                System.out.println("Bạn chắc chắn muốn xóa sản phẩm này ?");
                System.out.println("1. Xóa");
                System.out.println("2. Thoát");
                int choice = sc.nextInt();
                sc.nextLine();
                if (choice == 1) {
                    products.remove(index);
                }

                //quay về menu
            }

        }
        else {
            System.out.println("Ko tìm thấy sản phẩm");
        }
    }
}
