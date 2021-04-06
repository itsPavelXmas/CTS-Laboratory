package ro.ase.cts.dp.simplefactory;

public class SuperHero {
    String name;

    AbstractWeapon weapon;

    public SuperHero(String name, AbstractWeapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void setWeapon(AbstractWeapon weapon) {
        this.weapon = weapon;
    }
}
