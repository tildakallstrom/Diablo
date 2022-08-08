package fundamentals.rpg_Characters;

import fundamentals.items.Slot;
import fundamentals.items.armor.Armor;
import fundamentals.items.armor.ArmorType;
import org.junit.jupiter.api.Test;

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
        //check if hero gets higher attributes with higher level
    void testAttributes() {
        Hero hero = new Warrior("Warren");
        hero.levelUp();

        Attributes expected = new Attributes (8, 4, 2);
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

        Attributes expected = new Attributes (6, 3, 2);
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
}