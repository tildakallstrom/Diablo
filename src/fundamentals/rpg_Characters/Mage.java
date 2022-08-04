package fundamentals.rpg_Characters;

import fundamentals.items.weapons.WeaponType;

public class Mage extends Hero {


    public Mage(String name, int level, Attributes totalPrimaryAttributes) {
        super(name,
                level,
                new Attributes(1, 1, 8),
                totalPrimaryAttributes,
                new WeaponType[]{WeaponType.Staff, WeaponType.Wand});
    }

    @Override
    public void levelUp() {
        setBasePrimaryAttributes(new Attributes(
                getBasePrimaryAttributes().getStrength() + 1,
                getBasePrimaryAttributes().getDexterity() + 1,
                getBasePrimaryAttributes().getIntelligence() + 5));
    }
}
