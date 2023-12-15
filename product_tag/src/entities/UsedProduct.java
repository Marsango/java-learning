package entities;
import java.util.*;
public class UsedProduct extends Product{
    private Date manufactureDate;

    public UsedProduct(String name, double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }
    public String priceTag(){
        return super.getName() + "(used) $ " + super.getPrice() + " (Manufacture date: " + this.manufactureDate + ")";
    }
}
