package weapons;

public class Sword implements Weapon{
    @Override
    public int damage() {
        return 30;
    }
    @Override
    public String toString() {
        return "Damage sword = " + damage();
    }
}
