package Client;

import Manager.ProductManager;

import java.io.IOException;
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

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ProductManager manager = new ProductManager();
        System.out.println(">---Chương trình quản lý kho cửa hàng Nội Thất---<");

        int choice = -1;
        while (choice != 0) {
            showMenu();
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 :
                    manager.find();
                    showMenu();
                case 2:
                    manager.addProduct();
                    showMenu();
                case 3:
                    manager.editProduct();
                    showMenu();
                case 4:
                    manager.removeProduct();
                    showMenu();
                case 5:
                    manager.checkInventory();
                    showMenu();
            }
        }

    }
}
