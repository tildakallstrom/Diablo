package fundamentals.items.weapons;

import fundamentals.items.Slot;

import fundamentals.rpg_Characters.Hero;
import fundamentals.rpg_Characters.Warrior;
import fundamentals.rpg_Characters.exceptions.InvalidWeaponException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {

    @Test
    //test if name is added
    void testSetName() {
        String expectedName = "Axe 1";
        Weapon testSetName = new Weapon(expectedName, 1, WeaponType.Axe, 1, 1);

        testSetName.setName(expectedName);
        assertEquals(expectedName, testSetName.getName());
    }

    @Test
    //test if weapontype is added
    void testSetWeaponType() {
        WeaponType expectedWeaponType = WeaponType.Axe;
        Weapon testSetWeaponType = new Weapon("Axe 1", 1, expectedWeaponType, 1, 1);

        assertEquals(expectedWeaponType, testSetWeaponType.getWeaponType());
    }

    @Test
    //test if required level is added to new weapon
    void testRequiredLevel() {
        int expectedRequiredLevel = 1;
        Weapon testSetRequiredLevel = new Weapon("Axe 2", expectedRequiredLevel, WeaponType.Axe, 1, 1);

        assertEquals(expectedRequiredLevel, testSetRequiredLevel.getRequiredLevel());
    }

    @Test
    //test if hero can equip weapon
    void testEquip() {
        Weapon AxeWeapon = new Weapon("Axe 2", 1, WeaponType.Axe, 1, 1);
        Hero hero = new Warrior("Warren");


        assertDoesNotThrow(() -> hero.equip(AxeWeapon));
    }

    @Test
    //test that weapons cannot have negative damage
    void negativeDamage() {
        assertThrows(InvalidWeaponException.class, () -> new Weapon("Axe 2", 1, WeaponType.Axe, -10, 1));
    }

    @Test
        //test that weapons cannot have negative attacksPerSecond
    void negativeAttacksPerSecond() {
        assertThrows(InvalidWeaponException.class, () -> new Weapon("Axe 2", 1, WeaponType.Axe, 1, -5));
    }

}