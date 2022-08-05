package fundamentals.items.weapons;

import fundamentals.items.Slot;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {
    Weapon testWeapon = new Weapon();
    testWeapon.setName = ("Common axe");
    testWeapon.setLevel(1);
    testWeapon.setSlot(Slot.WEAPON);
    testWeapon.setWeaponType(WeaponType.AXE);
    testWeapon.setDamage(7);
    testWeapon.setAttackSpeed(1.1);
}