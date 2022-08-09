package fundamentals.items.armor;

import fundamentals.items.Slot;
import fundamentals.items.weapons.Weapon;
import fundamentals.rpg_Characters.Attributes;
import fundamentals.rpg_Characters.Hero;
import fundamentals.rpg_Characters.Mage;
import fundamentals.rpg_Characters.Rogue;
import fundamentals.rpg_Characters.exceptions.InvalidArmorException;
import org.junit.jupiter.api.Test;

import static fundamentals.items.weapons.WeaponType.Dagger;
import static org.junit.jupiter.api.Assertions.*;

class ArmorTest {
    @Test
        //test if name can be changed
    void testPlateBody_setName() {
        Armor testPlateBody = new Armor(ArmorType.Plate, "Plate plate", Slot.Head, 1, new Attributes(1, 1, 1));
        String expectedName = "Plate 1";

        testPlateBody.setName(expectedName);
        assertEquals(expectedName, testPlateBody.getName());
    }

    @Test
        //test if created armor gets the name its given
    void testSetName() {
        String expectedName = "Plate 1";
        Armor testSetName = new Armor(ArmorType.Plate, expectedName, Slot.Head, 1, new Attributes(1, 1, 1));

        assertEquals(expectedName, testSetName.getName());
    }

    @Test
        //test if created armor gets the armortype its given
    void testSetArmorType() {
        ArmorType expectedArmorType = ArmorType.Plate;
        Armor testSetArmorType = new Armor(expectedArmorType, "Plate 2", Slot.Head, 1, new Attributes(1, 1, 1));

        assertEquals(expectedArmorType, testSetArmorType.getArmorType());
    }

    @Test
        //throw exception since you cant place armor in weapon slot
    void testWeaponSlot() {
        assertThrows(InvalidArmorException.class, () -> new Armor(ArmorType.Plate, "Plate plate", Slot.Weapon, 1, new Attributes(1, 1, 1)));
    }

    @Test
    void testRequiredLevel() {
        Armor testRequiredLevel = new Armor(ArmorType.Plate, "Plate plate", Slot.Head, 1, new Attributes(1, 1, 1));
        int expectedRequiredLevel = 2;

        testRequiredLevel.setRequiredLevel(expectedRequiredLevel);
        assertEquals(expectedRequiredLevel, testRequiredLevel.getRequiredLevel());
    }

    @Test
    void testEquipArmor() {
        Armor ClothArmor = new Armor(ArmorType.Cloth, "ClothArmor", Slot.Body, 1, new Attributes(1, 1, 1));
        Hero hero = new Mage("Dean");

        hero.equipArmor(ClothArmor);
    }
}