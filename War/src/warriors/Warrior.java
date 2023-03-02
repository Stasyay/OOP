package warriors;

import armors.Guard;
import weapons.Weapon;

import java.util.Random;

public abstract class Warrior <T1 extends Weapon, T2 extends Guard> {
    private String name;
    protected T1 weapon;
    protected T2 guard;
    protected Random rnd = new Random();
    private int healthPoint;


    public Warrior(String name, T1 weapon, T2 guard) {
        this.name = name;
        this.weapon = weapon;
        this.guard = guard;
        this.healthPoint = 100;

    }

    public int getHealthPoint() {
        return healthPoint;
    }


    public int getMaxDamage(){
        return weapon.damage();
    }

    public int getMaxProtection(){
        return guard.Protection();
    }
    public void reduceHealthPoint(int damage) {
        int protection = 0;
        protection = rnd.nextInt(guard.Protection());
        this.healthPoint -= damage - protection;
    }


public int hitDamage(Warrior enemy) {
    int damage = 0;
    if (healthPoint > 0) {
        damage = rnd.nextInt(weapon.damage());
        enemy.reduceHealthPoint(damage);
    }
    return damage;
}

    @Override
    public String toString() {
        return "Warrior{" + "name='" + name + '\'' + ", weapon='" + weapon + '\''  + ", guard='" + guard + '\''+ ", healthPoint=" + healthPoint + '}';
    }
}
