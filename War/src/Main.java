import armors.Armor;
import armors.ChainArmor;
import armors.Guard;
import teams.Team;
import warriors.Archer;
import warriors.SwordMan;
import warriors.Warrior;
import weapons.Bow;
import weapons.Sword;

public class Main {
    public static void main(String[] args) {

        Team<Archer> archerTeam = new Team<>("Archers");
        archerTeam.addWarrior(new Archer("Vasya", new Bow(), new ChainArmor()))
                .addWarrior(new Archer("Petya", new Bow(), new ChainArmor()))
                .addWarrior(new Archer("Misha", new Bow(), new ChainArmor()))
                .addWarrior(new Archer("Grisha", new Bow(), new ChainArmor()));

        System.out.println(archerTeam);
        System.out.println("___________");

        Team<Warrior> mixTeam = new Team<>("Mixer");
        mixTeam.addWarrior(new Archer("Vasya", new Bow(), new ChainArmor()))
                .addWarrior(new SwordMan("Petya", new Sword(), new Armor()))
                .addWarrior(new Archer("Misha", new Bow(), new ChainArmor()))
                .addWarrior(new SwordMan("Grisha", new Sword(), new Armor()));

        System.out.println(mixTeam);

        SwordMan greg = new SwordMan("Grisha", new Sword(), new Armor());
        Archer misha = new Archer("Misha", new Bow(), new ChainArmor());

        while (greg.getHealthPoint() > 0 && misha.getHealthPoint()>0){

            greg.hit(misha);
            misha.hit(greg);
            System.out.printf("Брони у Гриши осталось: %d Брони у Миши осталось: %d \n", greg.getProtection(), misha.getProtection());
            System.out.printf("Здоровье Гриши: %d Здоровье Миши: %d \n", greg.getHealthPoint(), misha.getHealthPoint());
            System.out.println("____________");
;        }
        if (greg.getHealthPoint()>0)
            System.out.println("Гриша победил");
        else
            System.out.println("Миша победил");
    }
}