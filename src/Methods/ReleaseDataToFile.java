package Methods;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class ReleaseDataToFile {
    public static void excute(String content) throws IOException {
        Date date = new Date();
        String time = date.toString();
        content = content + "| Ngày giờ xuất : " + time;
        String fileImportPath = "C:\\Users\\hp\\Desktop\\Module 2\\CaseStudy\\src\\File\\RealeaseData.txt";
        File fileImport = new File(fileImportPath);
        if (!fileImport.exists()){
            fileImport.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(fileImport, true);
        PrintWriter writer = new PrintWriter(fileWriter);
        writer.println(content);
        writer.close();
    }
}
