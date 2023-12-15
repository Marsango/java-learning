package entities;
public class ImportedProduct extends Product{
    private double customsFee;

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double totalPrice(){
        return super.getPrice() + customsFee;
    }
    @Override
    public String priceTag(){
        return super.priceTag() + " (Customs fee: $ " + this.customsFee + ")";
    }
}
