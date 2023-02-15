public class Beer extends Product{

    public Beer(String name, double price){
        super(name, price);
    }

    @Override
    public String toString() {
        StringBuilder beerString = new StringBuilder(super.toString());
        beerString.append(" Продажа только совершеннолетним!!!");
        return beerString.toString();
    }
}
