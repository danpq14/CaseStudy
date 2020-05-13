package Methods;

import Product.Product;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PurchaseToInventory {
    public static void purchase(ArrayList<Product> products) throws IOException {
        Scanner sc = new Scanner(System.in);
        int index = Search.search(products);
        if (index != -1) {
            System.out.println("Nhập số lượng hàng mới nhập về :");
            int number = sc.nextInt();
            int old = products.get(index).getInventoryNumber();
            products.get(index).setInventoryNumber(old + number);
            System.out.println("Nhập kho thành công");
            String content = products.get(index).getName() + "| Nhập kho : " + number;
            PurchaseDataToFile.excute(content);
        }
        else {
            System.out.println("Ko tìm thấy sản phẩm");
        }
    }
}
