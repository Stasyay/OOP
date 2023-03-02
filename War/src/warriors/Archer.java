package warriors;

import armors.ChainArmor;
import armors.Guard;
import weapons.Bow;
import weapons.Weapon;

public class Archer extends Warrior<Bow, ChainArmor> implements DistanceAttacker{
    private int distance;
    private int protection;
    public Archer(String name, Bow weapon, ChainArmor guard) {
        super(name, weapon, guard);
        distance = weapon.getDistance() + rnd.nextInt(10);
        protection = guard.Protection() + rnd.nextInt(9);
    }

    public int getDistance(){
        return distance;
    }

    @Override
    public String toString() {
        return super.toString() + " Type = Archer{" + "distance =" + distance + " protection =" + protection + '}';
    }
}
