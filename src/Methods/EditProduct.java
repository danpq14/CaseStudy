package Methods;

import Product.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EditProduct {
    public static void edit(ArrayList<Product> products) throws IOException {
        Scanner sc = new Scanner(System.in);
        int index = Search.search(products);
        if (index != -1) {
            System.out.println("Bạn muốn sửa thông tin gì : ");
            System.out.println("1. Sửa tên");
            System.out.println("2. Sửa mã");
            System.out.println("3. Sửa thương hiệu");
            System.out.println("4. Sửa giá");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1 ) {
                System.out.println("Nhập tên mới : ");
                String newName = sc.nextLine();
                products.get(index).setName(newName);
            }
            if (choice == 2 ) {
                System.out.println("Nhập mã mới : ");
                String newId = sc.nextLine();
                products.get(index).setId(newId);
            }
            if (choice == 3 ) {
                System.out.println("Nhập tên thương hiệu mới : ");
                String newBrand = sc.nextLine();
                products.get(index).setBrand(newBrand);
            }
            if (choice == 4 ) {
                System.out.println("Nhập giá mới : ");
                int newPrice = sc.nextInt();
                sc.nextLine();
                products.get(index).setPrice(newPrice);
            }
            System.out.println("Sửa thành công !!");
            System.out.println(products.get(index).toString());
        }
        if (index == -1) {
            System.out.println("Ko tìm thấy sản phẩm");
        }
        Save.saveToFile(products);
    }
}
