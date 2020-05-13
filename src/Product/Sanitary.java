package Product;

public class Sanitary extends Product {
    private String type;

    public Sanitary(String name, String id, int price, String brand, String type) {
        super(name, id, price, brand);
        this.type = type;
    }

    public Sanitary() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String sanitary = "Loại SP : TBVS " + " | Tên sp : "+getName()+" | Thương hiệu : "+getBrand()+ " | Mã sp : "+getId()+ " | Giá : "+getPrice()+ "/bộ"+" | Loại : "+getType()+ " | Tồn kho : " +getInventoryNumber();
        return sanitary;
    }

    @Override
    public String writeToFile(){
        return getName()+","+getId()+","+getBrand()+","+getPrice()+","+getType()+","+getInventoryNumber()+",tbvs";
    }
}
