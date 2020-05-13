package Client;

import Manager.ProductManager;
import Product.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClient {
    public static void showMenu(){
        System.out.println("Menu");
        System.out.println("1. Tìm Kiếm Sản Phẩm ");
        System.out.println("2. Thêm loại Sản Phẩm mới ");
        System.out.println("3. Chỉnh sửa Sản Phẩm ");
        System.out.println("4. Xóa Sản Phẩm  ");
        System.out.println("5. Kiểm tra Tồn Kho ");
        System.out.println("6. Nhập hàng");
        System.out.println("7. Xuất hàng");
        System.out.println("0. Thoát chương trình");
    }

    public static void backToMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Quay về Menu chính");
        int backToMenu = sc.nextInt();
        sc.nextLine();
        if (backToMenu == 1) {
            userChoice();
        }
        else {
            System.out.println("Chọn sai. Sẽ tự động thoát chương trình");
            System.exit(0);
        }
    }
    public static void userChoice() throws IOException {
        Scanner sc = new Scanner(System.in);
        ProductManager manager = ProductManager.getInstance();
        manager.importFromFile();
        int choice = -1;
        while (choice != 0) {
            showMenu();
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 :
                    manager.find();
                    backToMenu();
                case 2:
                    manager.addProduct();
                    backToMenu();
                case 3:
                    manager.editProduct();
                    backToMenu();
                case 4:
                    manager.removeProduct();
                    backToMenu();
                case 5:
                    manager.checkInventory();
                    backToMenu();
                case 6:
                    manager.purchase();
                    backToMenu();
                case 7:
                    manager.release();
                    backToMenu();
            }
        }
    }
}
