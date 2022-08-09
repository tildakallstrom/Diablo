package fundamentals.rpg_Characters;

import fundamentals.items.Slot;
import fundamentals.items.armor.Armor;
import fundamentals.items.armor.ArmorType;
import fundamentals.items.weapons.Weapon;
import org.junit.jupiter.api.Test;

import static fundamentals.items.weapons.WeaponType.*;
import static org.junit.jupiter.api.Assertions.*;

class RogueTest {


    @Test
        //check if level up works
    void testLevelUp() {
        Hero hero = new Rogue("Warren");
        hero.levelUp();

        int expected = 2;
        assertEquals(expected, hero.getLevel());
    }

    @Test
        //check if hero gets higher attributes with higher level
    void testAttributes() {
        Hero hero = new Rogue("Dean");
        hero.levelUp();

        Attributes expected = new Attributes (3, 10, 2);
        assertEquals(expected.getStrength(), hero.totalAttributes().getStrength());
        assertEquals(expected.getDexterity(), hero.totalAttributes().getDexterity());
        assertEquals(expected.getIntelligence(), hero.totalAttributes().getIntelligence());
    }

    @Test
        //test if attributes change with armor
    void testAttributesArmor() {
        Hero hero = new Rogue("Sean");
        Armor armor = new Armor(ArmorType.Leather, "Armor", Slot.Body, 1, new Attributes(1, 1, 1));
        hero.equipArmor(armor);

        Attributes expected = new Attributes (3, 7, 2);
        assertEquals(expected.getStrength(), hero.totalAttributes().getStrength());
        assertEquals(expected.getDexterity(), hero.totalAttributes().getDexterity());
        assertEquals(expected.getIntelligence(), hero.totalAttributes().getIntelligence());
    }

    @Test
        //test if character dps gets higher with every level
    void testHigherLvlDPS() {
        Hero hero = new Rogue("Sean");
        hero.levelUp();

        float expected = 1.1f;
        assertEquals(expected, hero.characterDPS());
    }
    @Test
        //test if character dps increases with equipped weapon
    void testCharacterDPS() {
        Weapon dagger = new Weapon("Dagger 1", 1, Dagger, 2, 2);
        Hero hero = new Rogue("Dean" );

        hero.equip(dagger);

        float expected = 4.24f;

        assertEquals(hero.characterDPS(), expected);
    }

    @Test
        //test if armor gets equipped
    void testEquipArmor() {
        Hero hero = new Rogue("Sean");
        Armor armor = new Armor(ArmorType.Leather, "Armor", Slot.Body, 1, new Attributes(1, 1, 1));
        hero.equipArmor(armor);

        assertEquals(hero.getEquippedArmors().get(Slot.Body), armor);
    }

    @Test
        //test if weapon gets equipped
    void testEquipWeapon() {
        Weapon weapon = new Weapon("Dagger", 1, Dagger, 2, 2);
        Hero hero = new Rogue("Dean" );
        hero.equip(weapon);

        assertEquals(hero.getEquippedWeapon().get(Slot.Weapon), weapon);
    }

}