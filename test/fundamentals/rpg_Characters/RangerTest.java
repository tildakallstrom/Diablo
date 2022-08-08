package fundamentals.rpg_Characters;

import fundamentals.items.Slot;
import fundamentals.items.armor.Armor;
import fundamentals.items.armor.ArmorType;
import fundamentals.items.weapons.Weapon;
import org.junit.jupiter.api.Test;

import static fundamentals.items.weapons.WeaponType.Bow;
import static fundamentals.items.weapons.WeaponType.Dagger;
import static org.junit.jupiter.api.Assertions.*;

class RangerTest {
    @Test
        //check if level up works
    void testLevelUp() {
        Hero hero = new Ranger("Sean");
        hero.levelUp();

        int expected = 2;
        assertEquals(expected, hero.getLevel());
    }

    @Test
        //check if hero gets higher attributes with higher level
    void testAttributes() {
        Hero hero = new Ranger("Sean");
        hero.levelUp();

        Attributes expected = new Attributes (2, 12, 2);
        assertEquals(expected.getStrength(), hero.totalAttributes().getStrength());
        assertEquals(expected.getDexterity(), hero.totalAttributes().getDexterity());
        assertEquals(expected.getIntelligence(), hero.totalAttributes().getIntelligence());
    }



    @Test
        //test if attributes change with armor
    void testAttributesArmor() {
        Hero hero = new Ranger("Sean");
        Armor armor = new Armor(ArmorType.Leather, "Armor", Slot.Body, 1, new Attributes(1, 1, 1));
        hero.equipArmor(armor);

        Attributes expected = new Attributes (2, 8, 2);
        assertEquals(expected.getStrength(), hero.totalAttributes().getStrength());
        assertEquals(expected.getDexterity(), hero.totalAttributes().getDexterity());
        assertEquals(expected.getIntelligence(), hero.totalAttributes().getIntelligence());
    }

    @Test
        //test if character dps gets higher with every level
    void testHigherLvlDPS() {
        Hero hero = new Ranger("Sean");
        hero.levelUp();

        float expected = 1.12f;
        assertEquals(expected, hero.characterDPS());
    }
}