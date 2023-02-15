import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    protected List<Product> productList = new ArrayList<Product>();

    private double cash;

    public List<Product> getProductList() {
        return productList;
    }

    public VendingMachine addProduct(Product inputProduct) {
        productList.add(inputProduct);
        inputProduct.setLoadDate(Date.valueOf(LocalDate.now()));
        return this;
    }

    @Override
    public String toString() {
        StringBuilder productString = new StringBuilder();
        for (Product product : productList){
            productString.append(product.toString());
            productString.append("\n");
        }
        productString.append(cash+ "\n");
        return productString.toString();
    }

    public List<Product> findProduct(String name) {
        List<Product> foundProduct = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                foundProduct.add(product);
            }
        }
        return foundProduct;
    }

    public Product sellProduct(Product sallingProduct) {
        Product sellProduct = new Product();
        if (productList.contains(sallingProduct)) {
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i) == sallingProduct) {
                    sellProduct = productList.get(i);
                    productList.remove(i);
                    cash += sellProduct.getPrice();
                    return sellProduct;
                }
            }
        }

        return sellProduct;
    }
}
