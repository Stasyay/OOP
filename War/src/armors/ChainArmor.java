package armors;

public class ChainArmor implements Guard{

    @Override
    public int reduceProtection() {
        return 30;
    }

}
