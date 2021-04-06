package ro.ase.cts.dp.factorymethod;

import ro.ase.cts.dp.simplefactory.AbstractWeapon;
import ro.ase.cts.dp.simplefactory.WeaponType;

public abstract class AbstractFactory {
    public abstract AbstractWeapon getWeapon(WeaponType type, String description);
}
