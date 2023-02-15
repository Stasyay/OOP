import java.util.Date;
public class Product {

    private String name;
    private double price;
    private Date loadDate = new Date();

    public Product(){
        this(" ",0);
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void setLoadDate(Date loadDate) {
        this.loadDate = loadDate;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return String.format("наименование %s цена %f дата загрузки %s", name, price, loadDate.toString());
    }


    @Override
    public boolean equals(Object o) {
        return (this.name.equals(((Product) o).name) && this.price == (((Product) o).price));
    }

    @Override
    public int hashCode() {
        return name.hashCode() + (int) price;
    }
}
