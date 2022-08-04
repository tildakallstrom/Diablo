package fundamentals.rpg_Characters;

import fundamentals.items.weapons.WeaponType;

public class Warrior extends Hero{

    public Warrior(String name, int level, Attributes totalPrimaryAttributes) {
        super(name,
                level,
                new Attributes(5, 2, 1),
                totalPrimaryAttributes,
                new WeaponType[]{WeaponType.Axe, WeaponType.Hammer, WeaponType.Sword});
    }

    @Override
    public void levelUp() {
        setBasePrimaryAttributes(new Attributes(
                getBasePrimaryAttributes().getStrength() + 3,
                getBasePrimaryAttributes().getDexterity() + 2,
                getBasePrimaryAttributes().getIntelligence() + 1));
    }

}
