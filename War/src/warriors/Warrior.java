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
    private int protection;

    public Warrior(String name, T1 weapon, T2 guard) {
        this.name = name;
        this.weapon = weapon;
        this.guard = guard;
        this.healthPoint = 100;
        this.protection = 100;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getProtection() {
        return protection;
    }

    public int getMaxDamage(){
        return weapon.damage();
    }
    public void reduceHealthPoint(int damage) {
        this.healthPoint -= damage;
    }

    public void currentProtection(){
        this.protection -= guard.reduceProtection();

    }

    public int hit(Warrior enemy) {
        int damage = 0;
        if (getProtection() > 0)
            currentProtection();
        else if (healthPoint > 0) {
            damage = rnd.nextInt(weapon.damage());
            enemy.reduceHealthPoint(damage);

        }
        return damage;
    }
//    public int hitDamage(Warrior enemy) {
//        int damage = rnd.nextInt(weapon.damage());
//        enemy.reduceHealthPoint(damage);
//        return damage;
//    }

    @Override
    public String toString() {
        return "Warrior{" + "name='" + name + '\'' + ", weapon='" + weapon + '\''  + ", guard='" + getProtection() + '\''+ ", healthPoint=" + healthPoint + '}';
    }
}
