package armors;

public class ChainArmor implements Guard{

    @Override
    public int Protection() {
        return 5;
    }

    @Override
    public String toString() {
        return "ChainArmor{" + "Protection= " + Protection() + "}";
    }
}
