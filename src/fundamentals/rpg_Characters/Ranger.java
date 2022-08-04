package fundamentals.rpg_Characters;

import fundamentals.items.weapons.WeaponType;

public class Ranger extends Hero{
    public Ranger(String name, int level, Attributes totalPrimaryAttributes) {
        super(name,
                level,
                new Attributes(1, 7, 1),
                totalPrimaryAttributes,
                new WeaponType[]{WeaponType.Bow});
    }

    @Override
    public void levelUp() {
        setBasePrimaryAttributes(new Attributes(
                getBasePrimaryAttributes().getStrength() + 1,
                getBasePrimaryAttributes().getDexterity() + 7,
                getBasePrimaryAttributes().getIntelligence() + 1));
    }
}
