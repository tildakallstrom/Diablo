package fundamentals.rpg_Characters;

import fundamentals.items.Slot;
import fundamentals.items.armor.Armor;
import fundamentals.items.armor.ArmorType;
import fundamentals.items.weapons.Weapon;
import org.junit.jupiter.api.Test;

import static fundamentals.items.weapons.WeaponType.Axe;
import static fundamentals.items.weapons.WeaponType.Dagger;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
        //check if level up works
    void testLevelUp() {
        Hero hero = new Warrior("Warren");
        hero.levelUp();

        int expected = 2;
        assertEquals(expected, hero.getLevel());
    }

    @Test
        //test if character dps increases with equipped weapon
    void testCharacterDPS() {
        Weapon axe = new Weapon("Axe", 1, Axe, 2, 2);
        Hero hero = new Warrior("Warren");

        hero.equip(axe);

        float expected = 4.2f;

        assertEquals(hero.characterDPS(), expected);
    }

    @Test
        //check if hero gets higher attributes with higher level
    void testAttributes() {
        Hero hero = new Warrior("Warren");
        hero.levelUp();

        Attributes expected = new Attributes(8, 4, 2);
        assertEquals(expected.getStrength(), hero.totalAttributes().getStrength());
        assertEquals(expected.getDexterity(), hero.totalAttributes().getDexterity());
        assertEquals(expected.getIntelligence(), hero.totalAttributes().getIntelligence());
    }


    @Test
        //test if attributes change with armor
    void testAttributesArmor() {
        Hero hero = new Warrior("Warren");
        Armor armor = new Armor(ArmorType.Plate, "Armor", Slot.Body, 1, new Attributes(1, 1, 1));
        hero.equipArmor(armor);

        Attributes expected = new Attributes(6, 3, 2);
        assertEquals(expected.getStrength(), hero.totalAttributes().getStrength());
        assertEquals(expected.getDexterity(), hero.totalAttributes().getDexterity());
        assertEquals(expected.getIntelligence(), hero.totalAttributes().getIntelligence());
    }

    @Test
        //test if character dps gets higher with every level
    void testHigherLvlDPS() {
        Hero hero = new Warrior("Warren");
        hero.levelUp();

        float expected = 1.08f;
        assertEquals(expected, hero.characterDPS());
    }

    @Test
        //test if armor gets equipped
    void testEquipArmor() {
        Hero hero = new Warrior("Warren");
        Armor armor = new Armor(ArmorType.Mail, "Armor", Slot.Body, 1, new Attributes(1, 1, 1));
        hero.equipArmor(armor);

        assertEquals(hero.getEquippedArmors().get(Slot.Body), armor);
    }

    @Test
        //test if weapon gets equipped
    void testEquipWeapon() {
        Weapon weapon = new Weapon("Axe", 1, Axe, 2, 2);
        Hero hero = new Warrior("Warren");
        hero.equip(weapon);

        assertEquals(hero.getEquippedWeapon().get(Slot.Weapon), weapon);
    }
}