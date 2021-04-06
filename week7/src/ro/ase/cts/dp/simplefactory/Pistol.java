package ro.ase.cts.dp.simplefactory;

public class Pistol extends AbstractWeapon {

    public Pistol(String desc, int power) {
        this.description = desc;
        this.powerLevel = power;
    }

    @Override
    public void pewPew() {

    }
}
