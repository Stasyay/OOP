package warriors;


import armors.Armor;
import armors.Guard;
import weapons.Sword;
import weapons.Weapon;

public class SwordMan extends Warrior<Sword, Guard> {

    public SwordMan(String name, Sword weapon, Guard guard) {
        super(name, weapon, guard);
    }


    @Override
    public String toString() {
        return super.toString() + " Type = SwordMan";
    }
}
