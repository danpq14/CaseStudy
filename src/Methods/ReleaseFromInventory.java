package Methods;

import Product.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReleaseFromInventory {
    public static void release(ArrayList<Product> products) throws IOException {
        Scanner sc = new Scanner(System.in);
        int index = Search.search(products);
        if (index != -1) {
            int current = products.get(index).getInventoryNumber();
            System.out.println("Số lượng tồn kho : "+ current);
            System.out.println("Nhập số lượng xuất : ");
            int numberExport = sc.nextInt();
            sc.nextLine();
            if (numberExport < current) {
                products.get(index).setInventoryNumber(current - numberExport);
                System.out.println("Xuất kho thành công");
                String content = products.get(index).getName() + "| Xuất kho : " + numberExport;
                ReleaseDataToFile.excute(content);
            }
            else {
                System.out.println("Ko đủ số lượng để xuất");
            }
        }
    }
}
