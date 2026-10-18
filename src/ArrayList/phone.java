package ArrayList;

public class phone {
    private String brand;

    public phone(String brand, String price) {
        this.brand = brand;
        this.price = price;
    }
public  phone(){}
    private  String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
