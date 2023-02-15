import java.time.LocalDate;

public class Perishable extends Product {

//   public SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private LocalDate expireDate;

    public Perishable(String name, double cost, LocalDate expireDate) {
        super(name, cost);
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        StringBuilder perishableString = new StringBuilder(super.toString());
        perishableString.append(String.format(" годен до %s", expireDate));
        return perishableString.toString();
    }
}

