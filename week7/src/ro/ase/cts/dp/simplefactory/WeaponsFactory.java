package ro.ase.cts.dp.simplefactory;

public class WeaponsFactory {
    public static AbstractWeapon getWeapon(WeaponType type, String description) {   //mandatory to have .. don t use Strings
        AbstractWeapon weapon = null;
        switch (type) {
            case PISTOL:
                weapon = new Pistol(description, 100);
                break;
            case MACHINE_GUN:
                weapon = new MachineGun(500, 1000);
                break;
            case BAZOOKA:
                weapon = new Bazooka();
                break;
            default:
                throw new UnsupportedOperationException("Type not covered");
        }
        return weapon;

    }
}
