package Product;

public class Tiles extends Product {
    private String material;

    public Tiles(String name, String id, int price, String brand, String material) {
        super(name, id, price, brand);
        this.material = material;
    }

    public Tiles() {
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    @Override
    public String toString() {
        String tile ="Loại sản phẩm : Gạch |" + " Tên sp : "+getName()+ " | Thương hiệu : " +getBrand()+ " | Mã sp : "+getId()+ " | Giá sp : "+getPrice()+"/m2"+" | Chất liệu : "+ getMaterial()+ " | Tồn kho : "+getInventoryNumber()+ "m2";
        return tile;
    }

    @Override
    public String writeToFile(){
        return getName()+","+getId()+","+getBrand()+","+getPrice()+","+getMaterial()+","+getInventoryNumber()+",gạch";
    }
}
