package ro.ase.cts.dp.factorymethod;

import ro.ase.cts.dp.simplefactory.AbstractWeapon;
import ro.ase.cts.dp.simplefactory.WeaponType;

public class RealWeaponsFactory extends AbstractFactory {
    @Override
    public AbstractWeapon getWeapon(WeaponType type, String description) {

        AbstractWeapon weapon = null;
        switch (type) {
            case PISTOL:
                weapon = new WaterPistol();
                break;
            case MACHINE_GUN:
                weapon = new WaterBalloon();
                break;
            case BAZOOKA:
                weapon = new WaterBucket();
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return weapon;
    }
}

