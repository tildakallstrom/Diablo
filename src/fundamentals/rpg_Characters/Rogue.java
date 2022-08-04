package fundamentals.rpg_Characters;

import fundamentals.items.weapons.WeaponType;

public class Rogue extends Hero{

    public Rogue(String name, int level, Attributes totalPrimaryAttributes) {
        super(name,
                level,
                new Attributes(2, 6, 1),
                totalPrimaryAttributes,
                new WeaponType[]{WeaponType.Dagger, WeaponType.Sword});
    }

    @Override
    public void levelUp() {
        setBasePrimaryAttributes(new Attributes(
                getBasePrimaryAttributes().getStrength() + 1,
                getBasePrimaryAttributes().getDexterity() + 4,
                getBasePrimaryAttributes().getIntelligence() + 1));
    }
}
