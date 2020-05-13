package Methods;

import Product.Product;
import Product.*;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImportFromFile {
    public static void importFromFile(String filePath, ArrayList<Product> products) throws IOException {
        products.clear();
        File sourceFile = new File(filePath);
        FileReader fileReader = new FileReader(sourceFile);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = "";
        while ((line = reader.readLine())!= null) {
           String[] arr = line.split(",");
           String name = arr[0];
           String id     = arr[1];
           String brand = arr[2];
           int price = Integer.parseInt(arr[3]);
           String material = arr[4];
           int inventoryNumber = Integer.parseInt(arr[5]);
           String type = arr[6];
            if (type.equalsIgnoreCase("gạch")){
                Product newTiles = new Tiles(name, id, price, brand, material);
                newTiles.setInventoryNumber(inventoryNumber);
                products.add(newTiles);
            }
            else {
                Product newSanitary = new Sanitary(name, id, price, brand, material);
                newSanitary.setInventoryNumber(inventoryNumber);
                products.add(newSanitary);
            }
        }
        reader.close();
    }
}
