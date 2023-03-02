package armors;

public class Armor implements Guard {


    @Override
    public int Protection() {
        return 9;
    }

    @Override
    public String toString() {
        return "Armor{" + "Protection= " + Protection() + "}";
    }
}
