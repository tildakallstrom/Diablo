package fundamentals.rpg_Characters;

import fundamentals.items.armor.ArmorType;
import fundamentals.items.weapons.Weapon;
import fundamentals.items.weapons.WeaponType;

public class Mage extends Hero {


    public Mage(String name) {
        super(name,
                new Attributes(1, 1, 8),
                new WeaponType[]{WeaponType.Staff, WeaponType.Wand},
                new ArmorType[]{ArmorType.Cloth});
    }

    @Override
    //level up the character
    public void levelUp() {
        super.levelUp();
        //set new attributes
        setBasePrimaryAttributes(new Attributes(
                //base strength + 1 for every level
                getBasePrimaryAttributes().getStrength() + 1,
                getBasePrimaryAttributes().getDexterity() + 1,
                getBasePrimaryAttributes().getIntelligence() + 5));
    }

    @Override
    public float characterDPS() {
        if (weapon == null) {
            return (1 + totalAttributes().getIntelligence() / 100f);
        } else {
            return weapon.getDPS() * (1 + totalAttributes().getIntelligence() / 100f);
        }
    }
}
