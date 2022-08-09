package fundamentals.rpg_Characters;

import fundamentals.items.Slot;
import fundamentals.items.armor.Armor;
import fundamentals.items.armor.ArmorType;
import fundamentals.items.weapons.Weapon;
import org.junit.jupiter.api.Test;

import static fundamentals.items.weapons.WeaponType.Dagger;
import static fundamentals.items.weapons.WeaponType.Wand;
import static org.junit.jupiter.api.Assertions.*;

class MageTest {
    @Test
    //check if level up works
    void testLevelUp() {
        Hero hero = new Mage("Sean");
        hero.levelUp();

        int expected = 2;
        assertEquals(expected, hero.getLevel());
    }

    @Test
    //check if hero gets higher attributes with higher level
    void testAttributes() {
        Hero hero = new Mage("Sean");
        hero.levelUp();

        Attributes expected = new Attributes (2, 2, 13);
        assertEquals(expected.getStrength(), hero.totalAttributes().getStrength());
        assertEquals(expected.getDexterity(), hero.totalAttributes().getDexterity());
        assertEquals(expected.getIntelligence(), hero.totalAttributes().getIntelligence());
    }


    @Test
    //test if attributes change with armor
    void testAttributesArmor() {
        Hero hero = new Mage("Sean");
        Armor armor = new Armor(ArmorType.Cloth, "Armor", Slot.Body, 1, new Attributes(1, 1, 1));
        hero.equipArmor(armor);

        Attributes expected = new Attributes (2, 2, 9);
        assertEquals(expected.getStrength(), hero.totalAttributes().getStrength());
        assertEquals(expected.getDexterity(), hero.totalAttributes().getDexterity());
        assertEquals(expected.getIntelligence(), hero.totalAttributes().getIntelligence());
    }

    @Test
    //test if character dps gets higher with every level
    void testHigherLvlDPS() {
        Hero hero = new Mage("Sean");
        hero.levelUp();

        float expected = 1.13f;
        assertEquals(expected, hero.characterDPS());
    }

    @Test
        //test if character dps increases with equipped weapon
    void testCharacterDPS() {
        Weapon wand = new Weapon("Wand", 1, Wand, 2, 2);
        Hero hero = new Mage("Dean" );

        hero.equip(wand);

        float expected = 4.32f;

        assertEquals(hero.characterDPS(), expected);
    }

    @Test
    //test if armor gets equipped
    void testEquipArmor() {
        Hero hero = new Mage("Sean");
        Armor armor = new Armor(ArmorType.Cloth, "Armor", Slot.Body, 1, new Attributes(1, 1, 1));
        hero.equipArmor(armor);

        assertEquals(hero.getEquippedArmors().get(Slot.Body), armor);
    }

    @Test
    //test if weapon gets equipped
    void testEquipWeapon() {
        Weapon wand = new Weapon("Wand", 1, Wand, 2, 2);
        Hero hero = new Mage("Dean" );
        hero.equip(wand);

        assertEquals(hero.getEquippedWeapon().get(Slot.Weapon), wand);
    }
}
