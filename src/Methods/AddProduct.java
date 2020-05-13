package Methods;

import Product.Product;
import Product.*;


import java.util.ArrayList;
import java.util.Scanner;

public class AddProduct {
    public static void add(ArrayList<Product> products) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Thêm mới sản phẩm");
        System.out.println("Loại Sản phẩm muốn thêm : ");
        System.out.println("1. Gạch ");
        System.out.println("2. Thiết Bị Vệ Sinh ");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            System.out.println("Nhập tên sản phẩm : ");
            String name = sc.nextLine();
            for (Product item : products) {
                if (name.equalsIgnoreCase(item.getName())) {
                    System.out.println("Tên sản phẩm đã bị trùng, vui lòng nhập lại : ");
                    name = sc.nextLine();
                }
            }
            System.out.println("Nhập mã sản phẩm : ");
            String id = sc.nextLine();
            for (Product item : products) {
                if (id.equalsIgnoreCase(item.getId())) {
                    System.out.println("Mã sản phẩm đã bị trùng, vui lòng nhập lại : ");
                    id = sc.nextLine();
                }
            }

            System.out.println("Nhập thương hiệu : ");
            String brand = sc.nextLine();
            System.out.println("Nhập giá sản phẩm : ");
            int price = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhập chất liệu (granite,ceramics,porcelain) :");
            System.out.println("Thông tin này ko thay đổi được, hãy nhập chính xác !! ");
            String material = sc.nextLine();
            Tiles newTile = new Tiles(name, id, price, brand, material);
            products.add(newTile);
            System.out.println("Thêm mới sản phẩm thành công!!");
        }
        else if (choice == 2) {
            System.out.println("Nhập tên sản phẩm : ");
            String name = sc.nextLine();
            for (Product item : products) {
                if (name.equalsIgnoreCase(item.getName())) {
                    System.out.println("Tên sản phẩm đã bị trùng, vui lòng nhập lại : ");
                    name = sc.nextLine();
                }
            }
            System.out.println("Nhập mã sản phẩm : ");
            String id = sc.nextLine();
            for (Product item : products) {
                if (id.equalsIgnoreCase(item.getId())) {
                    System.out.println("Mã sản phẩm đã bị trùng, vui lòng nhập lại : ");
                    id = sc.nextLine();
                }
            }

            System.out.println("Nhập thương hiệu : ");
            String brand = sc.nextLine();
            System.out.println("Nhập giá sản phẩm : ");
            int price = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhập loại sản phẩm (Sen tắm,Vòi chậu,Bồn cầu) :");
            System.out.println("Thông tin này ko thay đổi được, hãy nhập chính xác !! ");
            String type = sc.nextLine();
            Sanitary newSanitary = new Sanitary(name, id, price, brand, type);
            products.add(newSanitary);
            System.out.println("Thêm mới sản phẩm thành công!!");
        }
    }
}
