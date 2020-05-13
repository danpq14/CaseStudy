package Methods;

import Product.Product;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Save {
    public static void saveToFile(ArrayList<Product> products) throws IOException {
        File saveFile = new File("C:\\Users\\hp\\Desktop\\Module 2\\CaseStudy\\ListProduct.txt");
        if (!saveFile.exists()){
            saveFile.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(saveFile);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(writer);
        String line = "";
        for (Product item : products) {
            line = item.writeToFile();
            printWriter.println(line);
        }
        writer.flush();
        writer.close();
    }
}
