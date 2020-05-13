package Methods;

import Product.Product;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Save {
    public static void saveToFile(ArrayList<Product> products) throws IOException {
        File saveFile = new File("C:\\Users\\hp\\Desktop\\Module 2\\CaseStudy\\ListProduct.txt");
        if (!saveFile.exists()){
            saveFile.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(saveFile, true);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        String line = "";
        for (Product item : products) {
            line = products.toString();
            writer.write(line);
        }
        writer.flush();
        writer.close();
    }
}
