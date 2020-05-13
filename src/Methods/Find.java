package Methods;

import Product.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Find {
    public static void  find(ArrayList<Product> products) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. Tìm kiếm theo tên ");
            System.out.println("2. Tìm kiếm theo mã");
            System.out.println("3. Tìm kiếm theo thương hiệu");
            System.out.println("4. Tìm kiếm theo chủng loại");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("Nhập tên sản phẩm cần tìm kiếm : ");
                String name = sc.nextLine().toLowerCase();
                int productFound = 0;
                for (Product item : products) {
                    String itemName = item.getName().toLowerCase();
                    if (itemName.contains(name)) {
                        System.out.println(item.toString());
                        productFound++;
                    }
                }
                if (productFound == 0) {
                    System.out.println("Ko tìm thấy sản phẩm như yêu cầu");
                }
//                sc.nextLine();
                break;
            }
            else if (choice == 2) {
                System.out.println("Nhập mã sản phẩm cần tìm kiếm : ");
                String id = sc.nextLine().toLowerCase();
                int productFound = 0;
                for (Product item : products) {
                    String itemID = item.getId().toLowerCase();
                    if (itemID.contains(id)) {
                        System.out.println(item.toString());
                        productFound++;
                    }
                }
                if (productFound == 0) {
                    System.out.println("Ko tìm thấy sản phẩm như yêu cầu");
                }
//                sc.nextLine();
                break;
            }
            else if (choice == 3) {
                System.out.println("Nhập tên thương hiệu cần tìm kiếm : ");
                String brand = sc.nextLine().toLowerCase();
                int productFound = 0;
                for (Product item : products) {
                    String itemBrand = item.getBrand().toLowerCase();
                    if (itemBrand.contains(brand)) {
                        System.out.println(item.toString());
                        productFound++;
                    }
                }
                if (productFound == 0) {
                    System.out.println("Ko tìm thấy sản phẩm như yêu cầu");
                }
//                sc.nextLine();
                break;
            }

            else if (choice == 4) {
                System.out.println("1. Gạch");
                System.out.println("2. Thiết bị vệ sinh");
                int choiceWhat = sc.nextInt();
                sc.nextLine();
                if (choiceWhat == 1) {
                    for (Product item : products){
                        String itemToString = item.toString();
                        if (itemToString.contains("Gạch")){
                            System.out.println(itemToString);
                        }
                    }
                }
                else if (choiceWhat == 2) {
                    for (Product item : products){
                        String itemToString = item.toString();
                        if (itemToString.contains("TBVS")){
                            System.out.println(itemToString);
                        }
                    }
                }
//                sc.nextLine();
                break;
            }
        }
    }
}
