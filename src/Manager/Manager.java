package Manager;

import java.io.IOException;

public interface Manager {
    void addProduct() throws IOException;
    void editProduct() throws IOException;
    void removeProduct() throws IOException;
    void purchase() throws IOException;
    void release() throws IOException;
    void find();
    void checkInventory();
}
